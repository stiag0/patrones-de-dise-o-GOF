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
