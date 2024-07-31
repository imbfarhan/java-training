import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaFileReadWrite {
    FileWriter fw;
    BufferedReader fr;
    String fileName;
    
    JavaFileReadWrite(String fileName)
    {
        //Assign file name
        this.fileName = fileName;

        //Create new file if the file does not exist
        try{
            File createFile = new File(fileName+".txt");
            createFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Could not create file!");
        }

    }

    void readFile()
    {
        String line;
        
        //Creating a buffered reader to read file line by line
        try{
            this.fr = new BufferedReader(new FileReader(this.fileName+".txt"));
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }

        //Read each line of the file
        while(true)
        {
            try{
                line = this.fr.readLine();
                if(line!=null)
                {
                    System.out.println(line);
                }
                else{
                    break;
                }
            }
            catch(IOException e)
            {
                System.out.println("IO Exception Occured");
            }
        }
    }

    void writeFile()
    {
        String line;

        try{
            //Open file writer
            this.fw = new FileWriter(fileName+".txt",true);
           
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter content to write to file (type exit to stop):");
            while(true)
            {
                line = sc.nextLine();
                if(line.equalsIgnoreCase("exit"))
                {
                    break;
                }
                fw.write(line+"\n");
            }
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("IO Exception Occured");
        }
    }
    
    
    public static void main(String[] args) 
    {
        String fileName = new String();
        Scanner sc = new Scanner(System.in);
        int userChoice;

        //Try catch for reading file name
        try{
            System.out.println();
            System.out.println("Enter name of the file:");
            fileName = sc.nextLine();
        }
        catch(Exception e)
        {
            System.out.println("An exception occured!");
        }

        //Create object of JavaFileReadWrite class
        JavaFileReadWrite frw = new JavaFileReadWrite(fileName);
        
        while(true)
        {
            System.out.println("\nSelect an operation");
            System.out.println("1: Write to file");
            System.out.println("2: Read from file");
            System.out.println("3: Exit");
            try{
                userChoice=sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Enter a valid input!");
                
                //Clears the invalid input
                sc.next();

                continue;
            }
                if(userChoice<1 || userChoice>3)
                {
                    System.out.println("Please enter a valid choice");
                    continue;
                }
                switch(userChoice)
                {
                    case 1:
                    frw.writeFile();
                    break;

                    case 2:
                    System.out.println("\n\t--FILE CONTENTS--");
                    frw.readFile();
                    break;

                    case 3:
                    sc.close();
                    System.exit(1);
                }
        }
        

    }

}
