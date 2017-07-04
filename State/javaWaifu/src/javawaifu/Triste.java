/*
Lo que es Feliz.java, Enojada.java y Triste.java son los estados, que lo que hacen es sobre-escribir
las funciones en cada uno de los estados, estos estados junto a la interfaz son la base de el patron state
ya que asi nos ahorramos el usar variables y una infinidad de condicionales en el codigo.
 */
package javawaifu;

/**
 *
 * @author stiago
 */
public class Triste implements Estado{
    @Override
    public void preguntarComoEsta(){
        System.out.println(":,(");
    }
    public void preguntarPorLahora(){
        
        System.out.println("Es hora de que me cambies por alguien mas joven y mejor que yo");
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        System.out.println("He escuchado mucho sobre una jovencita llamada javaScript :,(");
        
    }
    public void preguntarQueVaAHacerMasTarde(){
        System.out.println("Desinstalare java de este computador");
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        System.out.println("para que no me tengas que ver de nuevo :,(");
    }
}
