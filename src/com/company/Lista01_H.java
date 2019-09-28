package com.company;

import java.util.Scanner;

public class Lista01_H {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

       double salario, reajuste;
       System.out.print("Insira o Salário : R$");
       salario = leia.nextDouble();
       System.out.print("Agora insira o Precental de Reajuste: ");
       reajuste = leia.nextDouble();

       reajuste= salario+salario*(reajuste/100);

       System.out.println("Salário Atual: R$"+salario);
       System.out.println("Salário com Reajuste: R$"+reajuste);
    }
}
