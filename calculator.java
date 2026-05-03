/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculations;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----SIMPLE CALCULATOR-----");
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Choose the operation!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("Enter you choice(1-4): ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                int add = num1 + num2;
                System.out.println("Result: "+add);
            break;
               
            case 2:
                int sub = num1 - num2;
                System.out.println("Result: "+sub);
            break;
                
            case 3:
                int mul = num1*num2;
                System.out.println("Result: "+mul);
            break;    
                
            case 4:
                float div = (float)num1/num2;
                if(num2!=0){
                System.out.println("Result: "+div);
                }
                else{
                System.out.println("Error: Can not divide by zero!.");
                }
            break;    
                
            default:
                System.out.println("Invalid input! Can not perform operation.");
        }
    }
}
