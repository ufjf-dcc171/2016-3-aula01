package br.ufjf.dcc171;

public class CD {
   private String titulo;
   private String banda;
   private Double preco;

   public CD() {
   }

   public CD(String titulo, String banda, Double preco) {
      this.titulo = titulo;
      this.banda = banda;
      this.preco = preco;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getBanda() {
      return banda;
   }

   public void setBanda(String banda) {
      this.banda = banda;
   }

   public Double getPreco() {
      return preco;
   }

   public void setPreco(Double preco) {
      this.preco = preco;
   }

   @Override
   public String toString() {
      return "CD{" + "titulo=" + titulo + ", banda=" + banda + ", preco=" + preco + '}';
   }
   
}
