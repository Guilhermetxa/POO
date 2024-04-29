
package atividade2;

public class Atividade2 {

    public static void main(String[] args) {
        
        Oraculo oraculoMaster = new Oraculo();
        
        Guerreiro g = new Guerreiro("pedro", 0);
        
        oraculoMaster.definirNome("joão");
        g.sortearVidas();
        oraculoMaster.prologoIntroducao("pedro", "joão", 0);
        oraculoMaster.loadLevel01(0);
        oraculoMaster.loadLevel2();
        oraculoMaster.decidirVidaExtra("misericordia");
        oraculoMaster.prologoVencedor("pedro", "joão");
        oraculoMaster.prologoPerdedor("pedro");
               
              
                
        
        
        
        
        
}
}
    
