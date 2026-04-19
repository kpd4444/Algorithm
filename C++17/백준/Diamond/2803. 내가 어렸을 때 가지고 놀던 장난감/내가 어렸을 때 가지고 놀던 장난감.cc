#ifndef ONLINE_JUDGE
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <bits/stdc++.h>
using namespace std;

// ........................macro.......................... //
// [i, n)
#define FOR(i, f, n) for(int (i) = (f); (i) < (int)(n); ++(i))
// [i, n]
#define RFOR(i, f, n) for(int (i) = (f); (i) >= (int)(n); --(i))
#define pb push_back
#define emb emplace_back
#define fi first
#define se second
#define ENDL '\n'
#define sz(A) (int)(A).size()
#define ALL(A) A.begin(), A.end()
#define UNIQUE(c) (c).resize(unique(ALL(c)) - (c).begin())
#define next next9876
#define prev prev1234
typedef vector<int> vi;
typedef vector<vector<int> > vvi;
typedef vector<pair<int, int> > vii;
typedef vector<vector<pair<int, int> > > vvii;
typedef pair<int, int> ii;
typedef pair<int, pair<int, int> > iii;
typedef long long i64;
typedef unsigned long long ui64;
// inline i64 GCD(i64 a, i64 b) { if(b == 0) return a; return GCD(b, a % b); }
inline int getidx(const vi& ar, int x) { return lower_bound(ALL(ar), x) - ar.begin(); } // 좌표 압축에 사용: 정렬된 ar에서 x의 idx를 찾음
inline i64 GCD(i64 a, i64 b) { i64 n; if(a<b) swap(a, b); while(b!=0) { n = a%b; a = b; b = n; } return a; }
inline i64 LCM(i64 a, i64 b) { if(a == 0 || b == 0) return GCD(a, b); return a / GCD(a, b) * b; }
inline i64 CEIL(i64 n, i64 d) { return n / d + (i64)(n % d != 0); }
inline i64 ROUND(i64 n, i64 d) { return n / d + (i64)((n % d)*2 >= d); }
const i64 MOD = 1e9+7;
inline i64 POW(i64 a, i64 n) {
	if(n < 0) return 0;
	i64 ret = 1;
	while(n) { if(n % 2) ret *= a, ret %= MOD; a = a * a, a %= MOD; n /= 2; }
	return ret;
}
void debug_out() { cerr << endl; }
template <typename Head, typename... Tail>
void debug_out(Head H, Tail... T) {
	cerr << " " << to_string(H);
	debug_out(T...);
}
#ifndef ONLINE_JUDGE
#define debug(...) cerr << "[" << #__VA_ARGS__ << "]:", debug_out(__VA_ARGS__)
#else
#define debug(...) 42
#endif

// ....................................................... //

const int MAXN = 1e6, MAXM = 20;
int n, m;
i64 ar[1<<MAXM];
void input() {
	cin >> n >> m;
	FOR(i, 0, n) {
		int nn, k = 0; cin >> nn;
		while(nn--) {
			int x; cin >> x; --x;
			k |= (1 << x);
		}
		++ar[k]; // ar[x]의 초기 값: x인 수들의 개수
	}
}

// 분할 정복은 구간이 정확히 2의 제곱수가 되게 수행한다.
// 이렇게 함으로써, 왼쪽과 오른쪽 구간의 차이는 정확히 2^(len-1) 만큼 난다.
// 즉, 오른쪽 구간의 수들은 왼쪽 구간의 수들에서 (len-1) bit만 켠 것과 같다.
// 또한 재귀 중 ar[x]가 의미하는 바가 달라진다!
// top-down 재귀가 끝나고 난 바로 뒤의 ar[x] = b[x]
// leaf에서 작업이 끝나고 난 바로 뒤의 ar[x] = c[x]
// 모든 과정이 끝나고 난 뒤의 ar[x] = a[x]
void f(int s, int e) {
	// leaf: top-down 재귀의 끝 (c[x] = 2^b[x])
	// 이 시점에 ar[x] = b[x]이다.
	if(s+1 == e) {
		ar[s] = POW(2, ar[s]);
		return;
	}
	// top-down 재귀로 b[x]를 구해나간다.
	int m = (s+e)/2;
	FOR(i, m, e) ar[i] += ar[s+i-m];
	f(s, m), f(m, e);
	// top-down 재귀 끝나고 a[x]를 구하는 과정
	FOR(i, m, e) {
		ar[i] -= ar[s+i-m];
		if(ar[i] < 0) ar[i] += MOD;
	}
}

int solve() {
	f(0, 1 << MAXM);
	cout << ar[(1 << m) - 1] << ENDL;
	return 0;
}

// ................. main .................. //
void execute() {
	input(), solve();
}

int main(void) {
#ifndef ONLINE_JUDGE
	freopen("in.txt", "r", stdin);
	// freopen("out.txt", "w", stdout);
#endif
	cin.tie(0); ios_base::sync_with_stdio(false);
	execute();
	return 0;
}
// ......................................... //