package com.company;

import java.util.Scanner;

public class Lista01_B {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float numero, dobro;

        System.out.print("Insira um Número: ");
        numero = sc.nextInt();
        dobro = numero*2;
        System.out.print("O dobro de "+numero+" é "+dobro);
    }
}
