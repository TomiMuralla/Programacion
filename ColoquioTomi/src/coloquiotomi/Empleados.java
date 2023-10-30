
package coloquiotomi;

public abstract class Empleados {
    
protected String NombreEmpleado,Puesto;
protected int edad;

//Constructor

 public Empleados(String NombreEmpleado, String Puesto, int edad) {
    this.NombreEmpleado = NombreEmpleado;
    this.Puesto = Puesto;
    this.edad = edad;
}

//Setter y Getters, nose pa que.

    public String getNombreEmpleado() {
        return this.NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getPuesto() {
        return this.Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//Terminan Setters y Getters.

public abstract void MostrarEmpleado();

}
