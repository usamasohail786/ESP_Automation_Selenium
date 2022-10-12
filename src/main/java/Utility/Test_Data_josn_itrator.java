package Utility;

import java.io.FileNotFoundException;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException; 

//import require classes  
import java.io.FileWriter;  
import java.io.IOException;  

import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;

import io.ous.jtoml.ParseException;  

public class Test_Data_josn_itrator{
	
	 
public void Data1() throws FileNotFoundException, IOException, ParseException
{
	  // create instance of JSONObject  
    JSONObject jsonObject = new JSONObject();  
	 JSONArray list1 = new JSONArray();  
     list1.add("Julia");  
     list1.add("Paul");  
     list1.add("Emma");  
     jsonObject.put("Names", list1);  
     // get locations array from the JSON Object and store it into JSONArray  
     JSONArray jsonArray = (JSONArray) jsonObject.get("Names");  
     for (int i = 0; i < jsonArray.size(); i++) {  
         
         // get field value from JSON Array  
         System.out.println(jsonArray.get(i));  
     }  
}

}


