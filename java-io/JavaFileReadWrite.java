import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* TODO
Delete a File: Allow the user to delete a specified file.

Append to a File: Provide an option to append text to the file without creating a new line each time.

Clear File Contents: Clear all contents of the current file.

Rename a File: Allow the user to rename the current file.

Display File Info: Show detailed information about the file, such as its size, last modified date, etc.

Search within a File: Allow the user to search for specific text within the current file.

Copy File Content: Copy the contents of one file to another file.

Move a File: Allow the user to move the file to a different directory.

Change Directory: Change the working directory for file operations.
 */


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

    static void showAvailableFiles()
    {
        String currentDirectory = System.getProperty("user.dir");
        File directory = new File(currentDirectory);

        //Filter to select only .txt files using lambda expression
        File[] files = directory.listFiles((dir,name)->name.toLowerCase().endsWith(".txt"));

        if(files != null && files.length>0)
        {
            System.out.println("Available Files:");
            for(File file:files)
            {
                System.out.println(file.getName());
            }
        }
        else
        {
            System.out.println("No text files found");
        }
    }

    void readFile()
    {
        String line;
        
        //Creating a buffered reader to read file line by line
        try{
            this.fr = new BufferedReader(new FileReader(this.fileName+".txt"));
            if(fr.read()==-1)
            {
                System.out.println("The file that you specified is empty");
            }
            else
            {
                this.fr = new BufferedReader(new FileReader(this.fileName+".txt"));
                System.out.println("\n\t--FILE CONTENTS--");
            }
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

    void changeFile()
    {
        String fileName = new String();
        System.out.println("Enter name of the file to switch to:");
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        try{
            File createFile = new File(fileName+".txt");
            if(!createFile.exists()) //If the file does not exist
            {
                System.out.println("The specified file does not exist. Do you want to create it? (Y/N)");
                
                while(true)
                {
                    @SuppressWarnings("resource")
                    Scanner s = new Scanner(System.in);
                    String userChoice = new String();
                    userChoice = s.nextLine();
                    if(!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"))
                    {
                        System.out.println("Please enter a valid choice!");
                        continue;
                    }
                    else if(userChoice.equalsIgnoreCase("y"))
                    {
                        createFile.createNewFile();
                        break;
                    }
                    else
                    {
                        break;
                    }
                }    
            }
        }
        catch(IOException e)
        {
            System.out.println("Could not create file!");
        }
        this.fileName = fileName;
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
            System.out.println("\n<---- SELECT AN OPERATION ---->");
            System.out.println("1: Write to file");
            System.out.println("2: Read from file");
            System.out.println("3: Change selected file");
            System.out.println("4: Show available text files");
            System.out.println("5: Exit");
            System.out.print("Enter your choice:");
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
                if(userChoice<1 || userChoice>5)
                {
                    System.out.println("Please enter a valid choice!");
                    continue;
                }
                switch(userChoice)
                {
                    case 1:
                    frw.writeFile();
                    break;

                    case 2:
                    frw.readFile();
                    break;
                    
                    case 3:
                    frw.changeFile();
                    break;

                    case 4:
                    JavaFileReadWrite.showAvailableFiles();
                    break;

                    case 5:
                    sc.close();
                    System.exit(1);
                }
        }
        

    }

}
