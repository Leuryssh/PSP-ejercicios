/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8;

public class Consumidor implements Runnable {
    private final Buffer buffer;
    private final int elementos;

    public Consumidor(Buffer buffer, int elementos) {
        this.buffer = buffer;
        this.elementos = elementos;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < elementos; i++) {
                buffer.consumir();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
