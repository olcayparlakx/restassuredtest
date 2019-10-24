package restasurred;

import org.json.JSONArray;
import org.json.JSONObject;

public class colorfinder {

	public int id;
	
  public int finder(String path , String lastname)
  {
	  
	  JSONObject a = new JSONObject(path);
	  JSONArray arr = a.getJSONArray("data");
	  String getlastname="";
	  for (int i = 0; i < arr.length(); i++)
	  {
		
		   getlastname =arr.getJSONObject(i).getString("last_name");
		
				   if(getlastname.equals(lastname)) {
				   
					   id=arr.getJSONObject(i).getInt("id");

				   } }
	  return id;
  
  }
  
  
	
  
	
}
