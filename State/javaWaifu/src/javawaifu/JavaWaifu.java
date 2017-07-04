/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawaifu;

/**
 *
 * @author stiago
 */
public class JavaWaifu {

    
    
    public static void main(String[] args) {
        // esta instancia esta para poder usar los metodos de esta clase, nada mas
        JavaWaifu a = new JavaWaifu();
        
        // instanciamos nuestra waifu con sus respectivos estados
        Waifu javaChan = new Waifu();
        
        Feliz feliz = new Feliz();
        Enojada enojada = new Enojada();
        Triste triste = new Triste();
        
        
        
        //aqui cambiamos su estado
        //-------------- Feliz ------------//
        
        //a.hacerFeliz(javaChan,feliz);
        
        //-------------- Enojada ----------//
        
        //a.enojar(javaChan, enojada);
        
        //-------------- Triste -----------//
        
        //a.entrsitecer(javaChan, triste);
        
        /*
        ahora descomenta alguno de los anteriores estados 
        Linea 32
        o
        Linea 36
        o
        Linea 40
        y descomenta alguna de las siguentes preguntas para interactuar con tu waifu
        */
        
        /*
        System.out.println("Tu: ¿como estás?");
        javaChan.preguntarComoEsta();
        */
        
        /*
        System.out.println("Tu: ¿que horas es?");
        javaChan.preguntarPorLahora();
        */
        
        /*
        System.out.println("Tu: ¿que vas a hacer mas tarde?");
        javaChan.preguntarQueVaAHacerMasTarde();
        */
        
    }
    
    /*
    Estos metodos solo los puse para tener dialogos cuando la waifu cambie de estado
    la linea importante de estos metodos es la que dice:
    javaChan.setEstado(<Estado>);
    si quisieras pudieces poner esta linea en el main para cambiar el estado y ya
    */
    
    public void enojar(Waifu javaChan,Enojada enojoada){
        System.out.println("Tu: C es mejor lenguaje de programacion");
        System.out.println("Waifu;  D: ");
        //esto es solo para que espere 5 segundos, y dar dramatismo
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        
        javaChan.setEstado(enojoada);
        
        System.out.println("Waifu: >:( ");
    }
    
    public void entrsitecer(Waifu javaChan,Triste Triste){
        System.out.println("Tu: ¿por que heres tan lenta?");
        System.out.println("Waifu;  D,: ");
        
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        
        javaChan.setEstado(Triste);
        
        System.out.println("Waifu: No es mi culpa :,( ");
    }
    
    public void hacerFeliz(Waifu javaChan,Feliz feliz){
        System.out.println("Tu: ¿quien es la waifu en el lenguaje de programcion mas bella... Tu?");
        
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        
        System.out.println("Waifu:  :D ");
        javaChan.setEstado(feliz);
    }
}
