/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8_2;


public class Consumidor implements Runnable{
    //Definir variables
    private Buffer buffer;
    private int elementos;

    public Consumidor(Buffer buffer, int elementos) {
        this.buffer = buffer;
        this.elementos = elementos;
    }
    
    
    @Override
    public void run() {
        for(int i =0 ;i<elementos; i++){
            try {
                buffer.consumir(i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.getLogger(Consumidor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        
    }

}
