
package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    
    private int idSala;
    private String tipoTela;
    private String localizacao;
    private int numAssentos;
    private List<Sessao> listaSessoes;

    
    
    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public void setListaSessoes(List<Sessao> listaSessoes) {
        this.listaSessoes = listaSessoes;
    }
    

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
    

    public Sala(int idSala, int numAssentos, String tipoTela, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
        this.listaSessoes = new ArrayList<>();
    }

    // Métodos para manipulação da sala (CRUD)

    public void adicionarSessao(Sessao sessao) {
        listaSessoes.add(sessao);
    }

    public void removerSessao(Sessao sessao) {
        listaSessoes.remove(sessao);
    }

    public List<Sessao> getListaSessoes() {
        return listaSessoes;
    }

   
    }
    

