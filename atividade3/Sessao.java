
package atividade3;


import java.util.ArrayList;
import java.util.List;

public class Sessao {
    
    private boolean statusSessao;
    private int idSessao;
    private String horario;
    private double precoIngresso;
    private List<Filme> listaFilmes;

    public void setListaFilmes(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public boolean isStatusSessao() {
        return statusSessao;
    }

    public void setStatusSessao(boolean statusSessao) {
        this.statusSessao = statusSessao;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

   
    

    public Sessao(int idSessao, String horario, boolean statusSessao, double precoIngresso) {
        this.idSessao = idSessao;
      this.horario= horario;
      this.statusSessao= statusSessao;
        this.precoIngresso = precoIngresso;
        this.listaFilmes = new ArrayList<>();
    }

    // Métodos para manipulação da sessão (CRUD)

    public void adicionarFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    public void removerFilme(Filme filme) {
        listaFilmes.remove(filme);
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    
}
