
package coloquiotomi;

public class ColoquioTomi {

    public static void main(String[] args) {

        Coches Hola = new Coches();
        Hola.NumeroCoche();

        Chofers Chofer1 = new Chofers("Pedro", "Categoria A", 32, "Taxista", "Renault", 12);
        Chofers Chofer2 = new Chofers("Samuel", "Categoria B", 40, "Remis", "Volkswagen", 29);
        Chofer1.MostrarEmpleado();
        Chofer2.MostrarEmpleado();
    }

}