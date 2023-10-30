package coloquiotomi;

import java.util.Random;

public class Coches {

    int Numero, Asientos;
    String Modelo, Patente;
    Random alazar = new Random();
    String[] Marca = { "Volkswagen", "Ford", "Volvo", "Chevrolet", "Nissan", "Audi", "BMW", "Renault", "Fiat",
            "Honda", "Hyundai", "KIA", "Tesla" };
    int marcarandom = alazar.nextInt(12);

    public Coches() {
        this.Numero = Numero;
        this.Asientos = Asientos;
        this.Modelo = Modelo;
        this.Patente = Patente;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getAsientos() {
        return Asientos;
    }

    public void setAsientos(int Asientos) {
        this.Asientos = Asientos;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    // FUNCION RANDOM LETRA

    public String RandomLetraPa() {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasa = String.valueOf(abc.charAt(alazar.nextInt(abc.length())));
        return letrasa;
    }

    public void NumeroCoche() {
        Coches lista[] = new Coches[10];

        int ananache = 0;

        while (ananache < 10) {

            lista[ananache] = new Coches(); // Inicializo las variables. (es diferente en un array que en un objeto
                                            // normal.)
            int NumRandom = alazar.nextInt(100) + 1;

            if ((NumRandom % 3 == 0) && NumRandom != lista[ananache].getNumero()) {
                lista[ananache].setNumero(NumRandom);
                lista[ananache].setAsientos(alazar.nextInt(3) + 3); // Crea un random 0, le suma 3, queda 3 puertas,
                                                                    // random 1, le suma 3, queda 4 puertas, random 2,
                                                                    // suma 3, queda 5 puertas.
                lista[ananache].setModelo(Marca[marcarandom] + " " + "1." + NumRandom);
                lista[ananache].setPatente(
                this.RandomLetraPa() + this.RandomLetraPa() + 
                alazar.nextInt(999)+
                this.RandomLetraPa() + this.RandomLetraPa());

                marcarandom = alazar.nextInt(12);
                ananache++;
            }
        }
        for (int j = 0; j <= 9; j++) {
            System.out.println(
                    "Modelo = " + lista[j].getModelo() + "\n" +
                    "Numero = " + lista[j].getNumero() + "\n" +
                    "Asientos = " + lista[j].getAsientos() + "\n" +
                    "Patente = " + lista[j].getPatente() + "\n");
        }

    }

}