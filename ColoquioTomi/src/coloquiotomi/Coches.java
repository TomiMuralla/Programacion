package coloquiotomi;

import java.util.Random;

public class Coches {

    int Numero, Asientos;
    String Modelo, Patente;

    public Coches(){
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
     Random alazar2 = new Random();
    String abc ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char letrarandom1 = abc.charAt(alazar2.nextInt(abc.length()));
        char letrarandom2 = abc.charAt(alazar2.nextInt(abc.length()));
    char letrarandom3 = abc.charAt(alazar2.nextInt(abc.length()));
        char letrarandom4 = abc.charAt(alazar2.nextInt(abc.length()));
    
    public void NumeroCoche() {
        Coches lista[] = new Coches[10];
        Random alazar = new Random();
        
        int ananache;
        ananache = 0;


        Random alazar2 = new Random();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   
        while (ananache < 10) {

            lista[ananache] = new Coches(); // Inicializo las variables. (es diferente en un array que en un objeto
                                            // normal.)
            int NumRandom = alazar.nextInt(100) + 1;

            char letrarandom1 = abc.charAt(alazar2.nextInt(abc.length()));
            char letrarandom2 = abc.charAt(alazar2.nextInt(abc.length()));
            char letrarandom3 = abc.charAt(alazar2.nextInt(abc.length()));
            char letrarandom4 = abc.charAt(alazar2.nextInt(abc.length()));
            String letrita1 = String.valueOf(letrarandom1);
            String letrita2 = String.valueOf(letrarandom2);
            String letrita3 = String.valueOf(letrarandom3);
            String letrita4 = String.valueOf(letrarandom4);

            if ((NumRandom % 3 == 0) && NumRandom != lista[ananache].getNumero()) {
                lista[ananache].setNumero(NumRandom);
                lista[ananache].setAsientos(alazar.nextInt(3) + 3); // Crea un random 0, le suma 3, queda 3 puertas,
                                                                    // random 1, le suma 3, queda 4 puertas, random 2,
                                                                    // suma 3, queda 5 puertas.
                lista[ananache].setModelo("Focus X 1." + NumRandom);
                lista[ananache].setPatente(letrita1 + letrita2 + alazar.nextInt(999) + letrita3 + letrita4);
                // letrarandom1 = 'A';
                // letrarandom1 = abc.charAt(alazar2.nextInt(abc.length()));
                ananache++;
            }
        }
        for (int j = 0; j <= 9; j++) {
            // System.out.println("Coche nº " + lista[j]);
            System.out.println("Modelo = " + lista[j].getModelo() + "\n" +
                    "Numero = " + lista[j].getNumero() + "\n" +
                    "Asientos = " + lista[j].getAsientos() + "\n" +
                    "Patente = " + lista[j].getPatente() + "\n");
        }

    }
    
}

/*
 * int[] lista = new int[10];
 * Random alazar = new Random();
 * 
 * for (int i = 0; i < 10; i++) {
 * int Autito = alazar.nextInt(100) + 1;
 * int Multiplo3 = (Autito / 3) * 3;
 * lista[i] = Multiplo3;
 * 
 * while (i < 10) {
 * int numeroAleatorio = alazar.nextInt(100); // Genera un número aleatorio
 * entre 0 y 99
 * if (numeroAleatorio % 3 == 0) { // Comprueba si es un múltiplo de 3
 * lista[i] = numeroAleatorio;
 * i++;
 * }
 * }
 * }
 */
/*
 * La inicialización de variables es diferente cuando se trata de una simple
 * variable en comparación con un arreglo. Para una variable única, puedes
 * inicializarla al crear el objeto, como en el caso que mencionaste:
 * 
 * java
 * Copy code
 * Coches Ford = new Coches();
 * En este caso, la variable Ford es una instancia de la clase Coches, y se
 * inicializa al mismo tiempo que se crea.
 * 
 * Por otro lado, cuando se trata de un arreglo, como en el ejemplo que
 * proporcioné:
 * 
 * java
 * Copy code
 * Coches[] lista = new Coches[10];
 * 
 * for (int i = 0; i < lista.length; i++) {
 * lista[i] = new Coches();
 * }
 * Primero creas el arreglo lista con espacio para 10 elementos, pero los
 * elementos en sí son inicializados como null. Luego, en un bucle, inicializas
 * cada elemento del arreglo como una instancia de la clase Coches utilizando
 * new Coches(). Esto es necesario para que cada elemento del arreglo sea un
 * objeto válido y pueda utilizarse.
 * 
 * La diferencia fundamental es que en el caso de una variable única, el objeto
 * se inicializa al mismo tiempo que se crea, mientras que en el caso de un
 * arreglo, los elementos del arreglo deben inicializarse individualmente
 * después de crear el arreglo.
 */
/*




 * /*
 * abc: Es una cadena de caracteres que contiene las letras del alfabeto. Esta
 * cadena se utiliza como fuente para generar letras aleatorias.
 * 
 * alazar2: Es una instancia de la clase Random que se utiliza para generar
 * números aleatorios.
 * 
 * alazar2.nextInt(abc.length()): Esta parte de la sentencia genera un número
 * aleatorio entre 0 (inclusive) y la longitud de la cadena abc (exclusivo). En
 * otras palabras, devuelve un índice aleatorio dentro de la cadena abc. Este
 * índice se utilizará para acceder a un carácter específico en la cadena.
 * 
 * abc.charAt(...): Luego de generar el número aleatorio, charAt() se utiliza
 * para obtener el carácter en la posición correspondiente en la cadena abc.
 * Esto significa que obtendrás una letra aleatoria de la cadena abc.
 * 
 * char letrarandom4 = ...: Finalmente, la letra aleatoria obtenida se asigna a
 * la variable letrarandom4.
 * 
 * En resumen, esta sentencia elige aleatoriamente una letra de la cadena abc y
 * la asigna a la variable letrarandom4 utilizando un número aleatorio generado
 * por alazar2.nextInt(abc.length()) como índice.
 */