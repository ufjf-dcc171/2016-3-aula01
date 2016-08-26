package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAlternativo {

   public static void main(String[] args) {
      List<Livro> livros = new ArrayList<>();

      livros.add(new Livro("Java como programar", "João da Silva", 1967, 50, 123.45));
      livros.add(new Livro("Java como programar: o retorno da função", "João da Silva", 1972, 56, 73.45));      livros.add(new Livro("Java como programar: o bug contra ataca", "João da Silva", 1976, 156, 173.45));

      for (Livro livro : livros) {
         System.out.println(livro);
      }
   }

}
