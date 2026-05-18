/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8;

public class TestProdCons {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(5);
        int n = 20;
        
        Thread hProductor = new Thread(new Productor(buffer, n));
        Thread hConsumidor = new Thread(new Consumidor(buffer, n));
        
        hProductor.start();
        hConsumidor.start();
        
        hProductor.join();
        hConsumidor.join();
        
        System.out.println("Fin");
    }
}
