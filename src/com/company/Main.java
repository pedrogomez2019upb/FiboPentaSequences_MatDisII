//#################################
//MAIN CLASS
//#################################
//Hi to everyone ! In this proyect , we are goint to
//develop an exercise , which consist of giving the product
//of the sum of the "x" first
package com.company;
//##################################################################
//Importing "Read" library
//##################################################################
//In Java we need to import a library so that we can read an
//external input given by the user. For this , we are going
//to import the "scanner" library.
import java.util.Scanner;
public class Main {
    //##################################################################
    //Creating "For" cycle for the Pentagonal function, as another
    //function.
    //##################################################################
    //Then, we are going to create the required variables
    //so that the procedure can be done, this goes for
    //counters, numbers, etc.
    public static int generateSumPentagonal(int x){
        int count=0;
        for(int i=1;i<=x;i++){

            generatePentagonal(i);
            if (i==x) System.out.println(generatePentagonal(i));
            count++;


        }

        return count;
    }

    //##################################################################
    //Creating Pentagonal function
    //##################################################################
    //First, we a going to create a Pentagonal function because we need to
    //change the "n" number various times so that we can get the sum
    public static int generatePentagonal(int n){

        return (n * (3 * n - 1))/2;


    }
    public static void main(String[] args) {
        int x=generateSumPentagonal(50);
        System.out.println(generateSumPentagonal(x));

	//
    }
}
//Developed by Pedro Gomez - 000396221