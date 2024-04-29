
package atividade1;

public class Atividade1 {

    public static void main(String[] args) {
      
   Municipio m = new Municipio();
   
   Imóvel i = new Imóvel(InOut.leString("digite a matricula:"), InOut.leString("digite o nome do proprietário:"), InOut.leDouble("digite o imposto:"), InOut.leInt("digite os meses de atraso:"), InOut.leDouble("digite o valor da multa:"));
   i.matricula = "1";
   
   
   m.cadastrarImovel(i);
   
    m.calcularMulta(0);
    
     Imóvel e = new Imóvel(InOut.leString("digite a matricula:"), InOut.leString("digite o nome do proprietário:"), InOut.leDouble("digite o imposto:"), InOut.leInt("digite os meses de atraso:"), InOut.leDouble("digite o valor da multa:"));
   e.matricula = "2";
   
   
   m.cadastrarImovel(e);
   
    m.calcularMulta(1);
   
  
   
   
  
   
   
   
        
        
        
        
        
}
}

