package org.example;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int[] array1 = new int[N];
        int[] array2 = new int[N];

        System.out.println("Digite os elementos do primeiro array:");
        for (int i = 0; i < N; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo array:");
        for (int i = 0; i < N; i++) {
            array2[i] = scanner.nextInt();
        }

        Interpolator interpolator = new ArrayInterpolator();
        int[] interpolatedArray = interpolator.interpolateArray(array1, array2);

        System.out.println("Resultado da interpolação: ");
        for (int num : interpolatedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}