/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;
import java.util.ArrayList;

/**
 *
 * @author Cy
 */
public class SortingArrays {
    public void bubbleSort(int[] array){
        int size = array.length;
         for(int i = 0; i < size - 1; i++){
             for(int j = 0; j < size - i - 1; j++){
                 if(array[j] > array[j + 1]){
                     swap(array, j, j + 1);
                 }
             }
         }
    }
    
    public void bubbleSort(ArrayList<Integer> array){
        
    }
    
    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
