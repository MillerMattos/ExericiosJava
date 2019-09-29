package com.company;

import java.util.Scanner;

public class Lista02_E {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        String nome;
        float nota1, nota2, nota3, nota4, media;
        int faltas;

        System.out.print("Insira o nome do aluno(a): ");
        nome = leia.nextLine();
        System.out.print("Insira a Nota1: ");
        nota1 = leia.nextFloat();
        System.out.print("Insira a Nota2: ");
        nota2 = leia.nextFloat();
        System.out.print("Insira a Nota3: ");
        nota3 = leia.nextFloat();
        System.out.print("Insira a Nota4: ");
        nota4 = leia.nextFloat();
        System.out.print("E agora insira a quantidade de Faltas do Aluno(a) "+nome+": ");
        faltas = leia.nextInt();

        media= (nota1 + nota2 + nota3 + nota4)/4;

        if (faltas > 40) {
            System.out.println("Faltas: "+faltas);
            System.out.println("Limite de Faltas: 40");
            System.out.println("O Aluno(a) "+nome+" foi REPORVADO por ultrapassar o limite de faltas!");
        } else if (media < 6.0f) {
            System.out.println("Media: "+media+" pts");
            System.out.println("Media Mínima: 6.0 pts");
            System.out.println("O Aluno(a) "+nome+" ficou de RECUPERAÇÃO por nao alcançar a média de 6.0 pts");
        } else if (media >= 6.0f) {
            System.out.println("Faltas: "+faltas);
            System.out.println("Limite de Faltas: 40");
            System.out.println("Media: "+media+" pts");
            System.out.println("Media Mínima: 6.0 pts");
            System.out.println("O Aluno(a) "+nome+" foi APROVADO!");
        }
    }
}
