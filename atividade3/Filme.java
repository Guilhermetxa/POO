// Classe que define um Filme
class Filme {
    private int idFilme;
    private String titulo;
    private long duracao;
    private String genero;

    // Construtor da classe Filme
    public Filme(int idFilme, String titulo, long duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    // Método toString para representar o Filme como uma String
    @Override
    public String toString() {
        return "ID: " + idFilme + ", Título: " + titulo + ", Duração: " + duracao + " minutos, Gênero: " + genero;
    }
}