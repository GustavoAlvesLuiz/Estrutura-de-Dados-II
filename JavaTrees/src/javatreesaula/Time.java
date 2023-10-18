package javatreesaula;

import java.util.Objects;

public class Time implements Comparable<Time>{
    private int id;
    private String nome;
    
    public Time(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
        public Time(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Time outro){
        return Integer.compare
           (this.id, outro.id);
    }
    @Override
    public String toString(){
            return " Id: " + this.id + " | " + " Nome: " + this.nome;
    }
    
    
}