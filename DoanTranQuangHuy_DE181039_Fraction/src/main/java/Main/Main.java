/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aser
 */

public class Main 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element");
        int num= InputInfor.inputInt();
        Random rand = new Random();
        ArrayList<Fraction> fc= new ArrayList<>();
        for(int i=0; i<num; i++)
        {
            int numerator= rand.nextInt(10);
            int denominator= rand.nextInt(10)+1;
            fc.add(new Fraction(numerator, denominator));
        }
        
        Collections.sort(fc);
        
        System.out.println("");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < fc.size(); i++)
        {
            sb.append(fc.get(i));
            if(i < fc.size() - 1) 
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
        
        int sumNumerator = 0;
        int sumDenominator = 1;
        for(Fraction f: fc)
        {
            sumDenominator = lcm(sumDenominator, f.getDenominator());
        }
        for(Fraction f: fc)
        {
            sumNumerator += (sumDenominator/f.getDenominator())*f.getNumerator();
        }
        int gcd = gcd(sumNumerator, sumDenominator);
        sumNumerator /= gcd;
        sumDenominator /= gcd;


      
        System.out.println("Sum of fractions in list by minimalist fraction form: " + sumNumerator + "/" + sumDenominator);
        
    }  
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
}

}
