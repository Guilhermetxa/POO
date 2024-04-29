package atividade1;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    
    private List<Imóvel> imóveis = new ArrayList<>();
    

    public List<Imóvel> getImóveis() {
        return imóveis;
    }

    public void cadastrarImovel(Imóvel i) {

        imóveis.add(i);

    }
    
    public void calcularMulta(int m) {
        
        

   Imóvel ir =  imóveis.get(m);
 
 
        double multa = 0;

        if (ir.mesesAtraso >= 0 && ir.mesesAtraso <= 5) {
            multa = (ir.mesesAtraso * 0.01);
        } else if (ir.mesesAtraso >= 6 && ir.mesesAtraso <= 8) {
            multa = ir.mesesAtraso * 0.023;
        } else if (ir.mesesAtraso >= 9 && ir.mesesAtraso <= 10) {
            multa = ir.mesesAtraso * 0.03;
        } else if (ir.mesesAtraso >= 11 && ir.mesesAtraso <= 12) {
            multa = ir.mesesAtraso * 0.054;
        } else if (ir.mesesAtraso > 12) {
            multa = ir.mesesAtraso * 0.1;
        } else {
            InOut.exibirMensagem("Número de meses inválido.");
            return;
        }

             InOut.exibirMensagem("O valor da multa é: R$" + multa);

    }
}
