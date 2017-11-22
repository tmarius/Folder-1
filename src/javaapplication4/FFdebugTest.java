/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class FFdebugTest {

    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }

    
    
    
    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.findMax(debug.myArray));
    }

    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
}
