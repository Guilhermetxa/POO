// Classe que define uma Sala
class Sala {
    private int idSala;
    private int numAssentos;
    private String localizacao;

    // Construtor da classe Sala
    public Sala(int idSala, int numAssentos, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.localizacao = localizacao;
    }

    // Método toString para representar a Sala como uma String
    @Override
    public String toString() {
        return "ID: " + idSala + ", Assentos: " + numAssentos + ", Localização: " + localizacao;
    }
}