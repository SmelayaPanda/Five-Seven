package com.company.graph_variant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteNewTxt {

    public static void writeFile(String fileName, String num) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter(fileName, true);
            writer.write(num);
            if (Counter.i == 2) {
                writer.write(System.getProperty("line.separator"));
                Counter.i = 0;
            }
            writer.flush();
            Counter.i++;
        } catch (Exception e) {
            Logger.getLogger(WriteNewTxt.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

class Counter {
    public static int i=1;
}