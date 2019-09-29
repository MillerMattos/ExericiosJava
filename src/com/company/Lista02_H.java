package com.company;

import java.util.Scanner;

public class Lista02_H {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String sexo, nome;
        double altura, peso;

        System.out.print("Insira o sue nome: ");
        nome = leia.nextLine();
        System.out.print("Insira a sua Altura: ");
        altura = leia.nextInt();
        System.out.print("E agora insira o seu sexo: ");
        sexo = leia.nextLine();

        switch (sexo) {
            case "masculino":
                peso= (altura*72.7)-58;
                System.out.print(nome+" o Peso Ideal para a sua Altura e sexo é "+peso+" Kg");
            break;

            case "feminino":
                peso= (altura*62.1)-44.7;
                System.out.print(nome+" o Peso Ideal para a sua Altura e sexo é "+peso+" Kg");
            break;
            default:
                System.out.print("SEXO INVÁLIDO!");
        }
    }
}