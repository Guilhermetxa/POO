
package jogodesenvolvido;

public class Soldado extends Personagens {
    
    
    public void desenhar(){
        
        InOut.MsgDeInformacao("SOLDADO:", """
                                     .---.
                                    ___ /_____\\
                                   /\\.-`( '.' )
                                  / /    \\_-_/_
                                  \\ `-.-"`'V'//-.
                                   `.__,   |// , \\
                                       |Ll //Ll|\\ \\
                                       |__//   | \\_\\
                                      /---|[]==| / /
                                      \\__/ |   \\/\\/
                                      /_   | Ll_\\|
                                       |`^\"""^`|
                                       |   |   |
                                       |   |   |
                                       |   |   |
                                       |   |   |
                                       L___l___J
                                   jgs  |_ | _|
                                       (___|___)
                                        ^^^ ^^^""");
    
        
        
    }
    
    public void falar(){
    InOut.MsgDeInformacao("Falando:", "Soldado pronto para a batalha!");
    }
    
    public void correr(){
        
        InOut.MsgDeInformacao("Correndo:", "Soldado correndo!");
        
    }
}
