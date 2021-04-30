package net.stevencai.encryption;

import java.util.Arrays;

public class DigraphicHillCipher {
    public static String encrypt(int[][] key, String plainText){

        int group = 2;
        int index = 0;
        for(int i = 0; i< plainText.length(); i++){
            System.out.print((plainText.charAt(i) - 'A') +" ");
        }
        for(int i = 0 ;i < plainText.length() % group; i++){
            System.out.print(23 +" ");
        }
        System.out.println();
        StringBuilder str = new StringBuilder();
        while(index < plainText.length()){
            int [] p = new int[group];
            Arrays.fill(p, 23);
            for(int i = 0;i < group; i++){
                p[i] = plainText.charAt(index++) - 'A';
                if(index == plainText.length()){
                    break;
                }
            }
            p = matrixMultiply(key, p);
            for(int n : p){
                System.out.print(n+" ");
                str.append((char)(n+'A'));
            }

        }
        System.out.println();
        return str.toString();
    }


    private static int[] matrixMultiply(int[][] key, int[] p){
        int[] result = new int[p.length];
        for(int i = 0;i < key.length;i++){
            int sum = 0;
            for(int j = 0;j < key[i].length; j++){
                sum += key[i][j] * p[j];
            }
            result[i] = sum % 26;
        }
        return result;
    }

    private static int[][] matrixInverse(int[][] matrix){
        int detI = inverse(matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0], 26);
        System.out.println("Inverse of det: "+detI);
        int[][]ret = new int[2][2];
        ret[0][0] = matrix[1][1];
        ret[1][1] = matrix[0][0];
        ret[0][1] = - matrix[0][1];
        ret[1][0] =-matrix[1][0];
        for(int i = 0;i < 2; i++){
            for(int j = 0; j < 2; j++){
                ret[i][j] = (ret[i][j] * detI % 26 + 26) % 26;
            }
        }
        return ret;
    }
    private static int inverse(int n, int m){

        n = n % m;
        n = (n+ m) % m;
        System.out.println("Det is: "+n);
        int x = 1;
        while(true){
            if(n * x % m == 1){
                return x;
            }
            x++;
        }
    }
    public static void main(String[] args) {
        String plainText = "BEWAREOFTHEMESSENGER";
        int[][] key = {
                {3,10},
                {9, 7}
        };
        System.out.println(encrypt(key, plainText));
        int[][] key2 = {
                {23,3},
                {10,25}
        };
        int[][] decryptKey = matrixInverse(key2);
        for(int i = 0;i < 2; i++){
            for(int j =0; j < 2; j++){
                System.out.print(decryptKey[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(encrypt(decryptKey, "UWDMNKQBEK"));
    }
}
