
package atividade1;

   
public class Imóvel {

     String matricula;
     String nomeProprietario;
     double Imposto;
     int mesesAtraso;
     double valorMulta;
     
        public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getImposto() {
        return Imposto;
    }

    public void setImposto(double Imposto) {
        this.Imposto = Imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Imóvel(String matricula, String nomeProprietario, double Imposto, int mesesAtraso, double valorMulta) {
       this.matricula= matricula;
        this.nomeProprietario = nomeProprietario;
        this.Imposto = Imposto;
        this.mesesAtraso = mesesAtraso;
        this.valorMulta = valorMulta;
    }



}
    


    
    


