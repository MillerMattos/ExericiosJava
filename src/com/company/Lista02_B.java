package com.company;

import java.util.Scanner;

public class Lista02_B {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int pecas_producao, pecas_defeito;

        System.out.print("Insira o total de peças produzidas: ");
        pecas_producao = leia.nextInt();
        System.out.print("Insira a quantidade de peças defeituosas: ");
        pecas_defeito = leia.nextInt();

        if (pecas_defeito>(0.10*pecas_producao)) {
            System.out.print("A MÁQUINA PRECISA DE MANUTENÇÃO!!!");
        } else if (pecas_defeito<=(0.10*pecas_producao)) {
            System.out.print("A MÁQUINA NÃO PRECISA DE MANUTENÇÃO!!!");
        }
    }
}
