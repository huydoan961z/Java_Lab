/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author aser
 */
public class FractionList {
    private final ArrayList<Fraction> fractions;

    public FractionList(int num) {
        fractions = createFrac(num);
        Collections.sort(fractions);
    }

    private ArrayList<Fraction> createFrac(int num) {
        Random rand = new Random();
        ArrayList<Fraction> fc = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            int numerator = rand.nextInt(10);
            int denominator = rand.nextInt(10) + 1;
            fc.add(new Fraction(numerator, denominator));
        }
        return fc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < fractions.size(); i++)
        {
            sb.append(fractions.get(i));
            if(i < fractions.size() - 1) 
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String sumFrac() 
    {
        int sumNumerator = 0;
        int sumDenominator = 1;
        for(Fraction f: fractions)
        {
            sumDenominator = lcm(sumDenominator, f.getDenominator());
        }
        for(Fraction f: fractions)
        {
            sumNumerator += (sumDenominator/f.getDenominator())*f.getNumerator();
        }
        int gcd = gcd(sumNumerator, sumDenominator);
        sumNumerator /= gcd;
        sumDenominator /= gcd;
        return "Sum of fraction: " +sumNumerator+ "/" +sumDenominator;
    }

    private static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        } else 
        {
            return gcd(b, a % b);
        }
    }

    private static int lcm(int a, int b) 
    {
        return a * (b / gcd(a, b));
    }
}
