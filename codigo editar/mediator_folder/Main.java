public class Main
{
    public static void main(String[] args)
    {

         Mediador m = new Mediador(); //creamos una instancia de la clase Mediator
         Colega cc1 = new ColegaConcreto1( m );
         Colega cc2 = new ColegaConcreto2( m );
         // Agregarlos al objeto centralizador
         m.agregarColega( cc1 );
         m.agregarColega( cc2 );

         // Provocar un cambio en un uno de los elementos
         cc2.comunicar("ColegaConcreto2 ha cambiado!");
    }
}
