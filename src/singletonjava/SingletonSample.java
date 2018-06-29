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
public class SingletonSample {
    private static SingletonSample instance = null;
    
    private SingletonSample() {}
    
    // remove synchronized to make this not thread safe 
    
    static synchronized SingletonSample getInstance () {
        if(instance == null) {
            instance = new SingletonSample();
        }
        return instance;
    }

}
