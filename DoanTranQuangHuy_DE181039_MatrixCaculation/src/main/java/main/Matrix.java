/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Matrix 
{
    public double[][] inputMatrixInput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows matrix: ");
        int r= InputInformation.inputInt();
        
        System.out.print("Enter columns matrix: ");
        int c= InputInformation.inputInt();
        double[][] matrix= new double[r][c];
        System.out.println("Enter value of matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) 
            {        
                System.out.print("Enter Matrix[" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] =InputInformation.inputDou();          
            }
        }
        return matrix;
    }   

        public void printMatrix(double[][] matrix)
    {
        for(double[] r: matrix)
        {
            for(double x:r)
            {
                System.out.print("["+x+"]");
            }
            System.out.println("");
        }
    }

   public void addMatrix()
    {
        double[][] mt1= inputMatrixInput();
        double[][] mt2= inputMatrixInput();
        printMatrix(mt1);
        System.out.println("+");
        printMatrix(mt2);
        if(mt1.length != mt2.length || mt1[0].length != mt2[0].length)
        {
            System.out.println("Error not suitable.");
            return;
        }
        double[][] result = new double[mt1.length][mt1[0].length];
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[0].length; j++) {
                result[i][j] = mt1[i][j] + mt2[i][j];
            }
        }
        System.out.println("=");
        printMatrix(result);     
    }
    public void subtractMatrix()
    {
        double[][] mt1= inputMatrixInput();
        double[][] mt2= inputMatrixInput();
        printMatrix(mt1);
        System.out.println("-");
        printMatrix(mt2);
         
        if(mt1.length != mt2.length || mt1[0].length != mt2[0].length)
        {
            System.out.println("Error not suitable.");
            return;
        }
        double[][] result = new double[mt1.length][mt1[0].length];
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[0].length; j++) {
                result[i][j] = mt1[i][j] - mt2[i][j];
            }
        }
        System.out.println("=");
        printMatrix(result);     
    }
    public void multiplyMatrices() 
    {
        double[][] mt1= inputMatrixInput();
        double[][] mt2= inputMatrixInput();
        printMatrix(mt1);
        System.out.println("*");
        printMatrix(mt2);
        
        if (mt1[0].length != mt2.length) {
            System.out.println("Error not suitable");
            return;
        }
        double[][] result = new double[mt1.length][mt2[0].length];
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt2[0].length; j++) {
                for (int k = 0; k < mt1[0].length; k++) {
                    result[i][j] += mt1[i][k] * mt2[k][j];
                }
            }
        }
        System.out.println("=");
        printMatrix(result);
    }
}
