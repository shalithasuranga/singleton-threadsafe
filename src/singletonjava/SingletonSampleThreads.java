/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonjava;

/**
 *
 * @author Shalitha Suranga
 */
public class SingletonSampleThreads extends Thread{

    @Override
    
    
    public void run() {
        System.out.println(SingletonSample.getInstance().hashCode()) ;
    }
    
    
    public static void main(String[] args) {
        
        // single threaded execution.
        //for(int i = 0; i < 4; i++){
          //  System.out.println(SingletonSample.getInstance().hashCode());
        //}
        
        for(int i = 0; i < 4; i++){
            new SingletonSampleThreads().start();
        }
        
    }
}
