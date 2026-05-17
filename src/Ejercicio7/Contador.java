/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio7;


public class Contador {
    
    private int valor = 0;
    
    public synchronized void incrementar(){
        valor++;
    }
    
    public int getValor(){
        return valor;
    }

}

