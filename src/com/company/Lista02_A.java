package com.company;

import java.util.Scanner;

public class Lista02_A {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int folhas;
        float valor;

        System.out.print("Insira a quantidade de folhas: ");
        folhas = leia.nextInt();

        if (folhas <= 100) {
            valor = folhas*0.25f;
            System.out.print("O total de "+folhas+" é de R$"+valor);
        } else {
               valor = folhas*0.20f;
               System.out.print("O total de "+folhas+" é de R$"+valor);
        }
    }
}