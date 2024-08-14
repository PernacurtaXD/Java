package com.example;

public class Main {
    public static void main(String[] args) {
      Livro livro1 = new Livro("Oceano", "Roberto", 182, 20.69);
      Livro livro2 = new Livro("Morte imparável", "Luis", 205, 40.52);
      

      System.out.println("1º Livro\nTítulo do livro: " + livro1.getTitulo());
      System.out.println("Autor do livro: " + livro1.getAutor());
      System.out.println("Número de páginas do livro: " + livro1.getNumeroDePaginas() + " páginas");
      System.out.println("Preço do livro: R$" + livro1.getPreco());

      System.out.println("\n2º Livro\nTítulo do livro: " + livro2.getTitulo());
      System.out.println("Autor do livro: " + livro2.getAutor());
      System.out.println("Número de páginas do livro: " + livro2.getNumeroDePaginas());
      System.out.println("Preço do livro: R$" + livro2.getPreco());




    }
}