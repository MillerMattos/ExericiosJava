package com.company;

import java.util.Scanner;

public class Lista02_J {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int  opcao;
        double numero1, numero2;

        System.out.println("Menu de Opções:");
        System.out.println("1- Somar dois números.");
        System.out.println("2- Raiz quadrada de um número");
        System.out.print("Escolha qual das opções acima você deseja executar (1) ou (2): ");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você ecolheu SOMA");
                System.out.print("Insira o primeiro número: ");
                numero1 = leia.nextDouble();
                System.out.print("Agora insira o segundo número: ");
                numero2 = leia.nextDouble();
                numero1= numero1+numero2;
                System.out.print("O resultado é: "+numero1);
            break;

            case 2 :
                System.out.println("Você escolheu RAIZ QUADRADA");
                System.out.print("Insira o número: ");
                numero1 = leia.nextDouble();
                numero1= Math.sqrt(numero1);
                System.out.print("O resultado é: "+numero1);
            break;
            default:
                System.out.print("OPÇÃO INVÁLIDA!!!");
        }
    }
}
