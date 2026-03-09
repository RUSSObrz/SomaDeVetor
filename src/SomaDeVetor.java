// SomaDeVetor.java
// Autor: João Pedro Freitas de Almeida
// Data: 09/03/2026 00:47

import java.util.Scanner;

public class SomaDeVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Digite 5 números para armazenar no array" +
                "e soma-los.");
        for (int i = 0; i < nums.length; i++) {
            int restantes = nums.length - i;
            System.out.println(restantes + " Números restantes");
            nums[i] = teclado.nextInt();
        }

        int soma = 0;

        for (int valor : nums) {
            soma = soma + valor;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + " + ");
            }
        }
        System.out.print(" = " + soma);

        teclado.close();
    }
}
