package restasurred;

import org.json.JSONArray;
import org.json.JSONObject;

public class main {

	public static void main(String[] args) {
		
		
		
		
		String path="";
	gettest getrun = new gettest();
	getrun.runtest("https://reqres.in/", "/api/users/");
	 path=getrun.returnpath();
	
	postcheck postrun = new postcheck();
	postrun.posttest("https://reqres.in/", "/api/users/", "olcay" , "parlak");
	
	
	
	//SOYADI RAMOS OLAN KISININ ID SINI BULMA
	colorfinder find = new colorfinder();
	int id =find.finder(path,"Ramos");
	
	String path2="";

	//SOYADI RAMOS OLAN KISININ ID SINE AIT FARKLI BIR APIDE KI RENGI PARAMETRE ILE BULMA

	gettest getrun2 = new gettest();
	getrun.runtest("https://reqres.in/", " /api/unknown/"+id);
	path2=getrun.returnpath();
	
	 JSONObject b = new JSONObject(path2);
	 
   System.out.println("kisiye ait renk" +b.getString("color").toString());
		
		 
		  
		//MAALESEF BIR GET METODUNA DAHA ZAMANIM YETMEDI
		
	}
	
	
	
}
