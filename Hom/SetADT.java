/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.homerwork;

import java.util.Iterator;

/**
 *
 * @author LAB 3
 * @param <T>
 */
public interface SetADT<T> {
    public void add(T element);
    public T removeRandom();
    public T remove(T element);
    public SetADT<T> union (SetADT<T> set);
    public boolean contains(T target);
    public boolean equals(SetADT<T> set);
    public boolean isEmpty();
    public int size();
    public Iterator<T> iterator();
    @Override
    public String toString();
;}
