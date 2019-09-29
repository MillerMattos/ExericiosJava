package com.company;

import java.util.Scanner;

public class Lista02_I {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        float media, recupera, nota1, nota2, nota3;

        System.out.print("Insira o nome do Aluno(a): ");
        nome = leia.nextLine();
        System.out.print("Declare a Nota 1: ");
        nota1 = leia.nextFloat();
        System.out.print("Declare a Nota 2: ");
        nota2 = leia.nextFloat();
        System.out.print("Declare a Nota 3: ");
        nota3 = leia.nextFloat();

        media= (nota1+nota2+nota3)/3;

        if (media>0 && media<=3) {
            System.out.println("Media do Aluno(a) "+nome+" é: "+media);
            System.out.println("O Aluno(a) "+nome+" foi REPORVADO pois a media é inferior à 3.0");
        } else if (media>3 && media<7) {
            System.out.println("Media do Aluno(a) "+nome+" é: "+media);
            recupera= (media-7.0f)*-1;
            System.out.println("O Aluno(a) "+nome+" ficou de RECUPERAÇÃO pois a media é inferior à 7.0");
            System.out.print("O Aluno(a) "+nome+" precisará de "+recupera+" pts para passar na RECUPERAÇÃO");
        } else if (media>=7 && media<=10) {
            System.out.println("Media do Aluno(a) "+nome+" é: "+media);
            System.out.println("O Aluno(a) "+nome+" foi APROVADO por conseguir atingir ou ultrapassar a média 7.0");
        }
    }
}