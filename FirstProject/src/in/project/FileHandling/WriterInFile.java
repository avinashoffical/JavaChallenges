package in.project.FileHandling;


import java.io.IOException;
import java.io.FileWriter;

public class WriterInFile {


    public static void main(String[] args) {
        String fileName="Example.txt";
        try(FileWriter writer=new FileWriter(fileName)){
            writer.write("Hello, this ia a test. \n");
            writer.write("more thing to write");
            writer.flush();
            System.out.println("Successfully written to the file");
        }catch (IOException e){
            System.out.println("An error occurred"+e.getMessage());
//            e.printStackTrace();
        }
    }
}
