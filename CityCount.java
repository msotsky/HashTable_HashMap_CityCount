import java.util.*;
import java.io.*;

public class CityCount{

    public static void main(String[] args) throws Exception {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter city list class path.");
        String path = obj.nextLine();
        obj.close();
        File file = new File(path);
        
        obj = new Scanner(file);
        int numCity = 0;

        if (obj.hasNextLine())
            numCity = Integer.valueOf(obj.nextLine()); //saved

        Hashtable<String,Integer> hash = new Hashtable<>();

        while(obj.hasNextLine()){
            String key = obj.nextLine();
            Integer count = hash.get(key);
            if(!hash.containsKey(key))
                hash.put(key,1);
            else
                hash.put(key, count + 1);
        }
        System.out.println(numCity);
        obj.close();
                                                                            //Line 33 sorting found:
        TreeMap<String, Integer> tmap = new TreeMap<>(hash); //https://www.javacodeexamples.com/sort-hashtable-by-keys-in-java-example/3165
        System.out.println("TreeMap contains: " + tmap);
    

    }
}