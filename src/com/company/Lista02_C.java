package com.company;

import java.util.Scanner;

public class Lista02_C {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.print("Informe a IDADE do nadador: ");
        idade = leia.nextInt();

        if (idade>0 && idade<=10) {
            System.out.print("Sua categoria é Infantil");
        } else if (idade>10 && idade<=17) {
            System.out.print("Sua categoria é Juvenil");
        } else if (idade>17) {
            System.out.print("Sua categoria é Senior");
        } else{
            System.out.print("Sua idade é INVÁLIDA!");
        }
    }
}
