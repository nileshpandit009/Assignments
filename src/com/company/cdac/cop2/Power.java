package com.company.cdac.cop2;

/*
* Based on the property:
* if b is even,
* (a ^ b) % c = ((a ^ b/2) * (a ^ b/2)) % c
* if b is odd,
* (a ^ b) % c = (a * (a ^(b-1)/2)) % c
* where, a is base, b is exponent, c is large number.
* */
public class Power {
    public static void main(String[] args) {
        System.out.println(modExponent(23, 12, 1000000000000000007L));
    }

    private static long modExponent(long x, long n, long mod) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return modExponent((x * x) % mod, n / 2, mod);
        else
            return (x * modExponent((x * x) % mod, (n-1) / 2, mod)) % mod;
    }
}
