/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio7;


public class TestCarrera {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        int repeticiones = 100_000;
        
        Thread h1 = new Thread(new Incrementador(contador, repeticiones));
        Thread h2 = new Thread(new Incrementador(contador, repeticiones));
        
        h1.start();
        h2.start();
        
        h1.join();
        h2.join();
        
        System.out.println("Valor esperado: " + (repeticiones *2));
        System.out.println("Valor real: " + contador.getValor());
    }

}
