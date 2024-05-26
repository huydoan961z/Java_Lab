/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import model.*;


/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    
    private final  String DATA_FILE="diction.txt";
    private final  WordList wordList= new WordList();
    
    
    
            
    public void loadData() 
    {
        String std;
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE))) {   
            while ((std = br.readLine()) != null) {
                String[] b = std.split(":");
                try {
                    if (b.length==2) 
                    {
                        wordList.getWordMap().put(b[0], b[1]);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println("Data not exits");
        }
    }     
    public void updateDataFile() 
    {
        try (PrintWriter writer = new PrintWriter(DATA_FILE)) 
        {
            for (Map.Entry<String, String> entry : wordList.getWordMap().entrySet()) 
            {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while updating the data file.");
        }
    }
    public void addWord()
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("------------- Add -------------");
        System.out.print("Enter English: ");
        String key= sc.nextLine();
        
        if(wordList.getWordMap().containsKey(key))
        {
            System.out.print("This word have already exits, do you want to update: ");
            String ans= sc.nextLine();
            if(ans.equalsIgnoreCase("yes"))
            {
                System.out.print("Enter Vietnamese: ");
                String value= sc.nextLine();
                wordList.getWordMap().put(key, value);
                System.out.println("Successful");
                updateDataFile();
            }
            else
            {
                return ;
            }     
        }
        else
        {
            System.out.print("Enter Vietnamese: ");
            String value= sc.nextLine();
            wordList.getWordMap().put(key, value);
            updateDataFile();
            System.out.println("Successful");
        }
    }
    public void deleteWord()
    {
        loadData();
        Scanner sc= new Scanner(System.in);
        System.out.println("------------- Delete -------------");
        System.out.print("Enter English: ");
        String key= sc.nextLine();
        if(wordList.getWordMap().containsKey(key))
        {
            wordList.getWordMap().remove(key);
            System.out.println("Successful");
            updateDataFile();
        }
        else
        {
            System.out.println("The value does not exits in the db key");
        }
    }
    public void transWord()
    {
        loadData();
        Scanner sc= new Scanner(System.in);
        System.out.println("------------- Translate -------------");
        System.out.print("Enter English: ");
        String key= sc.nextLine();
        if(wordList.getWordMap().containsKey(key))
        {
            System.out.println("Vietnamese: "+wordList.getWordMap().get(key));
            
        }
        else
        {
            System.out.println("Empty");
        }
    }
 }           
