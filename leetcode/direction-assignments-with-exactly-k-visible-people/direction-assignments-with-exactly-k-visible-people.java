class Solution {
    static final int MOD = 1_000_000_007;
    static long[] fact, invFact;

    public int countVisiblePeople(int n, int pos, int k) {
        if (k > n - 1) return 0;

        precompute(n);

        long ans = nCr(n - 1, k);
        ans = (ans * 2) % MOD;

        return (int) ans;
    }

    void precompute(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[n] = power(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
    }

    long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    long power(long base, int exp) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = res * base % MOD;
            base = base * base % MOD;
            exp >>= 1;
        }
        return res;
    }
}