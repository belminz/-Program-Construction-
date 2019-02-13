/**
 * Created by belminzahirovic on 25.11.16.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class map {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map=new LinkedHashMap<>();

        map.put(1, "jedan");
        map.put(2,"dva");
        map.put(4,"cetiri");
        map.put(3, "tri");

//for (Integer key : map.keySet()){
//   String s = map.get(key);

    System.out.println(map.get(2));

   // }

}}
