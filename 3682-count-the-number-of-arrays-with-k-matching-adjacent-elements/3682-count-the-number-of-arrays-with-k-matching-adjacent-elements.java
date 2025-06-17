class Solution {
    static final int MOD = 1_000_000_007;
    static final int MAX = 100_005; // since n, m <= 1e5

    long[] fact = new long[MAX];
    long[] invFact = new long[MAX];

    // Precompute factorials and their modular inverses
    void precomputeFactorials(int n) {
        fact[0] = 1;
        for (int i = 1; i <= n; ++i) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[n] = modInverse(fact[n]);
        for (int i = n - 1; i >= 0; --i) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
    }

    // Modular exponentiation
    long pow(long base, int exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) res = res * base % MOD;
            base = base * base % MOD;
            exp >>= 1;
        }
        return res;
    }

    // Modular inverse using Fermat's Little Theorem
    long modInverse(long x) {
        return pow(x, MOD - 2);
    }

    // n choose k modulo MOD
    long comb(int n, int k) {
        if (k < 0 || k > n) return 0;
        return fact[n] * invFact[k] % MOD * invFact[n - k] % MOD;
    }

    public int countGoodArrays(int n, int m, int k) {
        precomputeFactorials(n);
        long ways = comb(n - 1, k); // pick k positions for equal pairs
        ways = ways * m % MOD; // first element
        ways = ways * pow(m - 1, n - 1 - k) % MOD; // "different from previous" spots
        return (int) ways;
    }
}