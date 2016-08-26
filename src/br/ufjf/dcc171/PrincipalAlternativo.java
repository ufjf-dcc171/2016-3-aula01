package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAlternativo {

   public static void main(String[] args) {
      List<Produto> produtos = new ArrayList<>();

      produtos.add(new Livro("Java como programar", "João da Silva", 1967, 50, 123.45));
      produtos.add(new Livro("Java como programar: o retorno da função", "João da Silva", 1972, 56, 73.45));      produtos.add(new Livro("Java como programar: o bug contra ataca", "João da Silva", 1976, 156, 173.45));
      produtos.add(new CD("Exception", "Bonde Java", 20.45));

      for (Produto produto : produtos) {
         System.out.println(produto);
      }
   }

}
