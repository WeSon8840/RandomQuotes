/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomquotes;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author glSon8840
 */
public class RandomQuotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> quotes = new ArrayList<String>();
        BufferedReader readFile = new BufferedReader(new FileReader("Quotes.txt"));
        String line = "";
        while((line = readFile.readLine()) != null){ //EOF
            quotes.add(line);
        }

        int num = (int)(Math.random() * quotes.size());

        JOptionPane.showMessageDialog(null, "Random Quote:\n" + quotes.get(num));
    }
    
}
