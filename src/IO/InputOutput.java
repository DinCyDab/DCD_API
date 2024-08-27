/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;
import java.util.Scanner;

/**
 *
 * @author Cy
 */
public class InputOutput {
    Scanner s = new Scanner(System.in);
    
    public void printArray(int[] array){
        int size = array.length;
        for(int i = 0; i < size; i++){
            System.out.print("[" + array[i] + "]");
        }
    }
}
