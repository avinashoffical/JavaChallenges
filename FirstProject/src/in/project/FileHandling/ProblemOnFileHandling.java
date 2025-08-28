package in.project.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemOnFileHandling {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to File Read/Write problem");
        //write function from user
        System.out.print("Give the name of file to write : ");
        String fileNameWrite= input.next();
        System.out.println("write the content of File. when done write exit");
        try(FileWriter writer=new FileWriter(fileNameWrite, true)){
            String value;
            while(true){
                value=input.nextLine();
                if(value.equalsIgnoreCase("exit")){
                    break;
                }
                writer.write(value+System.lineSeparator());
            }
            System.out.println("Successfully written");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        //read function from user
        System.out.print("Enter the Filename to read : ");
        String filename= input.next();
        try(FileReader reader=new FileReader(filename)){
            int read;
            try{
                do{
                    read= reader.read();
                    System.out.print((char)read);
                }while(read!=-1);
                reader.close();
            }catch (FileNotFoundException exception){
                System.out.println(exception.getMessage());
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
