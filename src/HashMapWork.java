import java.util.*;
public class  HashMapWork {
    public static void main(String[] args) {

       // HashMap <String , String> hashMapname=new HashMap<>();
        HashMap  <String,String> HashMapWork = new HashMap();
        HashMapWork.put("Nepal","Kathmandu");
        HashMapWork.put("India","New Delhi");
        HashMapWork.put("US","Washington DC");
        HashMapWork.get("Nepal");
        for (String i:HashMapWork.keySet())
        {
            System.out.println(i+" " + "Capital is  :"+HashMapWork.get(i));
        }
            
        }
        
    }

//