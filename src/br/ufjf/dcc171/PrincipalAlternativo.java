package br.ufjf.dcc171;

public class PrincipalAlternativo {

   public static void main(String[] args) {
      Livro l1 = new Livro("Java como programar", 1967, 50, 123.45F);
      Livro l2 = new Livro("Java como programar: o retorno da função", 1972, 56, 73.45F);
      Livro l3 = new Livro("Java como programar: o bug contra ataca", 1976, 156, 173.45F);
      System.out.println(l1);
      System.out.println(l2);
      System.out.println(l3);
   }

}
