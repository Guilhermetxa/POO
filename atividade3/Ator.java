// Classe que define um Ator
class Ator {
    private int idAtor;
    private String nome;
    private String papel;

    // Construtor da classe Ator
    public Ator(int idAtor, String nome, String papel) {
        this.idAtor = idAtor;
        this.nome = nome;
        this.papel = papel;
    }

    // Método toString para representar o Ator como uma String
    @Override
    public String toString() {
        return "ID: " + idAtor + ", Nome: " + nome + ", Papel: " + papel;
    }
}