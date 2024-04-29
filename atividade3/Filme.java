
package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    
    private int idFilme;
    private String titulo;
    private long duracao;
    private String genero;
    private List<Ator> listaAtores;

    public List<Ator> getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(List<Ator> listaAtores) {
        this.listaAtores = listaAtores;
    }

    
    
   
    

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
    
    
    
    public Filme(int idFilme, String titulo, long duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public Filme buscarPorTitulo(String titulo, List<Filme> listaFilmes) {
        for (Filme filme : listaFilmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }

    public List<Filme> buscarPorGenero(String genero, List<Filme> listaFilmes) {
        List<Filme> filmesEncontrados = new ArrayList<>();
        for (Filme filme : listaFilmes) {
            if (filme.getGenero().equalsIgnoreCase(genero)) {
                filmesEncontrados.add(filme);
            }
        }
        return filmesEncontrados;
    }

    public List<Filme> buscarPorAtor(Ator ator, List<Filme> listaFilmes) {
        List<Filme> filmesEncontrados = new ArrayList<>();
        for (Filme filme : listaFilmes) {
            for (Ator atorFilme : filme.getListaAtores()) {
                if (atorFilme.getIdAtor() == ator.getIdAtor()) {
                    filmesEncontrados.add(filme);
                    break;
                }
            }
        }
        return filmesEncontrados;
    }

    // Métodos de Obtenção de Informações

    public String obterDetalhes() {
        String detalhes = "Detalhes do Filme:\n";
        detalhes += " - Título: " + getTitulo() + "\n";
        detalhes += " - Gênero: " + getGenero() + "\n";
        detalhes += " - Duração: " + getDuracao() + " minutos\n";
        detalhes += " - Elenco: " + getListaAtores() + "\n";
        return detalhes;
    }

    public boolean verificarDisponibilidadeEmSessao(Sessao sessao) {
        return sessao.getListaFilmes().contains(this);
    }

   
}
