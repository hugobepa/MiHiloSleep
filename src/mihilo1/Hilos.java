/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihilo1;

/**
 *
 * @author hugo
 */
public class Hilos {
    public static void main(String[] args) {
        MiHilo1 h1 =new MiHilo1();
        //dar nombre por hilo
        h1.setName("Hilo1");
        
        MiHilo1 h2 =new MiHilo1();
        //dar nombre por hilo
        h2.setName("Hilo2");
        
        MiHilo1 h3 =new MiHilo1();
        //dar nombre por hilo
        h3.setName("Hilo3");
        
        //h1.suspend(); hilo suspendido en espera ser ser reactivado, stop() no sino muere hilo
        //h1.resume(); //el hilo se reanuda
        // h1.join();// esperando el inicio siguiente hilo hasta la finalizacion
                     //anterior
        //h1.isAlive()//Booleano chequea si el hilo esta  muerto o de parranda
        
        
        h1.start();
        h2.start();
        h3.start();
    }
            
    
}
