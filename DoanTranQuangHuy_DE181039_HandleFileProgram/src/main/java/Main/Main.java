/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aser
 */
//C:\Users\aser\Documents\NetBeansProjects\28techbai18\src\main\java\custemerandinvoice
public class Main 
{
    private static final Scanner sc= new Scanner(System.in);
    
    public static int inputIntLimit(int min, int max)
    {
        while(true)
        {
            int result= inputInt();
            if (result>=min && result<=max)
                return result;
            else
            {
                System.out.println("no in the range");
                System.out.println("pls type again");

            }
        }
    }
    public static int inputInt()
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
            String input= s.nextLine();

            try {
                int result= Integer.parseInt(input);
                return result;

            } catch (Exception e) {
                System.out.print("Value of size is digit: ");
        } 
    }
    }
    public static String checkInputString()
    {
        while(true)
        {
            try
            {
                String result = sc.nextLine().trim();
                return result;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("");
            }
        }
    }
    public static void checkPath()
    {
        System.out.println("Enter path");
        String path= checkInputString();
        File file = new File(path);
        if(file.exists() && file.isFile())
        {
            System.out.println("Path to file");
        }
        else
            {
            if(file.exists()&& file.isDirectory())
                System.out.println("Path to directory");
            else
                {
                    System.out.println("Path doesnot exit");

                }
            }
        }
    public static void getName()
    {
        ArrayList<String> filename= new ArrayList<>();
        
        System.out.println("Enter path");
        String path= checkInputString();
        File file= new File(path);
        if(file.exists()&&file.isDirectory())
        {
            File[] filelist=file.listFiles();
            for( int i=0; i<filelist.length;i++)
            {
                if(filelist[i].isFile()&& filelist[i].getName().endsWith(".java"))
                    filename.add(filelist[i].getName());
            }
        }
        for(int i=0; i< filename.size();i++)
        {
            System.out.println("File name"+ filename.get(i));
        }
    }
    public static void  fileLargerInput()
    {
        System.out.print("Enter size: ");
        int size= inputInt();
        System.out.print("Enter path: ");
        String path= checkInputString();
         ArrayList<String> filename= new ArrayList<>();
        File file= new File(path);
        if(file.exists()&&file.isDirectory())
        {
            File[] filelist=file.listFiles();
            for( int i=0; i<filelist.length;i++)
            {
                if(filelist[i].isFile()&& filelist[i].length()>size*1024)
                    System.out.println(filelist[i].getName()+" "+filelist[i].length());
            }
        }
        else
            System.out.println("Path not exits");
        
        
    }
    public static void addContent() throws IOException
    {
        System.out.print("Enter content: ");
        String content= checkInputString();
        System.out.print("Enter path: ");
        
        String path= checkInputString();
        File file= new File(path);
        if (file.exists() && file.isFile()) 
        {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(content);
            writer.close();
            System.out.println("Sucessfull");
        } else 
            {
                System.out.println("Path doesn't exist");
                System.out.println("Please try again");
            }
    }
    public static void countCharacter() throws FileNotFoundException, IOException 
    {
        System.out.print("Enter path: ");
        String path = checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) 
        {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int wordCount = 0;
            while (line != null) 
            {
                String[] words = line.split(" ");
                for (String word : words) 
                {
                    wordCount++;
                }
                line = bufferedReader.readLine();
            }
            System.out.println("Total number of words: " + wordCount);
        } 
        else 
        {
            System.out.println("The file path does not exist.");
        }
}
    public static void main(String[] args) throws IOException 
    {
        while(true)
        {
            System.out.println("1. Check Path");
            System.out.println("2. Get file name with type java");
            System.out.println("3. Get file with size greater than input");
            System.out.println("4. Write more content to file");
            System.out.println("5. Read file and count characters");
            System.out.println("6. Exit");
            System.out.print("Please choice one option: ");
            int choice = inputIntLimit(1, 6);
            switch(choice)
            {
                case 1:
                    checkPath();
                    break;

                case 2:
                    getName();
                    break;
                case 3:
                    fileLargerInput();
                    break;
                case 4:
                    addContent();
                    break;
                case 5:
                    countCharacter();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
            }
        
    }
    
}
