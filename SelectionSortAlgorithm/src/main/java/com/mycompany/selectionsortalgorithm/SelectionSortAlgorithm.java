package com.mycompany.selectionsortalgorithm;

/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class SelectionSort
{
    int[] data; //creating new array with no values yet
    
    Random generator = new Random();
    
    public SelectionSort(int sizeOfArray)
    {
        data = new int[sizeOfArray];
        
        for(int i = 0; i<data.length; i++)
        {
            data[i] = generator.nextInt(100); //generate random numbers from 0 to 100
        }
    }
    public void sort()
    {
        for(int i = 0; i<data.length; i++)
        {
            int minIndex = i;
            
            for(int j = i+1; j < data.length; j++)
            {
                if(data[j] < data[minIndex]) 
                {
                    minIndex = j;
                }
            }
            if(i != minIndex)
            {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
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

public class SelectionSortAlgorithm {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        
        SelectionSort selection = new SelectionSort(size);
        
        System.out.println("Array before Selecton Sort Algorithm: "); //printing array after performing Selection Sort
        selection.printArray();
        
        System.out.println("Array after Selection Sort Algorithm: "); //printing array after performing Selection Sort
        selection.sort(); //calling method to sort elements before printing them
        selection.printArray();
    }
}
