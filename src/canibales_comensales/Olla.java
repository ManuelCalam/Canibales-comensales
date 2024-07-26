/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canibales_comensales;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Olla{
    public int Raciones = 0;
    public final int Capacidad = 10;
    
    public synchronized void Rellenar(){
       while(true){
            while(Raciones == Capacidad){
                try {
                    wait();
                } catch (InterruptedException ex) {

                }
            }
            while(!(Raciones == Capacidad)){
                Raciones++;
                System.out.println("El cocinero agregó una ración, la olla tiene " + Raciones + " racion(es)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            System.out.println("El cocinero avisó que la comida está lista");
            notifyAll();
           
       }
        
    }
    
    public synchronized void Comer(int Canibal){
        Random random = new Random();
        int toEat = random.nextInt(5) + 1;

        while(true){

            
            while(Raciones == 0){
                try {
                    wait();
                } catch (InterruptedException ex) {

                }
            }
            
            
            
            Raciones--;
            System.out.println("El cavernicola " + Canibal + " ha comido. Queda(n) " + Raciones + " racion(es)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
            if(Raciones == 0){
                System.out.println("Se le avisó al cocinero que la olla está vacía");
            }
            
            toEat--;
            
            if(toEat == 0){
                toEat = random.nextInt(5) + 1;
                

                notify();
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Olla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            notifyAll();
            
            
        }
    }
}
