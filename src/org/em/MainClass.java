package org.em;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notu:");
        int mat = scanner.nextInt();

        System.out.println("Fizik notu:");
        int fizik = scanner.nextInt();

        System.out.println("Kimya notu:");
        int kimya = scanner.nextInt();

        System.out.println("Türkçe notu:");
        int turkce = scanner.nextInt();

        System.out.println("Tarih notu:");
        int tarih = scanner.nextInt();

        System.out.println("Müzik notu:");
        int muzik = scanner.nextInt();

        int ort = (tarih + mat + fizik + kimya + turkce + muzik) / 6;

        if (ort <= 60)
            System.out.println("Sınıfta Kaldı");
        else System.out.println("Sınıfı geçti");
    }
}
