package net.stevencai.gcd;

public class EuclidGCD {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (min != 0) {
            int t = max % min;
            max = min;
            min = t;
        }
        return max;
    }

    public static int gcd(int... arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("There are less than 2 numbers");
        }
        int gcd = gcd(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        return gcd;
    }

    public static long lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (long) a / gcd * b;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        System.out.println(gcd(a, b));
    }
}
