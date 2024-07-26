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
public class Canibal extends Thread{
    public Olla olla;
    public int Canibal;
    public int toEat;
    
    public Canibal(Olla olla, int Canibal){
        this.olla = olla;
        this.Canibal = Canibal;
    }
    
    @Override
    public void run(){
        olla.Comer(Canibal);
    }
}
