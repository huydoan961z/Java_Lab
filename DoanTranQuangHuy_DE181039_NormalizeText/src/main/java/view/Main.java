package view;

import model.NormalizedText;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            NormalizedText normalizedText = new NormalizedText();
            br = new BufferedReader(new FileReader(new File("input.docx")));
            int countLine = 0;
            while (br.readLine() != null) countLine++;
            br.close();

            int count = 1;
            br = new BufferedReader(new FileReader(new File("input.docx")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.docx", true)));
            String line;
           
            while ((line = br.readLine()) != null) {
         
                if (line.trim().isEmpty()) {
                    continue;
                }
                line = normalizedText.oneSpaceBetweenEachWord(line);
                line = normalizedText.processQuotes(line);
                line = normalizedText.upperCaseAfterDot(line);
                line = normalizedText.removeBlankLines(line);
                line = normalizedText.wordOfFirstLine(line);
                line = normalizedText.removeSpaceAroundQuotes(line);
                line = normalizedText.dotAtTheEnd(line);
                line = normalizedText.oneSpaceAfterPunctuation(line);

                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
