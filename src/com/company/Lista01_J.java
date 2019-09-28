package com.company;

import java.util.Scanner;

public class Lista01_J {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double cotacao, real;
        System.out.print("Insira o valor em REAL: R$ ");
        real = leia.nextDouble();
        System.out.print("Agora insira a Cotação do DÓLAR: R$ ");
        cotacao = leia.nextDouble();

        cotacao= real/cotacao;

        System.out.print("O valor de R$"+real+" reais para dólar é $"+cotacao);
    }
}
