package com.company;

import java.util.Scanner;

public class Lista01_D {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        double raio, circunferencia, area, numero;
        final float pi = 3.141f;

         System.out.print("Insira o Raio do círculo: ");
         raio=leia.nextInt();
        circunferencia= pi*Math.pow(raio,2);
        System.out.println("A Circunferência do Círculo com raio = "+raio+" é igual à "+circunferencia+" metros quadrados");
         area= 2*pi*raio;
        System.out.println("A Area do Círculo com raio = "+raio+" é igual à "+area+" metros quadrados");
    }
}
