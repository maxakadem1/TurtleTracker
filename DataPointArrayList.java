import java.util.ArrayList;
public class DataPointArrayList extends ArrayList<DataPoint>
{
    public boolean add(DataPoint data){
        boolean temp = false;
        if(data!=null){      //First test: see if data object exist
            if(!data.getName().equals("Not set")){     //Second test: check if data is complete
                if(data.getDate()!=null&&data.getTime()!=null){
                    temp=true;
                    super.add(data);
                }
            }
        }
        return temp;
    }
    
    //Method, that will go through array and return entry with earliest date and time
    public DataPoint getFirst(){            
        if(size()>0){
            DataPoint ret=get(0);
            for(int i=0; i<size(); i++){
                if(ret.compareTo(get(i))>0){
                    ret=get(i);
                }
            }
            return ret;
        }
        else return null;
    }
    
    //Method, that will go through array and return entry with latest date and time
    public DataPoint getLast(){            
        if(size()>0){
            DataPoint ret=get(0);
            for(int i=0; i<size(); i++){
                if(ret.compareTo(get(i))<0){
                    ret=get(i);
                }
            }
            return ret;
        }
        else return null;
    }
}
