
package jogodesenvolvido;


public class Mago extends Personagens {
    
    
    public void desenhar(){
    
        InOut.MsgDeInformacao("MAGO:", """
                                                _,._      
                                    .||,       /_ _\\\\     
                                   \\.`',/      |'L'| |    
                                   = ,. =      | -,| L    
                                   / || \\    ,-'\\"/,'`.   
                                     ||     ,'   `,,. `.  
                                     ,|____,' , ,;' \\| |  
                                    (3|\\    _/|/'   _| |  
                                     ||/,-''  | >-'' _,\\\\ 
                                     ||'      ==\\ ,-'  ,' 
                                     ||       |  V \\ ,|   
                                     ||       |    |` |   
                                     ||       |    |   \\  
                                     ||       |    \\    \\ 
                                     ||       |     |    \\
                                     ||       |      \\_,-'
                                     ||       |___,,--")_\\
                                     ||         |_|   ccc/
                                     ||        ccc/       
                                     ||                hjm""");
    
    }
    
    
    public void falar(){
        
        InOut.MsgDeInformacao("Falando:", "Mago conjura seus poderes!");
    
    }
    
    public void correr(){
        
        InOut.MsgDeInformacao("Correndo:", "Mago correndo!");
        
    }
    
    public void voar(){
    
    InOut.MsgDeInformacao("Voando:", "Mago voando!");
        
    }
    
    
}
