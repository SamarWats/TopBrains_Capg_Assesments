package ThreadsQuestions;

import java.io.*;

public class FileProgram {
	
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("target.txt");

            CopyDataThreads thread = new CopyDataThreads(fr, fw);
            
            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}