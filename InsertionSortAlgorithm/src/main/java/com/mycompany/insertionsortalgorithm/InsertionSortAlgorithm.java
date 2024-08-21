package com.mycompany.insertionsortalgorithm;

/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class InsertionSort
{
    int[] data; //creating new array with no values yet
    
    Random generator = new Random();
    
    public InsertionSort(int sizeOfArray)
    {
        data = new int[sizeOfArray];
        
        for(int i = 0; i<data.length; i++)
        {
            data[i] = generator.nextInt(100); //generate random numbers from 0 to 100
        }
    }
    
    public void sort()
    {
        for(int i =0; i<data.length; i++)
        {
            int j = i - 1;
            int x = data[i];
            
            while(j > -1 && data[j] > x)
            {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = x;
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

public class InsertionSortAlgorithm {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        
        InsertionSort insertion = new InsertionSort(size);
        
        System.out.println("Array before Insertion Sort Algorithm: "); //printing array after performing Insertion Sort
        insertion.printArray();
        
        System.out.println("Array after Insertion Sort Algorithm: "); //printing array after performing Insertion Sort
        insertion.sort(); //calling method to sort elements before printing them
        insertion.printArray();
    }
}
