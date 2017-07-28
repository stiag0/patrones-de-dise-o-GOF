/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/*
* clase principal del ejemplo del patron adapter
*
* este patron conciste en usar clases con interfaces incompatibles
* en este caso la clase dinero posee metodos que la interface IAdaptor posee pero no los implementa
*
*
*/

public class Main
{
    public static void main(String[] args)
    {
        Adaptador conversor = new Adaptador(); //crea una instancia de la clase Adaptor
        //ingresa dinero a la cuenta
        conversor.ingresarDinero( 2000 );
        conversor.ingresarDinero( 5000 );
        conversor.ingresarDinero( 1000 );
        System.out.println( "Total pesos: " + conversor.getSaldo());
    }
}
