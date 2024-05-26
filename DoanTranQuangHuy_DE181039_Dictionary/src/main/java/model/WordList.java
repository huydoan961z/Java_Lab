/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author aser
 */
public class WordList 
{
    private HashMap<String,String> wordMap= new HashMap<>();

    public WordList() {
    }

    public HashMap<String, String> getWordMap() {
        return wordMap;
    }

    public void setWordMap(HashMap<String, String> wordMap) {
        this.wordMap = wordMap;
    }
    
}
