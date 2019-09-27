package com.company;

import java.util.Scanner;

public class Lista01_E {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int vendas;
        double comissao;
        System.out.print("Insira a quantidade de Vendas: ");
        vendas = leia.nextInt();
        comissao = vendas*0.10;
        System.out.print("A comissão de vendas do vendedor é de "+comissao+"%");
    }
}
