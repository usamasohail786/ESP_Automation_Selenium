package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Test_Data{
	 public String pass;
	 public String phone_number;
	 public String group_name;
	 public String invalid_pass_user;
	 public String tab;
	 public String url;
	 public String search_app;
	 public String create_app_btn;
	 public String field1_data;
	 public String submit_btn_text;
	 public String done_btn_text;
	 public String field_place_holder;
	 public String application_no;
	 public String app_main_mid_tab;
	 public String filter_open;
	 public String filter_pending;
	 public String filter_all;
	 public String filter_accepted;
	 public String filter_cancelled;
	 public String open_text;
	 public String app_main_all_tab;
	 public String filter_rejected;
	 public String no_app_text;
	 public String submit_newest_first;
	 public String submit_oldest_first;
	 public String app_main_action_tab;
	 public String non_submitted_defination;
	 public String submitted_defination;
public void Data() throws FileNotFoundException, IOException, ParseException
{
	 JSONParser jsonparse=new JSONParser();  
		JSONObject jsonobject=(JSONObject) jsonparse.parse(new FileReader("Test_Data_json\\log_in_data.json"));
		JSONObject jsonobject_app_create=(JSONObject) jsonparse.parse(new FileReader("Test_Data_json\\create_application_data.json"));
		JSONObject jsonobject_search_filters=(JSONObject) jsonparse.parse(new FileReader("Test_Data_json\\search_filters_data.json"));
		pass=(String)jsonobject.get("password_stemex");
		phone_number=(String) jsonobject.get("phone_number");
		group_name=(String) jsonobject_app_create.get("group");	
		tab=(String) jsonobject_app_create.get("tab_name");
		url=(String) jsonobject.get("url");
		search_app=(String) jsonobject_app_create.get("search_create_app");
		create_app_btn=(String) jsonobject_app_create.get("create_app_btn");
		field1_data=(String) jsonobject_app_create.get("field1_data");
		submit_btn_text=(String) jsonobject_app_create.get("submit_btn_Text");
		done_btn_text=(String) jsonobject_app_create.get("done_btn_Text");
		application_no=(String) jsonobject_app_create.get("application_no");
		field_place_holder=(String) jsonobject_app_create.get("field_place_holder_value");
		app_main_mid_tab=(String) jsonobject_app_create.get("app_main_mid_tab");
		filter_open=(String) jsonobject_search_filters.get("filter_open");
		filter_accepted=(String) jsonobject_search_filters.get("filter_accepted");
		filter_all=(String) jsonobject_search_filters.get("filter_all");
		filter_cancelled=(String) jsonobject_search_filters.get("filter_cancelled");
		filter_pending=(String) jsonobject_search_filters.get("filter_pending");
		filter_rejected=(String) jsonobject_search_filters.get("filter_rejected");
		open_text=(String) jsonobject_search_filters.get("open_text");
		app_main_all_tab=(String) jsonobject_search_filters.get("app_main_all_tab");
		no_app_text=(String) jsonobject_search_filters.get("no_app_text");
		submit_newest_first=(String) jsonobject_search_filters.get("submit_newest_first");
		submit_oldest_first=(String) jsonobject_search_filters.get("submit_oldest_first");
		app_main_action_tab=(String) jsonobject_search_filters.get("app_main_action_tab");
		non_submitted_defination=(String) jsonobject_search_filters.get("non_submitted_defination");
		submitted_defination=(String) jsonobject_search_filters.get("submitted_defination");
		
}

}


