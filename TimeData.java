/*
Almost everything was copied from DateData class with replacement, because they are literally identical
*/
public class TimeData implements Comparable
{
    private int hour;
    private int minute;
    private int second;
    
    public TimeData(){}

    public TimeData(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setDate(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String toString(){
        String s = "" + hour + ":" + minute + ":" + second;
        return s;
    }

    public boolean equals(Object other){

        if( other instanceof TimeData ){
            TimeData otherDate = (TimeData) other;
            if( hour == otherDate.getHour()){
                if( minute == otherDate.getMinute()){
                    if( second == otherDate.getSecond()){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public int compareTo(Object other){
        if( other instanceof TimeData ){
            TimeData otherDate = (TimeData) other;
            
            int hourSum = hour - otherDate.getHour();
            if(hourSum == 0){
                int minuteSum = minute - otherDate.getMinute();

                if( minuteSum == 0){
                    int secondSum = second - otherDate.getSecond();

                    if(secondSum == 0){
                        return 0; // Equals the same
                        // Check for time

                    }else{
                        return secondSum;
                    }
                }else{
                    return minuteSum;
                }
            }else{
                return hourSum;
            }
        }else{
            return -1;
        }
    }
}
