/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doantranquanghuy_de181039_analyzefilepath;

/**
 *
 * @author aser
 */
public class Input 
{
    public static String getDisk(String dir)
    {
        int position= dir.indexOf("\\");
        String disk= dir.substring(0, position);
        return disk;
    }
    public static String getEx(String dir)
    {
        int pos= dir.lastIndexOf(".");
        String extention=dir.substring(pos+1, dir.length());
        return extention;
    }
    public static String getFileName(String dir)
    {
        int pos1=dir.lastIndexOf("\\");
        int pos2=dir.lastIndexOf(".");
        String fileName= dir.substring(pos1+1, pos2);
        return fileName;
    }
    public static String getPath(String dir)
    {
        int pos=dir.lastIndexOf("\\");
        String path= dir.substring(0, pos);
        return path;
    }
    public static String getFolder(String dir)
    {
        String n=Input.getPath(dir);
        int pos=n.indexOf("\\");
        String folder= n.substring(pos+1, n.length());
        return folder;
    }
    
}
