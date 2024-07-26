/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canibales_comensales;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Canibales_Comensales {
    
    
    public static void main(String[] args) {
        
        
        
        Olla olla = new Olla();
        
        Chef Cocinero = new Chef(olla);
        Cocinero.start();
        
        Canibal[] canibal = new Canibal[5];
        for(int i = 0; i<5; i++){
            canibal[i] = new Canibal(olla, i+1);
            canibal[i].start();
        }
        

    }
    
}
