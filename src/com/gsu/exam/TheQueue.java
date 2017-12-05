/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.exam;

/**
 *
 * @author Alexandre
 */
import java.util.Queue;
import java.util.LinkedList;

public class TheQueue {
    
    //Retrieves elements in the order they were added
    // First-In, First-Out ("FIFO")
    
    public static void main (String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.add (1);
        queue.add (2);
        queue.add (3);
        
        System.out.println ("My queue.......: " + queue);
        
        queue.remove();
        System.out.println ("After remove...: " + queue);
        
        queue.add(4);
        queue.add(5);
        queue.add(6);
        
        // for loop
        for (int i = 0; i < queue.size(); i++ ) {
            int element = queue.remove();
            
            // do something with the element
            System.out.println ("Element...:" + element);
            
            // adding back again 
            queue.add(element);
        }
        
    }
    
    public static void loopQueue(LinkedList<Integer> q) {
        int e;
        
        while ( q.isEmpty() == false) {
            // do something 
            // q.remove()
            
        }
        
    }
}

