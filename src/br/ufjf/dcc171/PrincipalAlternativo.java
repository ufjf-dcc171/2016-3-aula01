package br.ufjf.dcc171;

public class PrincipalAlternativo {

   public static void main(String[] args) {
      Livro l1 = new Livro("Java como programar", "João da Silva", 1967, 50, 123.45);
      Livro l2 = new Livro("Java como programar: o retorno da função", "João da Silva", 1972, 56, 73.45);
      Livro l3 = new Livro("Java como programar: o bug contra ataca", "João da Silva", 1976, 156, 173.45);
      System.out.println(l1);
      System.out.println(l2);
      System.out.println(l3);
   }

}
