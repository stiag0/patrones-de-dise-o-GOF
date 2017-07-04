/*
Lo que es Feliz.java, Enojada.java y Triste.java son los estados, que lo que hacen es sobre-escribir
las funciones en cada uno de los estados, estos estados junto a la interfaz son la base de el patron state
ya que asi nos ahorramos el usar variables y una infinidad de condicionales en el codigo.
 */
package javawaifu;

/**
 *
 * @author stiagoo
 */
public class Feliz implements Estado {
    @Override
    public void preguntarComoEsta(){
        System.out.println("muy bien, feliz de verte :3");
    }
    public void preguntarPorLahora(){
        long tiempo = System.currentTimeMillis();
        System.out.println(tiempo+"  milisegundos");
    }
    public void preguntarQueVaAHacerMasTarde(){
        System.out.println("Lo que tu quieras, guapo :P");
    }
}
