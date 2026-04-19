#include<bits/stdc++.h>
#define r int n, int s, int e
#define ll unsigned int
#define N 500001
using namespace std;
 
vector <int> Gr[N], G[N];
ll seg[1 << 20], lz[1 << 20][2];
int top[N], in[N], out[N];
int S[N], P[N], D[N];
int n, q, o, i, j, k;
 
void Init()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    for (cin >> n >> q; i < n - 1; i++)
        cin >> j >> k, Gr[j].push_back(k), Gr[k].push_back(j);
}
void HldDfs1(int p)
{
    S[p] = 1;
    for (int& i : Gr[p])
        if (!S[i])
        {
            D[i] = D[p] + 1;
            P[i] = p;
            HldDfs1(i);
            S[p] += S[i];
            G[p].push_back(i);
            if (S[i] > S[G[p][0]]) swap(G[p][0], G[p].back());
        }
}
void HldDfs2(int p)
{
    in[p] = ++o;
    for (int& i : G[p])
        top[i] = i == G[p][0] ? top[p] : i, HldDfs2(i);
    out[p] = o;
}
void LazyUpdate(r)
{
    if (lz[n][0] == 1 && !lz[n][1]) return;
    seg[n] *= lz[n][0];
    seg[n] += (e - s + 1) * lz[n][1];
    if (s ^ e)
    {
        lz[n << 1][0] *= lz[n][0], lz[n << 1][1] *= lz[n][0], lz[n << 1][1] += lz[n][1];
        lz[n << 1 | 1][0] *= lz[n][0], lz[n << 1 | 1][1] *= lz[n][0], lz[n << 1 | 1][1] += lz[n][1];
    }
    lz[n][0] = 1, lz[n][1] = 0;
}
ll SegUpdate(r, int p, int q, ll k, ll v)
{
    LazyUpdate(n, s, e);
    if (s > q || e < p) return seg[n];
    if (s >= p && e <= q)
    {
        lz[n][0] = k; lz[n][1] = v;
        return LazyUpdate(n, s, e), seg[n];
    }
    int m = (s + e) >> 1;
    return seg[n] = SegUpdate(n << 1, s, m, p, q, k, v) + SegUpdate(n << 1 | 1, m + 1, e, p, q, k, v);
}
ll SegQuery(r, int p, int q)
{
    LazyUpdate(n, s, e);
    if (s > q || e < p) return 0;
    if (s >= p && e <= q) return seg[n];
    int m = (s + e) >> 1;
    return SegQuery(n << 1, s, m, p, q) + SegQuery(n << 1 | 1, m + 1, e, p, q);
}
void HldUpdate(int p, int q, int k, int v)
{
    while (top[p] ^ top[q])
    {
        if (D[top[p]] < D[top[q]]) swap(p, q);
        SegUpdate(1, 1, n, in[top[p]], in[p], k, v);
        p = P[top[p]];
    }
    if (D[p] > D[q]) swap(p, q);
    SegUpdate(1, 1, n, in[p], in[q], k, v);
}
ll HldQuery(int p, int q, ll t = 0)
{
    while (top[p] ^ top[q])
    {
        if (D[top[p]] < D[top[q]]) swap(p, q);
        t += SegQuery(1, 1, n, in[top[p]], in[p]);
        p = P[top[p]];
    }
    if (D[p] > D[q]) swap(p, q);
    return t + SegQuery(1, 1, n, in[p], in[q]);
}
void Solve()
{
    while (q--)
    {
        cin >> o >> i;
        if (o == 1) cin >> j, SegUpdate(1, 1, n, in[i], out[i], 1, j);
        else if (o == 2) cin >> j >> k, HldUpdate(i, j, 1, k);
        else if (o == 3) cin >> j, SegUpdate(1, 1, n, in[i], out[i], j, 0);
        else if (o == 4) cin >> j >> k, HldUpdate(i, j, k, 0);
        else if (o == 5) cout << SegQuery(1, 1, n, in[i], out[i]) << '\n';
        else cin >> j, cout << HldQuery(i, j) << '\n';
    }
}
int main()
{
    Init();
    HldDfs1(1); HldDfs2(1);
    Solve();
}
