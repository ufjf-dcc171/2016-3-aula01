package br.ufjf.dcc171;

public interface Produto {

   Double getPreco();

   String getTitulo();

   void setPreco(Double preco);

   void setTitulo(String titulo);

   @Override
   String toString();
   
}
