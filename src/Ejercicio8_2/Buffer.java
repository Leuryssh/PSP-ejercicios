/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8_2;

import java.util.LinkedList;
import java.util.Queue;


public class Buffer {
    private Queue<Integer> cola = new LinkedList<>();
    private int capacidad=0;

    public Buffer(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public synchronized void producir(int valor) throws InterruptedException{
        while (cola.size()==capacidad){
            wait();
        }
        cola.add(valor);
        System.out.println("[PRODUCIDO] " + valor + " -> tamaño " + (cola.size()));
        notifyAll();
        
    }
    
    public synchronized void consumir(int valor) throws InterruptedException{
        while(cola.isEmpty()){
            wait();
        }
        cola.poll();
        System.out.println("[CONSUMIDO] " + valor + " -> tamaño " + (cola.size()));
        notifyAll();
        
        
    }

}
