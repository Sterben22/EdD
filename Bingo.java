/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homerwork;

/**
 *
 * @author LAB 3
 */
public class Bingo {
    public static void main(String[] args){
        final int numBALL = 75, numPULLS = 10;
        LinkedSet <BingoBall> bingoSet = new LinkedSet<BingoBall>();
        BingoBall ball;
        
        for(int i = 1; i <= numBALL; i++){
            ball = new BingoBall(num);
            bingoSet.add(ball);
        }
        System.out.println("Size: "+bingoSet.size());
        System.out.println("#%#%#%#%#%#%#%#%#%#%#%#%");
        
        for(int i=1; i<=numPULLS; i++){
            ball = bingoSet.removeRandom();
            System.out.println(ball);
        }
    }
}
