import java.util.*;
public class DataScanner
{
    private Scanner sc;
    
    //Simple constructor to set the line
    public DataScanner(String line){
        sc=new Scanner(line).useDelimiter(",");
    }
    
    public DataPoint processLine(){
        try{
        
        //Initialize DataPoint we are going to return
        DataPoint temp;     
        
        //Get the ID
        String name=(String)sc.next().replaceAll("\"", "");     //Getting first token from scanner, removing columns an converting it to string
        
        //Get Date and time
        String mess=(String)sc.next().replaceAll("\"", "").replaceAll("-", " ").replaceAll(":", " ").replace(".", " ");     //Store next token as string to get rid of everything we don't need
        Scanner newSc = new Scanner(mess);      //Make it scanner again
        DateData dat=new DateData((int)newSc.nextInt(),(int)newSc.nextInt(),(int)newSc.nextInt());  //Just fill tokens one-by-one 
        TimeData tim=new TimeData((int)newSc.nextInt(),(int)newSc.nextInt(),(int)newSc.nextInt());
        temp = new DataPoint(name, dat, tim);       //Creating new DataPoint object with data
        
        //Get longitude and latitude
        String mess2=sc.next().replaceAll("\"", "")+" " + sc.next().replaceAll("\"", "");    //Setting longitude and latitude same way         
        Scanner newSc2=new Scanner(mess2);
        newSc2.useLocale(Locale.US);            //Letting our scanner know, that we are going to look for double
        temp.setLongitude(newSc2.nextDouble()); //Setting longitude and latitude as two next tokens
        temp.setLatitude(newSc2.nextDouble());
        
        
        //Closing all scanners. Don't really know why, internet told me
        newSc2.close();
        newSc.close();
        sc.close();
        
        return temp;
    }
        catch(Exception ex){
            return new DataPoint();
    }
    }
}
