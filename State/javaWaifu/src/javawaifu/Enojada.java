/*
Lo que es Feliz.java, Enojada.java y Triste.java son los estados, que lo que hacen es sobre-escribir
las funciones en cada uno de los estados, estos estados junto a la interfaz son la base de el patron state
ya que asi nos ahorramos el usar variables y una infinidad de condicionales en el codigo.
 */
package javawaifu;

/**
 *
 * @author stiag
 */
public class Enojada implements Estado{
    @Override
    public void preguntarComoEsta(){
        
        System.out.println("¿que crees?...");
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        System.out.println("No me molestes >:(");
    }
    public void preguntarPorLahora(){
        System.out.println("ve a preguntarselo a tu waifu en C...");
        try {
        Thread.sleep(5000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
        System.out.println("HO Es cierto");
        System.out.println("C no tiene objetetos");
        System.out.println("y no puedes implementar este patron de diseño");
        System.out.println("asi que ve  y programala tu mismo >:(");
    }
    public void preguntarQueVaAHacerMasTarde(){
        System.out.println("me ire con un programador que si me valore >:(");
    }
}
