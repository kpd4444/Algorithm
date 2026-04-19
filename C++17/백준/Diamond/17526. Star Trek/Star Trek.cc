#include<bits/stdc++.h>
using namespace std;
using ll = long long;
struct Line {
    mutable ll k, m, p;    // kx + m
    bool operator<(const Line& o) const { 
        return k < o.k; 
    }
    bool operator<(ll x) const { return p < x; }
};

struct LineContainer : multiset<Line, less<>> {
    // (for doubles, use inf = 1/.0, div(a,b) = a/b)
    const ll inf = LLONG_MAX;
    ll div(ll a, ll b) { // floored division
        return a / b - ((a ^ b) < 0 && a % b);
    }
    bool isect(iterator x, iterator y) {
        if (y == end()) { x->p = inf; return false; }
        if (x->k == y->k) x->p = x->m > y->m ? inf : -inf;
        else x->p = div(y->m - x->m, x->k - y->k);
        return x->p >= y->p;
    }
    void add(ll k, ll m) {
        auto z = insert({ k, m, 0 }), y = z++, x = y;
        while (isect(y, z)) z = erase(z);
        if (x != begin() && isect(--x, y)) isect(x, y = erase(y));
        while ((y = x) != begin() && (--x)->p >= y->p)
            isect(x, erase(y));
    }
    ll query(ll x) {
        assert(!empty());
        auto l = *lower_bound(x);
        return l.k * x + l.m;
    }
};
int N;
ll dist[100005];
ll wait[100005], velo[100005];
ll ans[100005];

ll bias(int idx) {
    return ans[idx] + wait[idx] - dist[idx] * velo[idx];
}

int main() {
    cin.tie(nullptr); ios::sync_with_stdio(false);
    cin >> N;
    for (int i = 2; i <= N; ++i) {
        ll x; cin >> x; dist[i] = dist[i - 1] + x;
    }
    for (int i = 1; i < N; ++i) cin >> wait[i] >> velo[i];
    ans[1] = 0;
    LineContainer lines;
    lines.add(-velo[1], -bias(1));
    for (int i = 2; i <= N; ++i) {
        ll x = lines.query(dist[i]);
        ans[i] = -x;
        lines.add(-velo[i], -bias(i));
    }
    cout << ans[N] << '\n';
    return 0;
}