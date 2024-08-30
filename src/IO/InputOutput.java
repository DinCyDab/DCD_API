/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;
import java.util.Scanner;
import java.util.ArrayList;
import StandardLibrary.stdlib;

/**
 *
 * @author Cy
 */
public class InputOutput {
    public Scanner scan = new Scanner(System.in);
    
    public void printArray(int[] array){
        int size = array.length;
        for(int i = 0; i < size; i++){
            System.out.print("[" + array[i] + "]");
        }
    }
    
    public void isPalindrome(String value){
        stdlib std = new stdlib();
        if(std.isPalindrome(value)){
            System.out.println("["+ value + "] is a palindrome");
        }
        else{
            System.out.println("["+ value + "] is NOT a palindrome");
        }
        
    }
}
