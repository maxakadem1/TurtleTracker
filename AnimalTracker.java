import javax.swing.*;
import java.io.*;
public class AnimalTracker
{
    private static DataPointArrayList arr=new DataPointArrayList();
    
    public static void main(String[] args){
        loadDatabase();
        
        //Print first 5 entries in array
        String ret="";
        for(int i=0; i<5; i++){
            ret+=arr.get(i).toString()+"\n";
        }
        System.out.println(ret);
        
        //Print total number of entries
        System.out.println("Total Entries: "+arr.size());
        
        //Print First and last entry
        System.out.println("First: "+arr.getFirst().toString()+"\n"+"Last: "+arr.getLast().toString());
    }
    
    private static void loadDatabase(){
        JFileChooser fileopen = new JFileChooser("."); //User choose the file
        fileopen.showOpenDialog(null);
        File file = fileopen.getSelectedFile();     //Converting it to File class
        BufferedReader inFile = null;       //Setting new BufferedReader class to read this file
        DataScanner s;      //DataScanner variable, that we are going ro use
        try {                               //Checking for exceptions
            inFile = new BufferedReader(new FileReader(file));      //Get data from file
            String line;
            do{
                line=inFile.readLine();                             //Read next line
                if(line!=null){
                    s=new DataScanner(line);                //Putting line in DataScanner object;          
                    arr.add(s.processLine());               //Procces line and add DataPoint object to list
                }
            }while(line!=null);
        }//try e
        catch(NullPointerException e){
            System.out.println("You cancelled it.");
        }
        catch(FileNotFoundException e) {
            System.out.println("That file could not be found.");
        }//catch
        catch(IOException e){
            System.out.println("Something went wrong");
        } 
    }
    
}
