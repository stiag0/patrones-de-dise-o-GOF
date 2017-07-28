/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;
/**
* clase Adapter implementa la interface IAdaptor
*
*
*/
public class Adaptador implements IAdaptador
{
    Dinero cajapesos = new Dinero(); //crea una instancia de la clase Dinero
    public Adaptador() {
    }

    /*
    * metodo el cual retorna el saldo total
    *
    * @return double cantidad de pesos
    */
    public double getSaldo()
    {
         return this.cajapesos.getTotalDinero();
    }

    /*
    * metodo el cual retira dinero a la cuenta
    *
    * @parm double pesos cantidad a retirar
    */
    @Override
    public void sacarDinero( double pesos )
    {
         double peso = pesos / 166.386;
         cajapesos.sacarDinero( peso );
    }

    /*
    * metodo el cual ingresa dinero a la cuenta
    *
    * @parm double pesos cantidad a ingresar a la cuenta
    */
    @Override
     public void ingresarDinero( double pesos )
    {
        double peso = pesos / 166.386;
         cajapesos.ingresarDinero( peso );
    }
}
