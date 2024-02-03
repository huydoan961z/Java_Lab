/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doantranquanghuy_de181039_analyzeinput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Main 
{
   
    public static boolean checkSquare(int n)
    {
        
        return (int)Math.floor(Math.sqrt(n))*(int)Math.floor(Math.sqrt(n))==n;
    }
    public static  void getNumber(String inputString) {
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        String reString = inputString.replaceAll("\\D+", ",");
        
        String[] listNumber = reString.split(",");
        int length = listNumber.length;

        ArrayList<Integer> perfectSquare = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < length; i++) 
        {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 !=0) {
                odd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                even.add(numberCheck);
            }
            if (checkSquare(numberCheck)) {
                perfectSquare.add(numberCheck);
            }
            all.add(numberCheck);
        }
        hm.put("Perfect Square Numbers: ",perfectSquare);
        hm.put("Odd Numbers: ", odd);
        hm.put("Even Numbers: ", even);
        hm.put("All Numbers: ", all);

        for (Map.Entry x : hm.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }

    public static void getCharacter(String inputString) {
        HashMap<String, String> hm = new HashMap<>();
        String upperCase= inputString.replaceAll("[^A-Z]", "");
        String lowerCase= inputString.replaceAll("[^a-z]", "");
        String speacial=inputString.replaceAll("[0-9a-zA-Z]", "");
        String allCharacter=inputString.replaceAll("[0-9]", "");
        hm.put("Uppercase Characters: ", upperCase);
        hm.put("Lowercase Characters: ", lowerCase);
        hm.put("Special Characters: ", speacial);
        hm.put("All Characters: ", allCharacter);
        for (Map.Entry x : hm.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }

    public static void main(String[] args) 
    {
        System.out.println("====Analysis String program=====");
        Scanner sc= new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString= sc.nextLine();
        System.out.println("------Result Analysis------");
        getNumber(inputString);
        getCharacter(inputString);
    }
    
}