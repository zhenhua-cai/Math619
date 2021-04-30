package net.stevencai.congruence;

public class Inverse {
    public static int inverse(int x, int m){
        int a = x;
        int b = m;
        return 0;
    }
    private static int[] inverse2(int a , int b){
        if(b == 0){
            throw new IllegalArgumentException("Numbers don't have inverse");
        }
        if(b == 1){
            return new int[]{0, 0};
        }

        int[] next = inverse2(b, a % b);
        if(a % b == 1){
            return new int[]{1, -a / b};
        }

        return null;
    }
}
