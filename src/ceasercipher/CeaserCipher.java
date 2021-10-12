package ceasercipher;

import java.util.Scanner;

public class CeaserCipher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your message");
        String message = input.nextLine();
        System.out.println("input your key");
        int key = input.nextInt();

        System.out.println(cipher(message, key));
    }

    static String cipher(String msg, int shift) {
        String s = "";
        for (int x = 0; x < msg.length(); x++) {
            char c = (char) (msg.charAt(x) + shift);
            if (c > 'z') {
                s += (char) (msg.charAt(x) - (26 - shift));
            } else {
                s += (char) (msg.charAt(x) + shift);
            }
        }
        return s;
    }
}
