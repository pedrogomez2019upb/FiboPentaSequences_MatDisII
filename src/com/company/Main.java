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
import java.util.*;

public class Main {
    //##################################################################
    //Creating Pentagonal function
    //##################################################################
    //First, we a going to create a Pentagonal function because we need to
    //change the "n" number various times so that we can get the sum
    public static int generatePentagonal(int n){

        return (n * (3 * n - 1))/2;


    }
    //##################################################################
    //Creating "For" cycle for the Pentagonal sequence's list.
    //##################################################################
    //Then, we are going to create the required variables
    //so that the procedure can be done, this goes for
    //counters, numbers, etc.
    public static int generateSumPentagonal(int x){
        int count=0;
        List<Integer> Pentagonal =new ArrayList<Integer>();
        for(int i=1;i<=x;i++){
            Pentagonal.add(generatePentagonal(i));
            //NOTE:USE IF YOU WANT TO GET THE x TERM ON PENTAGONAL SEQUENCE
            //if (i==x) System.out.println(generatePentagonal(i));
            count++;
        }
        //##################################################################
        //Creating "For" cycle for the Pentagonal sequence's list sum.
        //##################################################################
        //Now in order to get the sum , we need go through every single
        //element on the list so that we can add them up and get the
        //final answer as a return.
            int sum=0;
            for (int i: Pentagonal) {
                sum += i;
            }
            return sum;
    }
    //##################################################################
    //Creating Fibonacci function
    //##################################################################
    //First, we a going to create a Fibonacci function because we need to
    //change the "n" number various times so that we can get the sum
    public static long generateFibonacci(long n) {
        long num1 = 0, num2 = 1, num3 = 1;
        List<Long> FibonacciNew= new ArrayList<Long>();
        // Let's show the first number
        FibonacciNew.add(num1);

        for (int i = 1; i < n; i++) {

            FibonacciNew.add(num3);

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        //System.out.println(""+FibonacciNew);
        //##################################################################
        //Creating "For" cycle for the Fibonacci sequence's list sum.
        //##################################################################
        //Now in order to get the sum , we need go through every single
        //element on the list so that we can add them up and get the
        //final answer as a return.

        long sum=0;
        for (long i: FibonacciNew) {
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(""+generateFibonacci(3));
        //##################################################################
        //MAIN PROGRAM
        //##################################################################
        //In this part we are going to create the main program , where the user gets
        //the possibility of entering their number and the program can use it
        //to get the product of the sum of the two sequences. Thanks to the
        //"Scanner" library , we can read variables in Java, so first we are
        //going to create a instance of Scanner named "sc".
        Scanner sc = new Scanner(System.in);
        //Now what's remaining is to create the System Output with the
        //messages and input required by the functions.
        System.out.println("\n##############################################");
        System.out.println("\nFibonacci and Pentagonal Sequence Calculator");
        System.out.println("\n##############################################");
        System.out.println("\nHi! Welcome to our Fibonacci and Pentagonal");
        System.out.println("\nsystem calculator, where it manages to give the");
        System.out.println("\nproduct of the sum of these sequences.");
        System.out.println("\n##############################################");
        System.out.println("\nPlease enter the first x terms you want to use:");
        int number = sc.nextInt();
        System.out.println("\n##############################################");
        System.out.println("\nPentagonal Sum: "+generateSumPentagonal(number));
        System.out.println("\n##############################################");
        System.out.println("\n##############################################");
        System.out.println("\nFibonacci Sum: "+generateFibonacci(number));
        System.out.println("\n##############################################");
        System.out.println("\n##############################################");
        System.out.println("\nFibonacci and Pentagonal Sequence Result:");
        long product = generateFibonacci(number)*generateSumPentagonal(number);
        System.out.println("\n"+product);
        System.out.println("\n##############################################");


	//
    }
}
//Developed by Pedro Gomez - 000396221