package javarecordscontrol;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Recorde {
        private LocalDate dataRecorde;
        private String nome;
        private double tempo;
        
    public  Recorde(LocalDate data, String nome, double tempo){
        this.dataRecorde=data;
        this.nome = nome;
        this.tempo=tempo;
    }  

    public Recorde() {
    }
    
  

    public LocalDate getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(LocalDate dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }
 
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public String toString() {
     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "Recorde [nome=" + nome + ", dataRecorde=" + format.format(dataRecorde) + ", tempo=" + tempo + " segundos]";
}
            

}
