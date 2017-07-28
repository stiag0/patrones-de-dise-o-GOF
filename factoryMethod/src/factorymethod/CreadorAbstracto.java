/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
* Clase CreadorAbstracto la cual posee los tipos de archivos y el metodo crear
* esta es una clase abstracta
*
*/
public abstract class CreadorAbstracto
{
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;
    // --------------------------------
     public abstract IArchivo crear(int tipo);
}

