package com.company;

import java.util.Scanner;

public class Lista02_D {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        float base, lado1, lado2;

        System.out.print("Insira a base do triângulo: ");
        base = leia.nextFloat();
        System.out.print("Agora insira o lado do triângulo: ");
        lado1 = leia.nextFloat();
        System.out.print("E por fim insira o último lado do triângulo: ");
        lado2 = leia.nextFloat();

        if (base==lado1 && base==lado2 && lado1==lado2) {
            System.out.print("O TRIÂNGULO É EQUILÁTERO!");
        } else if (base==lado1 || base==lado2 || lado1==lado2) {
            System.out.print("O TRIÂNGULO É ISÓCLES!");
        } else if (base!=lado1 && base!=lado2 && lado1!=lado2) {
            System.out.print("O TRIÂNGULO É ESCALENO!");
        }
    }
}
