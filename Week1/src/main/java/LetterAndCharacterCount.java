
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aser
 */
public class LetterAndCharacterCount 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your content");
        String n= sc.nextLine();
        countLetter(n);
        
        
    }
    public static void countLetter(String n)
    {
        StringTokenizer tokenizer= new StringTokenizer(n," ");                     
        HashMap<String,Integer> letterCount= new HashMap<>();
        String substr ;
        
        while(tokenizer.hasMoreElements())
        {
            substr=tokenizer.nextToken();                                         
            if(letterCount.containsKey(substr))
                letterCount.put(substr,letterCount.get(substr)+1);
            else
            {
                letterCount.put(substr, 1);
            }
        }
        System.out.println(letterCount);
    }
    public static void countChar(String n)
    {
        StringTokenizer tokenizer= new StringTokenizer(n);
        
        HashMap<String,Integer> charCount= new HashMap<>();
        for(int i=0; i<n.length();i++)
        {
            boolean check= false;
            char character= n.charAt(i);
            //if(check=='')
        }
    }
    
}
