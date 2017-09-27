package mpp.tinkering;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public void handleFile(File f){
        try(BufferedReader buf = new BufferedReader(new FileReader(f))){
            System.out.println(buf.readLine());

        }catch (IOException e){

        }
    }

    public static void  main(String[] args){
        File file = new File("a");
        MyFileReader fileReader = new MyFileReader();
        fileReader.handleFile(file);
    }
}
