package net.stevencai.encryption;

public class AffineTransformation {
    public static String encrypt(String plainText){
        StringBuilder str= new StringBuilder();
        for(int i = 0; i< plainText.length();i++){
            int origin = plainText.charAt(i) - 'A';
            int index = ( 3 * origin + 24) % 26;
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
            int origin = cipherText.charAt(i) - 'A';
            int index = 9 * (origin +2) % 26;
            System.out.print(index+" ");
            str.append((char)(index + 'A'));
        }
        System.out.println();
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(decrypt("RTOLKTOIK"));
    }
}
