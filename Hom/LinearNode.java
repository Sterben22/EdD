/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homerwork;

/**
 *
 * @author LAB 3
 */
public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;
    
    public LinearNode(){
        next = null;
        element = null;
    }
    
    public LinearNode(T elem){
        next = null;
        element = elem;
    }
    
    public LinearNode<T> getNext(){
        return next;
    }
    
    public void setNext(LinearNode<T> node){
        next = node;
    }
    
    public T getElement(){
        return element;
    }
    
    public void setElement(T elem){
        element = elem;
    } 
}
