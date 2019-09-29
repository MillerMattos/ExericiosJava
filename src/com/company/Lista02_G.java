package com.company;

import java.util.Scanner;

public class Lista02_G {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num;

        System.out.print("Insira o número 1: ");
        num = leia.nextInt();
        if (num % 2== 0) {
            System.out.print("O número "+num+" é PAR!");
        } else if (num % 2 !=0) {
            System.out.print("O número "+num+" é ÍMPAR!");
        }
    }
}