package com.company;

import java.util.Scanner;

public class Lista01_C {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float base, altura, area;

        System.out.print("Insira a Base: ");
        base = leia.nextInt();
        System.out.print("E agora insira a Altura: ");
        altura = leia.nextInt();
        area = base*altura/2;
        System.out.print("A Area Total do seu Triângulo é de "+area+" metros quadrados");

    }
}
