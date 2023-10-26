package coloquiotomi;

import java.util.Random;

public class Coches {

    int Numero, Asientos;
    String Modelo, Patente;

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

    
    
    
    public void NumeroCoche() {
        int[] lista = new int[10];
        Random alazar = new Random();
        
        int ananache;
        ananache = 0;

        while (ananache < 10) {
            int NumRandom = alazar.nextInt(100)+ 1 ;
            if ((NumRandom % 3 == 0) && NumRandom != lista[ananache]
                    ) {
                lista[ananache] = NumRandom;
                ananache++;
            }
        }
      for (int j=0; j <=9; j++){
          System.out.println("Coche nº " + lista[j]);
      }
        
        /* int[] lista = new int[10];
        Random alazar = new Random();
 
        for (int i = 0; i < 10; i++) {
            int Autito = alazar.nextInt(100) + 1;
            int Multiplo3 = (Autito / 3) * 3;
            lista[i] = Multiplo3;
                
                   while (i < 10) {
            int numeroAleatorio = alazar.nextInt(100);  // Genera un número aleatorio entre 0 y 99
            if (numeroAleatorio % 3 == 0) {  // Comprueba si es un múltiplo de 3
                lista[i] = numeroAleatorio;
                i++;
            }
        }         
        }*/
 
    
    }
    
}
