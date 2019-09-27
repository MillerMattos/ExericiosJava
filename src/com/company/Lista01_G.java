package com.company;

import java.util.Scanner;

public class Lista01_G {

    public static void main(String[] agrs){
        Scanner leia = new Scanner(System.in);

        float comprimento, largura, area;

        System.out.print("Insira a Largura: ");
        largura = leia.nextFloat();
        System.out.print("Insira o Comprimento: ");
        comprimento = leia.nextFloat();
        area = largura * comprimento;
        System.out.print("A Area total é de: "+area+" m2");
    }
}
