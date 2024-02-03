/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doantranquanghuy_de181039_analyzefilepath;

import java.io.File;
import java.util.Scanner;

public class Mainly 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        while(true) 
        {
            System.out.println("===== Analysis Path Program =====");
            System.out.println("Please input Path: ");
            String dir= sc.nextLine();
            File file= new File(dir);
            if(file.isFile() && file.exists()) 
            {
                System.out.println("Disk: "+Input.getDisk(dir));
                System.out.println("Extension: "+Input.getEx(dir));
                System.out.println("File Name: "+Input.getFileName(dir));
                System.out.println("Path: "+Input.getPath(dir));
                System.out.println("Folder: [" +Input.getFolder(dir)+"]");
                break;
            }
            else
            {
                System.out.println("The input path is not a valid file or does not exist.");
            }
        }
    }
}



