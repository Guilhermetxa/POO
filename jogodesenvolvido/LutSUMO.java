
package jogodesenvolvido;


public class LutSUMO extends Personagens {
    
    
    public void desenhar(){
    
    InOut.MsgDeInformacao("LUTADOR DE SUMO:", """
                                  __
                                                          ,;.'--'.
                                                           /"/=,=(
                                                           \\(  __/
                                                        ___/    (____
                                                      .'     -  -    '.
                                                     /         v       \\
                                                  __/    ,     |    \\   '-/'_
                                                 {z, ,__/__,__/\\__,_ )__(   z}
                                                  \\>'   (            \\_ `--c/
                                                     _.-'\\_      ,   / \\_
                                                    (      `.______.'    '.
                                                     \\   ,   \\    ( __     )
                                                      \\   )-'-\\__/-'  |   /
                                             snd       |  |          /  .'
                                                      /  ,)         (   \\_
                                                     oooO'           '--Ooo      """);
        
    }
    
    
    public void falar(){
    InOut.MsgDeInformacao("Falando:", "Lutador pronto!");
    }
    
    public void correr(){
        
        InOut.MsgDeInformacao("Correndo:", "Lutador correndo!");
        
    }
    
    
}
