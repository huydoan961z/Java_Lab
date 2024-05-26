/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15;

import java.util.TreeSet;
import javax.smartcardio.ATR;


public class intSet 
{
    public intSet(){
        
    }
    private TreeSet<Integer> set ;
    
    public intSet(int []a)
    {
        for(int i=0; i<a.length; i++)
            set.add(a[i]) ;
    }
    public intSet intersetion(intSet b)
    {
        intSet result = new intSet();
    }
}
