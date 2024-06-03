
package jogodesenvolvido;

public class JogoDesenvolvido {

    public static void main(String[] args) {
        
        InOut.MsgDeAviso("BATALHA 1", "Iniciando batalha entre General X Dragão");
        
        
        /*BATALHA 1*/
        General gn = new General();
        gn.desenhar();
        gn.falar();
        Faca fc = new Faca();
        fc.usarArma();
        DragaoAlado da = new DragaoAlado();
        da.desenhar();
        da.falar();
        Fogo fg = new Fogo();
        fg.usarArma();
        
        
        gn.correr();
        da.voar();
        fg.usarArma();
        
       InOut.MsgDeInformacao("VITÓRIA:", "DRAGÃO!!!!!!!!!!!");
       
       
       
       InOut.MsgDeAviso("BATALHA 2", "Iniciando batalha entre Mago X Lutador de sumo");
       
       /*BATALHA 2*/
       Mago mg = new Mago();
       mg.desenhar();
       mg.falar();
       Magia ma = new Magia();
       ma.usarArma();
       LutSUMO lt = new LutSUMO();
       lt.desenhar();
       lt.falar();
       Desarmado ds = new Desarmado();
       ds.usarArma();
       lt.correr();
       mg.voar();
       ma.usarArma();
       lt.correr();
       mg.correr();
       ma.usarArma();
        
       InOut.MsgDeInformacao("VITÓRIA:", "MAGO!!!!!!!!!!!");
       
        InOut.MsgDeAviso("", "FIM DE JOGO!!!!!!!");
        
    }
    
    
    
}
