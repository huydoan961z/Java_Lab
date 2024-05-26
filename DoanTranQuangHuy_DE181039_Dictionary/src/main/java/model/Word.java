/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Word 
{
    private String engWord, vietWord;

    public Word(String engWord, String vietWord) {
        this.engWord = engWord;
        this.vietWord = vietWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public String getVietWord() {
        return vietWord;
    }

    public void setVietWord(String vietWord) {
        this.vietWord = vietWord;
    }
    
    
}
