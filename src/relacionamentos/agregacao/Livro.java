package relacionamentos.agregacao;

class Livro {
private String titulo;
private String autor;

public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
}

public void mostrarDetalhes() {
    System.out.println("Título: " + titulo + ", Autor: " + autor);
}

public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}
}

