package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Aula 
{
    public static void main( String[] args ){
        String nome;
        int idade;
        double peso;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite o seu nome:");
        nome = ler.next();

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();

        System.out.println("Digite seu peso:");
        peso = ler.nextDouble();

        System.out.println("\n");
        System.out.println("Bem vindo " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Seu peso: " + peso);
    }
}
