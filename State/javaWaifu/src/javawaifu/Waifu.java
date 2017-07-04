/*
Aqui solo hacemos un metodo para que nuestra waifu cambie de estado y redireccionamos
las funciones preguntas a ese estado (miEstado).
 */
package javawaifu;

/**
 *
 * @author stiago
 */
public class Waifu {
    private Estado miEstado;
    
    public void setEstado(Estado e){
        this.miEstado =e;
    }
    public void preguntarComoEsta(){
        miEstado.preguntarComoEsta();
    }
    public void preguntarPorLahora(){
        miEstado.preguntarPorLahora();
    }
    public void preguntarQueVaAHacerMasTarde(){
        miEstado.preguntarQueVaAHacerMasTarde();
    }
    
}
