
package jogodesenvolvido;


public class General extends Personagens {
    
  
    public void desenhar(){
 
          InOut.MsgDeInformacao("GENERAL:", """
                                      .---.
                                          /_____\\
                                          ( '.' )
                                           \\_-_/_
                                        .-"`'V'//-.
                                       / ,   |// , \\
                                      / /|Ll //Ll|\\ \\
                                     / / |__//   | \\_\\
                                     \\ \\/---|[]==| / /
                                      \\/\\__/ |   \\/\\/
                                       |/_   | Ll_\\|
                                         |`^\"""^`|
                                         |   |   |
                                         |   |   |
                                         |   |   |
                                         |   |   |
                                         L___l___J
                                          |_ | _|
                                    jgs  (___|___)
                                          ^^^ ^^^""");
      
        
        
        }
         
    public void falar(){
        
        InOut.MsgDeInformacao("Falando:", "General pronto para a batalha!");
    
    }
    
    public void correr(){
        
        InOut.MsgDeInformacao("Correndo:", "General correndo!");
        
    }
    
}
    

