/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homerwork;

/**
 *
 * @author LAB 3
 */
public class BingoBall {
    private char letter;
    private int number;
    public BingoBall(int num){
        number = num;
        if(num <=15){
            letter = 'B';
        } else if(num <= 30){
            letter = 'I';
        } else if(num <= 45){
            letter = 'N';
        } else if(num <= 60){
            letter = 'G';
        } else{
            letter = 'O';
        }
    }
    @Override
    public String toString(){
        return letter+" "+number;
    }
}
