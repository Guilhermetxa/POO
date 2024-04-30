package atividade1;

import atividade1.Imovel;
import atividade1.Municipio;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI {

    private JFrame frame;
    private Municipio municipio;

    // Construtor
    public GUI() {
        municipio = new Municipio();
        initialize();
    }

    // Método para inicializar a interface gráfica
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Sistema de Multas Municipais");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel(new BorderLayout());

        // Criação do painel superior com botões
        JPanel panelBotoes = new JPanel();
        JButton btnInserirImovel = new JButton("Inserir Imóvel");
        JButton btnVisualizarImoveis = new JButton("Visualizar Imóveis");
        panelBotoes.add(btnInserirImovel);
        panelBotoes.add(btnVisualizarImoveis);

        // Criação do painel central com tabela
        JPanel panelTabela = new JPanel(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Nome do Proprietário", "Matrícula", "Meses Atrasados", "Imposto", "Multa", "Total"}, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panelTabela.add(scrollPane, BorderLayout.CENTER);

        // Adiciona os painéis ao painel principal
        panel.add(panelBotoes, BorderLayout.NORTH);
        panel.add(panelTabela, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);

        // Listener para o botão Inserir Imóvel
        btnInserirImovel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inserirImovel();
            }
        });

        // Listener para o botão Visualizar Imóveis
        btnVisualizarImoveis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarImoveis(model);
            }
        });
    }

    // Método para inserir um novo imóvel
    private void inserirImovel() {
        String matricula = JOptionPane.showInputDialog(frame, "Digite a matrícula do imóvel:");
        String nomeProprietario = JOptionPane.showInputDialog(frame, "Digite o nome do proprietário:");
        double imposto = Double.parseDouble(JOptionPane.showInputDialog(frame, "Digite o valor do imposto:"));
        int mesesAtraso = Integer.parseInt(JOptionPane.showInputDialog(frame, "Digite o número de meses atrasados:"));

        Imovel imovel = new Imovel(matricula, nomeProprietario, imposto, mesesAtraso);
        municipio.cadastrarImovel(imovel);

        JOptionPane.showMessageDialog(frame, "Imóvel inserido com sucesso!");
    }

    // Método para visualizar todos os imóveis
    private void visualizarImoveis(DefaultTableModel model) {
        // Limpa a tabela
        model.setRowCount(0);

        List<Imovel> imoveis = municipio.getImoveis();
        for (Imovel imovel : imoveis) {
            double multa = municipio.calcularMulta(imovel);
            double total = imovel.getImposto() + multa;
            model.addRow(new Object[]{imovel.getNomeProprietario(), imovel.getMatricula(), imovel.getMesesAtraso(),
                    imovel.getImposto(), multa, total});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}