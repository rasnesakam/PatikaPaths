package org.em;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kenar");
        int kenar1 = scanner.nextInt();

        System.out.println("2. Kenar");
        int kenar2 = scanner.nextInt();

        System.out.println("3. Kenar");
        int kenar3 = scanner.nextInt();

        int u = (kenar1 + kenar2 + kenar3) / 2;

        int alan = (int) Math.sqrt((double)(u * (u - kenar1) * (u - kenar2) * (u - kenar3)));

        System.out.printf("Alan: %d",alan);
    }
}
