import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// Classe que define a interface do cinema
public class CinemaInterface {
    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Sala> salas;
    private List<Filme> filmes;
    private List<Ator> atores;

    // Método principal para iniciar o programa
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CinemaInterface window = new CinemaInterface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Construtor da classe CinemaInterface
    public CinemaInterface() {
        initialize();
        salas = new ArrayList<>();
        filmes = new ArrayList<>();
        atores = new ArrayList<>();
    }

    // Inicializa a interface do cinema
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        JButton btnInserir = new JButton("Inserir");
        panel.add(btnInserir);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Tipo");
        tableModel.addColumn("Informações");

        table = new JTable(tableModel);
        frame.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);

        btnInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inserirDados();
            }
        });
    }

    // Método para inserir dados na interface
    private void inserirDados() {
        int idSala = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Sala:"));
        int numAssentos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de assentos:"));
        String localizacao = JOptionPane.showInputDialog("Informe a localização:");

        Sala sala = new Sala(idSala, numAssentos, localizacao);
        salas.add(sala);

        int idFilme = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Filme:"));
        String titulo = JOptionPane.showInputDialog("Informe o título do Filme:");
        long duracao = Long.parseLong(JOptionPane.showInputDialog("Informe a duração do Filme (em minutos):"));
        String genero = JOptionPane.showInputDialog("Informe o gênero do Filme:");

        Filme filme = new Filme(idFilme, titulo, duracao, genero);
        filmes.add(filme);

        int idAtor = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Ator:"));
        String nomeAtor = JOptionPane.showInputDialog("Informe o nome do Ator:");
        String papelAtor = JOptionPane.showInputDialog("Informe o papel do Ator:");

        Ator ator = new Ator(idAtor, nomeAtor, papelAtor);
        atores.add(ator);

        String horario = JOptionPane.showInputDialog("Informe o horário da Sessão:");

        // Adiciona os dados à tabela
        tableModel.addRow(new Object[]{idSala, "Sala", sala.toString()});
        tableModel.addRow(new Object[]{idFilme, "Filme", filme.toString()});
        tableModel.addRow(new Object[]{idAtor, "Ator", ator.toString()});
        tableModel.addRow(new Object[]{"-", "Sessão", "Horário: " + horario});
    }
}