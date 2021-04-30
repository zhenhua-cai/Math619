package net.stevencai.encryption;

import net.stevencai.gcd.EuclidGCD;

public class ExponentialCipher {
    public static String encrypt(String plainText, int prime,int exp){
        if(EuclidGCD.gcd(prime - 1, exp) != 1){
            throw new IllegalArgumentException();
        }
        int m = findM(prime);
        StringBuilder str = new StringBuilder();
        for(int i = 0; i< plainText.length(); i++){
            int index=  plainText.charAt(i) - 'A';

        }
        return "";
    }
    private static int encryptIndex(int index,int exp, int p){
        int e = 1;

        while(exp > 0){
            if(exp < e){
                return index;
            }
            int pow= (int)(Math.pow(index, e));
            if(pow > p){
                index =pow % p;
                exp %= e;
            }
            else{
                e++;
            }
        }
        return -1;
    }
    private static int findM(int p){
        int m = 25;
        while(true){
            if(p > m && p < m * 100 + 25){
                return m;
            }
            m = m * 100 + 25;
        }
    }
}
