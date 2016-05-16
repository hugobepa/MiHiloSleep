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
public class MiHilo1 extends Thread{
   //metodo Thread poner en marcha
   public void run()
   {
       for(int i=0;i<10;i++)
       {   //método  getName(): devuelve  el  nombre  del Thread
           /*currentThread(): metodo estatico que mantiene referencia
             al hilo propio
           */
           int z=i+1;
           System.out.println("Comenzado: "+Thread.currentThread().getName()+","
                   + "i="+z); 
           
           try{ 
                //sleep(( int)(Math.random() * 100)); 
                sleep(1000); //1000 =1s
            } catch(InterruptedException e) { } 
       }   
       System.out.println("Termina thread " + getName());
       /*
          Comenzado: Hilo2,i=1
          Comenzado: Hilo1,i=1
          Comenzado: Hilo3,i=1
          Comenzado: Hilo3,i=2
        Comenzado: Hilo1,i=2
        Comenzado: Hilo2,i=2
       ...
        Termina thread Hilo1
        Termina thread Hilo2
        Termina thread Hilo3
       */
  } 
   
   
}
