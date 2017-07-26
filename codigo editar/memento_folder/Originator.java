/*
* clase de la informacion de sujeto
*
*/
public class Originator
{
     private String nombre;
     private String apellidos;
    /*
    * metodo constructor de la clase
    *
    * @parm String nombre y apellidos
    *
    */
     public Originator(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    /*
    * metodo que realiza cambios en los datos  cuando se vuelve al estado anterior
    *
    * @parm Memento posee la informacion del estado anterior
    */
     public void setMemento(Memento m) {
        this.nombre = m.getNombre();
        this.apellidos = m.getApellidos();
    }
    /*
    * metodo que retonra un nuevo memnto
    *
    * @return Memento instancia de la clase
    */
     public Memento createMemento() {
        return new Memento(nombre, apellidos);
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
