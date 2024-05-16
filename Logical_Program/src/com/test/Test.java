package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
    	  // create map to store
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
        
        map.put("A", valSetOne);
        
        // iterate and display values
       
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            //System.out.println("Key = " + key);
            System.out.println("Key :"+key+" \n Values = :" + values + " ");
		
	}
}
}

