/*
En la interfaz Estado.java lo unico que tenemos que hacer es definir las funciones 
que van a cambiar dependiendo de los estados (Feliz.java, Enojada.java, Triste.java).
 */
package javawaifu;

/**
 *
 * @author stiago
 */
public interface Estado {
    public void preguntarComoEsta();
    public void preguntarPorLahora();
    public void preguntarQueVaAHacerMasTarde();
    
    
}
