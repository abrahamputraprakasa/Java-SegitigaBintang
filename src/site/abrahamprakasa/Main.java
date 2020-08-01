package site.abrahamprakasa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.print("Masukkan jumlah panjang bintang yang diinginkan: ");
        Scanner scan = new Scanner(System.in);
        int bintang = scan.nextInt();

        part1(bintang);
        part2(bintang);

    }

    static void part1(int bintang){
        for (int i = 0; i < bintang; i++) {
            for (int j = 0; j <= i; j++){
                if (i != 0 && j != 0 && i != bintang - 1 && j != bintang - 1 && i!=j){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    static void part2(int bintang){
        for (int i = 0; i < bintang; i++) {
            for (int j = bintang - 1; j >= i; j--){
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++){
                if (k == 0 || i == bintang - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int l = 0; l < i - 1; l++) {
                if (l == i - 2 || i == bintang - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
