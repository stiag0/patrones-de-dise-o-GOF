/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author stiag
 */
public class Dinero
{
    private double pesos = 0;

    public Dinero() {
    }

    public double getTotalDinero()
    {
        return this.pesos;
    }

     public void sacarDinero( double pesos )
    {
        this.pesos -= pesos;
    }

     public void ingresarDinero( double pesos )
    {
        this.pesos += pesos;
    }
}

