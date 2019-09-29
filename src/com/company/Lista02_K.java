package com.company;

import java.util.Scanner;

public class Lista02_K {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codigo;
        float salario, reajuste;

        System.out.println("Escolha um código na tabela abaixo para realizar o reajuste salarial: ");
        System.out.println("| CÓDIGO  |    CARGO    |  PERCENTUAL |");
        System.out.println(" ===================================== ");
        System.out.println("|    1    | Escrituário |     50%     |");
        System.out.println("|    2    | Secretário  |     35%     |");
        System.out.println("|    3    | Caixa       |     20%     |");
        System.out.println("|    4    | Gerente     |     10%     |");
        System.out.println("|    5    | Diretor     | Sem Aumento |");
        System.out.println(" ");
        System.out.print("Agora entre com o Código do Cargo: ");
        codigo = leia.nextInt();

        switch (codigo) {
            case 1 :
                System.out.println("O Cargo escolhido é ESCRITUÁRIO");
                System.out.print("Insira o Salário atual: R$ ");
                salario = leia.nextFloat();
                reajuste = salario+(salario*0.50f);
                System.out.println("Salário Atual: R$ "+salario);
                System.out.println("Reajuste: 50%");
                System.out.println("Salário Reajustado: R$ "+reajuste);
            break;
            case 2 :
                System.out.println("O Cargo escolhido é SECRETÁRIO");
                System.out.print("Insira o Salário atual: R$ ");
                salario = leia.nextFloat();
                reajuste = salario+(salario*0.35f);
                System.out.println("Salário Atual: R$ "+salario);
                System.out.println("Reajuste: 35%");
                System.out.println("Salário Reajustado: R$ "+reajuste);
            break;
            case 3 :
                System.out.println("O Cargo escolhido é CAIXA");
                System.out.print("Insira o Salário atual: R$ ");
                salario = leia.nextFloat();
                reajuste = salario+(salario*0.20f);
                System.out.println("Salário Atual: R$ "+salario);
                System.out.println("Reajuste: 20%");
                System.out.println("Salário Reajustado: R$ "+reajuste);
            break;
            case 4 :
                System.out.println("O Cargo escolhido é GERENTE");
                System.out.print("Insira o Salário atual: R$ ");
                salario = leia.nextFloat();
                reajuste = salario+(salario*0.10f);
                System.out.println("Salário Atual: R$ "+salario);
                System.out.println("Reajuste: 10%");
                System.out.println("Salário Reajustado: R$ "+reajuste);
            break;
            case 5 :
                System.out.println("O Cargo escolhido é DIRETOR");
                System.out.print("Insira o Salário atual: R$ ");
                salario = leia.nextFloat();
                reajuste = salario;
                System.out.println("Salário Atual: R$ "+salario);
                System.out.println("Reajuste: NÃO HÁ REAJUSTE");
                System.out.println("Salário Reajustado: R$ "+reajuste);
            break;
            default:
                System.out.println("CÓDIGO INVÁLIDO!");
        }
    }
}