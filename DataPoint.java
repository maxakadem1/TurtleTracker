public class DataPoint implements Comparable
{
    //Instance variables holding every needed parametr
    private String name;
    private DateData date;
    private TimeData time;
    private double longitude;
    private double latitude;
    
    //CONSTRUCTORS
    
    //Basic consructor with no parameters
    public DataPoint(){
        name="Not set";
        date = new DateData();
        time = new TimeData();
    }
    
    //Constructor, that accepts ID, date and time
    public DataPoint(String id, DateData d, TimeData t){
        name=id;
        date=d;
        time=t;
    }
    
    public String getName(){
        return name;
    }
    
    public DateData getDate(){
        return date;
    }
    
    public TimeData getTime(){
        return time;
    }
    
    //Set longitude and latitude
    public void setLongitude(double val){
        longitude=val;
    }
    public void setLatitude(double val){
        latitude=val;
    }
    
    //Return formatted String
    public String toString(){
       return "ID: " + name + " date: " + date.toString() + " time: " + time.toString() + " longitude: " + longitude +" latitude: " +latitude;
    }
    
    //Say, if two objects are same
    public boolean equals(Object o){
        boolean temp=false;     //Variable to avoid 2 return statevents
        if(o instanceof DataPoint){
            DataPoint d=(DataPoint)o;
            if(name.equals(d.getName())){
                temp=true;
            }
        }
        return temp;
    }
    
    //compareTo. First check the date, then the time
    public int compareTo(Object otherData){
        int temp;           //Variable to avoid 2 return statevents
        if(otherData instanceof DataPoint){
            DataPoint d=(DataPoint)otherData;
            if(date.compareTo(d.getDate())==0){
                if(time.compareTo(d.getTime())==0){
                    temp=0;
                }
                else{
                    temp=time.compareTo(d.getTime());
                }
            }
            else{
                temp=date.compareTo(d.getDate());
            }
        }
        else{
            temp=-1;
        }
        return temp;
    }
}
