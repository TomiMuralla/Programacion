package coloquiotomi;

public class Chofers extends Empleados{
    protected String Tipo,Vehiculo;
    protected int idChofer; 
        //Constructor

    public Chofers(String NombreEmpleado, String Puesto, int edad,String Tipo, String Vehiculo, int idChofer) {
        super(NombreEmpleado, Puesto, edad);
        this.Tipo = Tipo;
        this.Vehiculo = Vehiculo;
        this.idChofer = idChofer;
    }

    //Setter y Getters, nose pa que.

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getVehiculo() {
        return this.Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public int getIdChofer() {
        return this.idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    // Termina Setter y Getter


public void MostrarEmpleado(){
System.out.println(
"NombreEmpleado: "+NombreEmpleado+"\n"+
"Puesto: "+ Puesto + "\n"+
"Edad: "+ edad + "\n" +     
"Tipo de Chofer: " + Tipo +"\n"+
"Vehiculo: "+ Vehiculo+"\n"+
"ID Chofer :" + idChofer+"\n");
}

}
