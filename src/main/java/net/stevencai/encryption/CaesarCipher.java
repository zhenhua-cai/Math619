package net.stevencai.encryption;

public class CaesarCipher {
    public static String encrypt(String plainText){
        StringBuilder str= new StringBuilder();
        for(int i = 0; i< plainText.length();i++){
            int index = (plainText.charAt(i) - 'A' + 3) % 26;
            str.append((char)(index +'A'));
        }
        return str.toString();
    }
    public static String decrypt(String cipherText){
        StringBuilder str= new StringBuilder();
        for(int i = 0;i < cipherText.length(); i++){
            System.out.print((cipherText.charAt(i) - 'A')+" ");
        }
        System.out.println();
        for(int i = 0; i< cipherText.length();i++){
            int index = (cipherText.charAt(i) - 'A' + 23) % 26;
            System.out.print(index+" ");
            str.append((char)(index + 'A'));
        }
        System.out.println();
        return str.toString();
    }

    public static void main(String[] args) {
        String plainText = "";
        String cipherText = "LFDPHLVDZLFRQTXHUHG";
        System.out.println(encrypt(plainText));
        System.out.println(decrypt(cipherText));
    }
}
