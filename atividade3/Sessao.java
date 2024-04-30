public class Sessao {
    private int idFilme;
    private String horario;

    public Sessao(int idFilme, String horario) {
        this.idFilme = idFilme;
        this.horario = horario;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public String getHorario() {
        return horario;
    }
}