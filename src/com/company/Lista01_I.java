package com.company;

import java.util.Scanner;

public class Lista01_I {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double valor, desconto, total;
        int quant;
        String produto;

        System.out.print("Entre com o nome do produto: ");
        produto = leia.nextLine();
        System.out.print("Diga a quantidade: ");
        quant = leia.nextInt();
        System.out.print("Informe o preço unitário: R$");
        valor = leia.nextFloat();
        System.out.print("E agora informe o desconto: ");
        desconto = leia.nextInt();

        valor= quant*valor;
        total= valor-valor*(desconto/100);

        System.out.println("Preço Atual: R$"+valor);
        System.out.println("Preço com Desconto: R$"+total);
        System.out.print("O total a pagar por "+quant+" "+produto+" é de R$"+total);
    }
}
