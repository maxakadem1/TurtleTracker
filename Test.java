import java.util.Scanner;
public class Test
{
    public static void main(String[] args){
        DataPoint oof;
        DataScanner s=new DataScanner("\"Janie\",\"2010-07-01 00:21:00.000\",\"141.71\",\"-12.227\",\"FALSE\"");
        oof=s.processLine();
        System.out.println(oof.toString());
}
}