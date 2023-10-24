package org.example;

import java.io.*;

public class Log {

    public static void log(String file, String text){
        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(text + "\n");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
