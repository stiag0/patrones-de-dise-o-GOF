/*
* clase la cual guarda el Memento o estado anterior
*/
public class Caretaker
{
     private Memento memento;

     public void setMemento(Memento memento) {
        this.memento = memento;
    }

     public Memento getMemento() {
        return this.memento;
    }
}
