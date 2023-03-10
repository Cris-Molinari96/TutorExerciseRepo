package pack._1.exerciseTutor._concessionaria;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("AAAAA", "Ferrari", " ABC",20.000,50,true);
        Car car2 = new Car("BBBBB", "Porche", " ABC",20.000,40,true);
        Car car3 = new Car("CCCCC", "BMW", " ABC",20.000,40,true);
        Car car4 = new Car("DDDDD", "MERCEDES", " ABC",20.000,40,true);
        Car car5 = new Car("FFFFFF", "AUDI E TRON", " ABC",20.000,40,true);
        Car car6 = new Car("GGGGGG", "FIAT", " ABC",20.000,40,false);
        Car car7 = new Car("HHHHHH", "Maserati", " ABC",1_000_000,30,false);
        Car car8 = new Car("OIIIIII",  "non saprei", " ABC",50.000,25,false);

        List<Car> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(car1,car2,car3,car4,car5,car6));

        Concessionaria roma = new Concessionaria(newList);
        Concessionaria concB = new Concessionaria("concessionaria B", "Via dei platani");
        concB.addCar(car7);
        concB.addCar(car8);

        elettrica(roma);
        priceConcessionaria(roma, concB);
        Set<Car> carsConcessionarie = new HashSet<>();
        priceConcessionarie(roma, concB, carsConcessionarie);
    }

    private static void priceConcessionarie(Concessionaria roma, Concessionaria concB, Set<Car> carsConcessionarie) {
        for (Car c : roma.getAutoInVendita()) {
            carsConcessionarie.add(c);
        }
        for (Car c : concB.getAutoInVendita()) {
            carsConcessionarie.add(c);
        }

        double priceTotalConcessionarie = 0;
        for (Car c : carsConcessionarie) {
            priceTotalConcessionarie += c.getPrezzo();
        }
        System.out.println(Integer.valueOf((int) priceTotalConcessionarie));
    }

    private static void priceConcessionaria(Concessionaria roma, Concessionaria concB) {
        double priceConcessionariaA = 0;
        double priceConcessionariaB = 0;

        for (Car a : roma.getAutoInVendita()  ) {
            priceConcessionariaA += a.getPrezzo();
        }
        for (Car b : concB.getAutoInVendita()){
             priceConcessionariaB += b.getPrezzo();
        }
        if(priceConcessionariaA > priceConcessionariaB){
            System.out.println(priceConcessionariaA + " La concessionaria roma ha prezzi più alti della concessionaria b");
        }else{
            System.out.println("La concessionaria B ha prezzi più alti della concessionaria A");
        }
    }

    private static void elettrica(Concessionaria roma) {
        int numCarElett = 0 ;
        String elettrica = " Elettrica";
        for (Car c : roma.getAutoInVendita()) {
            if(c.isElettrica()){
                numCarElett= numCarElett + 1;
                System.out.println(c.getModello() + elettrica);
            }else{
                System.out.println(c.getModello() + " non elettrica " );
            }
        }
        System.out.println("Numero car elettriche " + numCarElett);
    }

}
