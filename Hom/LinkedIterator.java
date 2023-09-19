/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homerwork;

/**
 *
 * @author LAB 3
 */
public class LinkedIterator {
    private int count;
    private LinearNode<T> current;
    
    public LinkedIterator(LinearNode<T> collection, int size){
        current = collection;
        count = size;
    }
    
    public boolean hasNext(){
        return current!=null;
    }
    
    public T next(){
        if( !hasNext()){
            throw new NoSuchElementException();
            T result = currect.getElement();
            current  = current.getNext();
            return result;
        }
    }
    
    public void remove() throws UnSupportedOperationException{
        throw new UnSupportedOperationException();
    }
}
