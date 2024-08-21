package com.mycompany.mergesortalgorithm;

/*
 * @author Ntlakanipho Mgaguli
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class MergeSort
{
    int[] data; //creating new array with no values yet
    
    Random generator = new Random();
    
    public MergeSort(int sizeOfArray)
    {
        data = new int[sizeOfArray];
        
        for(int i = 0; i< data.length; i++)
        {
            data[i] = generator.nextInt(10); //generate random numbers from 0 to 100
        }
    }
    
    public int[] sort(int[] array)
    {
        if(array.length <= 1)
            return array; // Base case: a single-element array is already sorted
        
        int minIndex = array.length/2;
        
        int left[] = new int[minIndex];
        int right[] = new int[array.length - minIndex];
        
        //fill the left subarray
        for(int i = 0; i < minIndex; i++)
        {
            left[i] = array[i];
        }
        //fill the right subarray
        for(int i = minIndex; i < array.length; i++)
        {
            right[i - minIndex] = array[i];
        }
        
         // Recursively sort the left and right halves
        left = sort(left);
        right = sort(right);
        
         // Merge the sorted halves
        return merge(left,right);
        
    }
    
    private int[] merge(int[] left, int[] right)
    {
        int i=0,j=0, k=0;
        int combined[] = new int[left.length + right.length];
        
           // Merge the two sorted arrays
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                combined[k] = left[i];
                k++;
                i++;
            }
            else
            {
                combined[k] = right[j];
                k++;
                j++;
            }
        }
         // Copy any remaining elements from the left array
        while(i < left.length)
        {
            combined[k] = left[i];
                k++;
                i++;
        }
         // Copy any remaining elements from the right array
        while( j < right.length)
        {
            combined[k] = right[j];
                k++;
                j++;
        }
        return combined; 
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
     public void executeSort() {
        data = sort(data); // Update the data array with the sorted result
    }
    
}

public class MergeSortAlgorithm {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        
        MergeSort merge = new MergeSort(size);

        System.out.println("Array before Merge Sort Algorithm: ");
        merge.printArray();
        
        merge.executeSort(); // Call the executeSort method to sort the array
        
        System.out.println("Array after Merge Sort Algorithm: ");
        merge.printArray();
    }
}
