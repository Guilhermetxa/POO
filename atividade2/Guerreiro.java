
package atividade2;

import java.util.Random;


public class Guerreiro {
    
     String nomeG;
     int qtdVidas;
    
    
    public Guerreiro(String nomeG, int qtdVidas) {
        this.nomeG = nomeG;
        this.qtdVidas = qtdVidas;
    }

    
    public String getNomeG() {
        return nomeG;
    }

    public void setNomeG(String nomeG) {
        this.nomeG = nomeG;
    }

    public int getQtdVidas() {
        return qtdVidas;
    }

    public void setQtdVidas(int qtdVidas) {
        this.qtdVidas = qtdVidas;
    }

    
    public String vidaExtra(){
    
        String pedido = InOut.lerString("Digite 'SIM' se deseja uma vida extra:");

        if (pedido != null && pedido.equalsIgnoreCase("SIM")) {
            
            return "Pedido de vida extra recebido. Uma vida extra concedida!";
        } else {
            
            return "Sem pedido de vida extra.";
        }
    
    }
    
    
     public int sortearVidas() {
       
        Random random = new Random();
        
        int qtdVidas = random.nextInt(4) + 9;

        InOut.exibirMensagem("Número de vidas sorteadas para o Guerreiro: " + qtdVidas);

        return qtdVidas;
    }
    
   
    
}
