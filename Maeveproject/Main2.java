package com.example;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in);
        int idade;
        String nome;
    
        System.out.println("Digite seu nome: ");
        nome = escrever.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = escrever.nextInt();

        System.out.println("O nome do usuário é " + nome);
        System.out.println("A idade do usuário é " + idade + " anos");
    }


}