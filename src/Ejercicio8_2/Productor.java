/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8_2;


public class Productor implements Runnable{
    //Definir atributos
    private Buffer buffer;
    private int elementos;

    public Productor(Buffer buffer, int elementos) {
        this.buffer = buffer;
        this.elementos = elementos;
    }
    
    
    @Override
    public void run(){
        for (int i=1; i<=elementos; i++){
            try {
                buffer.producir(i);
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.getLogger(Productor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        
    }
    

}
