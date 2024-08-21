package com.mycompany.bubblesortalgorithm;

/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class BubbleSort
{
    int[] data; //creating new array with no values yet
    
    Random generator = new Random();
    
    public BubbleSort(int sizeOfArray)
    {
        data = new int[sizeOfArray];
        
        for(int i = 0; i<data.length; i++)
        {
            data[i] = generator.nextInt(100); //generate random numbers from 0 to 100
        }
    }
    
    //method to perform Bubble sort
    public void sort()
    {
        boolean swapped;
        
        for(int i = data.length - 1; i>0; i--)
        {
             swapped = false;
            for(int j = 0; j<i; j++)
            {
                if(data[j] > data[j+1])
                {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    
                    swapped = true;
                }
            }
             if(!swapped)
             {
              System.out.println("Array is already sorted, no further swapping needed.");
               break; // Exit the loop if no swaps were made
             }
        }
    }
    
    //method to convert array in  strings to be nice formatted
    @Override
    public String toString()
    {
        return Arrays.toString(data);
    }
    //method to print Elements available in a array
    public void printArray()
    {
        System.out.println(this+"\n");
    }
}
public class BubbleSortAlgorithm {
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        
         BubbleSort bubble = new  BubbleSort(size);
        
        System.out.println("Array before bubble sort Algorithm: ");
        
        bubble.printArray(); //printing array before performing bubble sort
        
        System.out.println("Array after bubble sort Algorithm: "); //printing array after performing bubble sort
        
        bubble.sort(); //calling method to sort elements before printing them
        bubble.printArray(); // printing  sorted array  
    }
}
