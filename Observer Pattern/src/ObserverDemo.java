/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Benitez
 * @version 1.0
 * Clase principal para el patron de diseño Observer 
 *  Se modela la funcionalidad " Independiente " con una abstraccion de " Sujeto "
 *  Se modela la funcionalidad " Depenediente " con una jerarquia de Observadores
 *  El sujeto esta anclado unicamente a la clase base Observer 
 *  El sujeto transmite eventos a todos los observadores registrados
 *  Los observadores "jalan" la informacion que necesitan del sujeto
 *  Se configura el numero y tipo de observadores.
 */

import java.util.*;
public class ObserverDemo {
    
    public static void main(String[]args){
        Subject sub = new Subject();
        // se  configura el numero y el tipo de observadores
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("\nIngrese un numero: ");
            sub.setState(scan.nextInt());
        }
    }
    
}
