/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio7;


public class Incrementador implements Runnable{

    private Contador contador;
    private int repeticiones;

    public Incrementador(Contador contador, int repeticiones) {
        this.contador = contador;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i=0; i<repeticiones; i++){
            contador.incrementar();
        }
    }
    
}
