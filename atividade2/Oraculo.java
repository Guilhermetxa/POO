
package atividade2;

import java.util.Random;

public class Oraculo {
    
     String nomeO;
     Guerreiro warrior;

    public String getNomeO() {
        return nomeO;
    }

    public void setNomeO(String nome) {
        this.nomeO = nome;
    }

    public Guerreiro getWarrior() {
        return warrior;
    }

    public void setWarrior(Guerreiro warrior) {
        this.warrior = warrior;
    }

    public Oraculo(String nomeO, Guerreiro warrior) {
        this.nomeO = nomeO;
        this.warrior = warrior;
    }
    
   
    public void definirNome(String nomeO) {

        InOut.leString("Nome do Oráculo definido como: ");
    }
    
    
    public String prologoIntroducao(String nomeG, String nomeO, int qtdVidas){
        
        String prologo = "Oh corajoso guerreiro " + nomeG + ", ouça-me com atenção!\n"
                + "Eu sou o Oráculo" + nomeO + "e tenho uma mensagem para você:\n"
                + "Neste mundo cheio de desafios e perigos, você possui " + qtdVidas + " vidas.\n"
                + "Que a sua determinação o guie em sua jornada!";

        InOut.exibirMensagem(prologo);

        return prologo;
     
    }
    
    
    public boolean loadLevel01(int qtdVidas){
    
     Random random = new Random();
     int segredo = random.nextInt(100) + 1;
  
     InOut.exibirMensagem("Bem-vindo ao nível 1 do jogo! O Oráculo escolheu um número entre 1 e 100.");

        
     while (qtdVidas > 0) {
         int palpiteStr = InOut.leInt("Digite seu palpite:");
            int palpite;
            try {
                palpite = palpiteStr;
            } catch (NumberFormatException e) {
                InOut.exibirMensagem("Por favor, digite um número válido.");
                continue;
            }
            if (palpite == segredo) {
                
                InOut.exibirMensagem("Parabéns! Você acertou o número secreto " + segredo + ". Você venceu o nível 1!");
                return true; 
            } else {
                
                qtdVidas--;
                if (palpite < segredo) {
                    InOut.exibirMensagem("Seu palpite foi menor que o segredo. Tente um número maior.");
                } else {
                    InOut.exibirMensagem("Seu palpite foi maior que o segredo. Tente um número menor.");
                }
                
                InOut.exibirMensagem("Você ainda tem " + qtdVidas + " vidas.");
            }
        }

       
        InOut.exibirMensagem("Você perdeu todas as suas vidas. O número secreto era " + segredo + ".");
        return false; 
    
    
    }
    
    
    public static boolean loadLevel2() {
       
        InOut.exibirMensagem("Bem-vindo ao nível 2 do jogo! Vamos jogar PAR ou ÍMPAR.");

        
        String opcao = InOut.leString("Escolha PAR ou ÍMPAR:");
        while (!opcao.equalsIgnoreCase("PAR") && !opcao.equalsIgnoreCase("ÍMPAR")) {
            InOut.exibirMensagem("Opção inválida. Por favor, escolha PAR ou ÍMPAR.");
            opcao = InOut.leString("Escolha PAR ou ÍMPAR:");
        }

        
        int numeroGuerreiro = Integer.parseInt(InOut.leString("Digite um número entre 0 e 5:"));
        while (numeroGuerreiro < 0 || numeroGuerreiro > 5) {
            InOut.leString("Número inválido. Por favor, digite um número entre 0 e 5.");
            numeroGuerreiro = Integer.parseInt(InOut.leString("Digite um número entre 0 e 5:"));
        }

        
        Random random = new Random();
        int numeroOraculo = random.nextInt(6); 

        
        InOut.exibirMensagem("O Guerreiro escolheu: " + numeroGuerreiro);
        InOut.exibirMensagem("O Oráculo escolheu: " + numeroOraculo);

        
        int soma = numeroGuerreiro + numeroOraculo;

       
        boolean somaPar = soma % 2 == 0;

        
        boolean guerreiroGanhou;
        if ((somaPar && opcao.equalsIgnoreCase("PAR")) || (!somaPar && opcao.equalsIgnoreCase("ÍMPAR"))) {
            guerreiroGanhou = true;
        } else {
            guerreiroGanhou = false;
        }

        if (guerreiroGanhou) {
            InOut.exibirMensagem("A soma é " + (somaPar ? "PAR" : "ÍMPAR") + ". O Guerreiro ganhou!");
        } else {
            InOut.exibirMensagem("A soma é " + (somaPar ? "PAR" : "ÍMPAR") + ". O Guerreiro perdeu.");
        }

        return guerreiroGanhou;
    }
    
     public boolean decidirVidaExtra(String misericordia) {
        
        String[] palavras = misericordia.split("\\s+");
        boolean concederVidaExtra = palavras.length > 5;

        if (concederVidaExtra) {
            
            InOut.exibirMensagem("O Oráculo concedeu uma vida extra ao Guerreiro.");
            return true;
        } else {
            
            InOut.exibirMensagem("O Oráculo negou o pedido de vida extra do Guerreiro.");
            return false;
        }
     }
    
   public String prologoVencedor(String nomeG, String nomeO) {
       
        String prologo = "Parabéns, corajoso guerreiro " + nomeG + "!\n"
                + "Você venceu todos os desafios e provou sua bravura perante o Oráculo" +nomeO + "\n"
                + "Agora, um novo caminho se abre diante de você. Que sua jornada seja repleta de vitórias e honra!";

        
        InOut.exibirMensagem(prologo);
        return null;

    }
     
   public String prologoPerdedor(String nomeG) {
        
        String prologo = "Oh, nobre guerreiro " + nomeG + ", embora tenhas enfrentado grandes desafios,\n"
                + "infelizmente a sorte não estava ao teu lado desta vez.\n"
                + "Não desanime, pois cada derrota é uma oportunidade de aprender e crescer.\n"
                + "Que o fogo da tua determinação nunca se apague, e que um novo dia traga novas esperanças.";

       
        InOut.exibirMensagem(prologo);
        return null;

        
    }
     
     
     
     
}
