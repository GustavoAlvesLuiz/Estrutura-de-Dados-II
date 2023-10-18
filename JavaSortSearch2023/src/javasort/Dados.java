
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String nomeTime, liga;
   private int gols, cartoesAmarelos, cartoesVermelhos;
   private double chutes;

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public double getChutes() {
        return chutes;
    }

    public void setChutes(double chutes) {
        this.chutes = chutes;
    }
    @Override    
    public int compareTo(Dados outroDado){
      return this.getNomeTime().
              compareTo(outroDado.getNomeTime());
    }
    
    
     @Override
    public String toString(){
        return getNomeTime()+ " : " + getLiga();
    }// fim toString
    
    //equals
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return nomeTime.equals(dados.nomeTime);
    }



    
}
