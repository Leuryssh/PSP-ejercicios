/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8_2;


public class TestProdCons {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer (5);
        
        //Inicialización de hilos
        Thread hProductor1 = new Thread(new Productor(buffer, 20));
        Thread hProductor2 = new Thread(new Productor(buffer, 20));
        Thread hConsumidor1 = new Thread(new Consumidor(buffer, 20));
        Thread hConsumidor2 = new Thread(new Consumidor(buffer, 20));
        
        hProductor1.start();
        hProductor2.start();
        hConsumidor1.start();
        hConsumidor2.start();
        
        hProductor1.join();
        hProductor2.join();
        hConsumidor1.join();
        hConsumidor2.join();
        
        System.out.println("Los hilos han terminado");
    }
}
