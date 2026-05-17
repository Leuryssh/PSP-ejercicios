/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio7_2;

/**
 *
 * @author leuri
 */
public class TestSubeBaja {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        int repeticiones = 100_000;
        
        Thread hIncrementador = new Thread(new Incrementador(contador, repeticiones));
        Thread hDecrementador = new Thread(new Decrementador(contador, repeticiones));
        
        hIncrementador.start();
        hDecrementador.start();
        
        hIncrementador.join();
        hDecrementador.join();
        
        System.out.println("El resultado final es " + contador.getValor());
        System.out.println("El resultado esperado es:"+ 0);
    
    
    }
    
    
    
    

}
