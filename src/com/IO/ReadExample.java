package com.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("My.txt");
            int data;

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
