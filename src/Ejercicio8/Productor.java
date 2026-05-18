/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8;

public class Productor implements Runnable { 
    private final Buffer buffer;
    private final int elementos;

    public Productor(Buffer buffer, int elementos) {
        this.buffer = buffer;
        this.elementos = elementos;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= elementos; i++) {
                buffer.producir(i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}