package ru.stqa.pft.sandbox;


public class Primes {
    public static void main(String[] args) {

    }

    public static Boolean isPrimeFor(int n) {
        for (int i = 2; i < n; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isPrimeForFast(int n) {
        int m = (int) Math.sqrt(n);
        for (int i = 2; i < n / 2; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isPrimeFor(long n) {
        for (long i = 2; i < n; i++) {
            if (i % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isPrimeWhile(int n) {
        int i = 2;
        while (i < n) {
            if (i % n == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static Boolean isPrimeWhile2(int n) {
        int i = 2;
        while (i < n && i % n != 0) {
            i++;
        }
        return i == n;
    }
}
