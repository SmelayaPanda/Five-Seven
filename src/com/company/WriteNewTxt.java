package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteNewTxt {


    public static void writeWithTranslate(String fileName, String num) throws IOException {
        Writer writer = null;
         try {
            writer = new FileWriter(fileName, true);
            writer.write(num);
            writer.write(System.getProperty("line.separator"));
            writer.flush();

        } catch (Exception e) {
            Logger.getLogger(WriteNewTxt.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }
    }
}