package atividade1;

public class Imovel {

    // Atributos da classe Imovel
    private String matricula;
    private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;

    // Construtor da classe Imovel para inicializar os atributos
    public Imovel(String matricula, String nomeProprietario, double imposto, int mesesAtraso) {
        this.matricula = matricula;
        this.nomeProprietario = nomeProprietario;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    // Métodos de acesso aos atributos da classe Imovel
    public String getMatricula() {
        return matricula;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getImposto() {
        return imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }
}