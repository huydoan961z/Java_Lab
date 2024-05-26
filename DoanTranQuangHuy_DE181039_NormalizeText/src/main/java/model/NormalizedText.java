/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author aser
 */
public class NormalizedText {

    String normalizedText;
    private static final String filePath="input.docx";

    public NormalizedText() {
    }

    public String getNormalizedText() {
        return normalizedText;
    }

    public void setNormalizedText(String normalizedText) {
        this.normalizedText = normalizedText;
    }

    @Override
    public String toString() {
        return "NormalizedText: " + normalizedText;
    }

    
    public static void loadData() 
    {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }


    public String oneSpaceBetweenEachWord(String str) 
    {
        str = str.trim();
        str = str.replaceAll("\\ +", " ");
        return str;

    }
    public String upperCaseAfterDot(String str) 
    {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) 
        {
            if (words[i].endsWith(".") && (i + 1) < words.length) 
            {
                words[i + 1] = words[i + 1].substring(0, 1).toUpperCase()
                        + words[i + 1].substring(1).toLowerCase();
            }
        }
        StringBuilder results = new StringBuilder();
        for (String w : words) 
        {
            results.append(w).append(" ");
        }
        return results.toString();
    }

    public String processQuotes(String str) 
    {
        int startQuoteIndex = str.indexOf("\"");

        while (startQuoteIndex != -1) 
        {
            int endQuoteIndex = str.indexOf("\"", startQuoteIndex + 1);

            if (endQuoteIndex == -1) 
            {
                break; 
            }

            String insideQuotes = str.substring(startQuoteIndex, endQuoteIndex + 1).trim();
            String processedInsideQuotes = processInsideQuotes(insideQuotes);

            str = str.substring(0, startQuoteIndex)
                    + processedInsideQuotes
                    + str.substring(endQuoteIndex + 1);

            
            startQuoteIndex = str.indexOf("\"", endQuoteIndex + 1);
        }

        return str;
    }

    public String processInsideQuotes(String insideQuotes) {
        return insideQuotes.trim();
    }

    public String wordOfFirstLine(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public String removeBlankLines(String str)
    {
        String[] lines = str.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            if (!line.isEmpty()) {
                result.append(line).append("\n");
            }
        }
        int length = result.length();
        if(length>0 && result.charAt(length-1)=='\n')
        {
            result.setLength(length-1);
        }
        return result.toString();

    }
    
    public String oneSpaceAfterPunctuation(String str) 
    {
        str = str.replaceAll("([,.:])\\s*", "$1 ");
        return str;
    }

    public String dotAtTheEnd(String str){
        if(str.charAt(str.length()-1)=='.')
            return str;
        else 
            return str.trim()+ '.';
    }
    
    public String removeSpaceAroundQuotes(String str) 
    {
       
        Pattern pattern = Pattern.compile("\"\\s*(.*?)\\s*\"");
        Matcher matcher = pattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "\"" + matcher.group(1) + "\"");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }   
}


