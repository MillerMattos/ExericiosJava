package com.company;

import java.util.Scanner;

public class Lista01_F {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        int quantid1, quantid2, quantid3;
        String produto1, produto2, produto3;
        double total_pagar;

        System.out.println("BEM VINDO AOS SUPERMERCADOS MYLLER'S!!!");
        System.out.print("Por Favor insira o Primeiro Produto: " );
        produto1 = leia.nextLine();
        System.out.print("E agora insira a quantidade referente ao produto1: ");
        quantid1 = leia.nextInt();

        System.out.print("Por Favor insira o Segundo Produto: " );
        produto2 = leia.nextLine();
        System.out.print("E agora insira a quantidade referente ao produto2: ");
        quantid2 = leia.nextInt();

        System.out.print("Por Favor insira o Terceiro Produto: " );
        produto3 = leia.nextLine();
        System.out.print("E agora insira a quantidade referente ao produto: ");
        quantid3 = leia.nextInt();


        total_pagar = ((quantid1*3.50)+(quantid2*4.50)+(quantid3*2.00));

        System.out.println("O Total a Pagar por "+quantid1+" "+produto1+", "+quantid2+" "+produto2+", "+quantid3+" "+produto3+" é de: R$"+total_pagar);
        System.out.print("OBRIGADO PELA PREFERÊNCIA!!!");
        System.out.print("VOLTE SEMPRE!!!");
    }
}
