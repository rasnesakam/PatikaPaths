package org.em;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double tutar = scanner.nextDouble();

        double kdv = tutar > 1000 ? 0.08d : 0.18d;

        double part = tutar * kdv;
        double kdvli = tutar + part;

        System.out.printf("KDV'siz fiyat: %f\nKDV'li fiyat: %f\nKDV tutarı: %f\n",tutar,kdvli,part);
    }
}
