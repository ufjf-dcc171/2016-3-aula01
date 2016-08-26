package br.ufjf.dcc171;

public class Livro implements Produto {
    private String titulo;
    private String autor;
    private Integer ano;
    private Integer paginas;
    private Double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, Integer ano, Integer paginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.paginas = paginas;
        this.preco = preco;
    }

   @Override
    public String getTitulo() {
        return titulo;
    }

   @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

   @Override
    public Double getPreco() {
        return preco;
    }

   @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }

   @Override  
   public String toString() {
      return titulo + "\n "
              + autor + " (" + ano + ") " + paginas + "pg. R$" + preco;
   }
    
    
}
