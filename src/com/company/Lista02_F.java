package com.company;

import java.util.Scanner;

public class Lista02_F {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira o primeiro número: ");
        num1 = leia.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = leia.nextInt();

        if (num1>num2) {
            System.out.print("O número "+num1+" é maior que "+num2);
        } else if (num2>num1) {
            System.out.print("O número "+num2+" é maior que "+num1);
        }
    }
}
