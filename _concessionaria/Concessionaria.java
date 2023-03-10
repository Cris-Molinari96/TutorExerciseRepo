package pack._1.exerciseTutor._concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private String nome ;
    private String indirizzo;
    private List<Car> autoInVendita = new ArrayList<>();

    public Concessionaria(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public Concessionaria(List<Car> autoInVendita) {
        this.autoInVendita = new ArrayList<>( autoInVendita);
    }

    public String getNome() {return nome;}
    public String getIndirizzo() {return indirizzo;}
    public List<Car> getAutoInVendita(){return autoInVendita;}

    public void setIndirizzo(String indirizzo) {this.indirizzo = indirizzo;}

    public void addCar(Car c){
        autoInVendita.add(c);
    }

    public double getPrezzoMedio(){
            int sum = 0 ;
        for (Car c : autoInVendita) {
            sum += c.getPrezzo() ;
        }
            return sum / autoInVendita.size();
    }
}
