package in.project.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) {
        String fileName="Example.txt";
        try(FileReader reader=new FileReader(fileName)){
            int read;
            do{
                read=reader.read();
                System.out.print((char)read);
            }while (read!=-1);
        }catch (IOException exception){
            System.out.println("Exception is "+exception);
        }
    }
}
