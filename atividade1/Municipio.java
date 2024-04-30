package atividade1;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private List<Imovel> imoveis = new ArrayList<>(); // Lista para armazenar os imóveis

    // Método para obter a lista de imóveis
    public List<Imovel> getImoveis() {
        return imoveis;
    }

    // Método para cadastrar um novo imóvel na lista
    public void cadastrarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    // Método para calcular a multa com base no índice do imóvel na lista
    public double calcularMulta(int indice) {
        Imovel imovel = imoveis.get(indice); // Obtém o imóvel com base no índice
        return calcularMulta(imovel); // Chama o método de cálculo de multa sobrecarregado
    }

    // Método para calcular a multa com base em um objeto Imovel
    public double calcularMulta(Imovel imovel) {
        double multa = 0;

        // Calcula a multa com base nos meses de atraso
        int mesesAtraso = imovel.getMesesAtraso();
        if (mesesAtraso >= 0 && mesesAtraso <= 5) {
            multa = imovel.getImposto() * 0.01; // 1% do valor do imposto
        } else if (mesesAtraso >= 6 && mesesAtraso <= 8) {
            multa = imovel.getImposto() * 0.023; // 2.3% do valor do imposto
        } else if (mesesAtraso >= 9 && mesesAtraso <= 10) {
            multa = imovel.getImposto() * 0.03; // 3% do valor do imposto
        } else if (mesesAtraso >= 11 && mesesAtraso <= 12) {
            multa = imovel.getImposto() * 0.054; // 5.4% do valor do imposto
        } else if (mesesAtraso > 12) {
            multa = imovel.getImposto() * 0.1; // 10% do valor do imposto
        } else {
            InOut.exibirMensagem("Número de meses inválido.");
        }

        return multa;
    }
}