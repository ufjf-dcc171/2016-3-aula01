package br.ufjf.dcc171;

public class Principal {

   public static void main(String[] args) {
      Livro l1 = new Livro("Java como programar", "João da Silva",1967, 50, 123.45);
      Livro l2 = new Livro("Java como programar: o retorno da função", "João da Silva", 1972, 56, 73.45);
      Livro l3 = new Livro("Java como programar: o bug contra ataca", "João da Silva", 1976, 156, 173.45);
      System.out.println("Livros disponíveis:");
      System.out.println(l1.getTitulo());
      System.out.print(" (" + l1.getAno() + ") ");
      System.out.print(l1.getPaginas() + "pg. ");
      System.out.println("R$" + l1.getPreco());
      System.out.printf("%s\n (%d) %dpg. R$%.2f\n",
              l2.getTitulo(), l2.getAno(),
              l2.getPaginas(), l2.getPreco()
      );
      System.out.println(l3);
   }

}
