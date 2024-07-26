/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canibales_comensales;

/**
 *
 * @author DELL
 */
public class Chef extends Thread{
    public Olla olla;
    
    public Chef(Olla olla){
        this.olla = olla;
    }
    
    @Override
    public void run(){
        olla.Rellenar();
    }
}
