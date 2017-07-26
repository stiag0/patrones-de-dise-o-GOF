/*
* clase memento la cual se usa para almacenar los estados anterirores
*
*
*/
public class Memento
{
     private String nombre;
     private String apellidos;
    /*
    * constructor de la clase
    */
     public Memento(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
