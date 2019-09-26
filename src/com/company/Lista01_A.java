package com.company;

import java.util.Scanner;

public class Lista01_A {

    public static void main(String[] args){
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);
    System.out.print("Insira o seu Nome: ");
    nome = sc.nextLine();
    System.out.print("E agora insira a sua Idade: ");
    idade = sc.nextInt();
    System.out.print("Prazer em lhe conhecer "+nome+" soube que você tem "+idade+" anos");
    }
}
