/*
* ejemplo patron memento
*
* el objetivo de este patron es volver a estados anteriores de un objeto
*
* en este se tiene la clase Originator la cual posee atributos y un metodo el cual puede guardar los cambios
*
* en el ejemplo actual se tiene un sujeto con ujn nombre y apellido, este se crea y se altera sus datos
* luego se vuelve a los datos originales 
*
*/
public class Main
{
    public static void main(String[] args)
    {

        //creamos una entidad Originator
        Originator creador = new Originator("Pedro Paulo", "Ramirez");
        //creamos el resguardo de informacion
        Caretaker vigilante= new Caretaker();
        vigilante.setMemento( creador.createMemento() ); //enviamos los datos del ultimo cambio

        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );

        //realizamos cambios en el creador
        creador.setNombre("Cristina");
        creador.setApellidos("Ibarra Molina");
        //mostramos los cambios
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );

        //llamamos el estado anteriro de nombre y apellido
        creador.setMemento( vigilante.getMemento() );
        //mostramos el estado actual
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
    }
}
