package com.reqres;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleUser {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\karth\\eclipse-workspace\\APIProject\\src\\test\\resources\\JSONFollder\\reqres.json");
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject j = (JSONObject) object;
		Object data = j.get("data");
		System.out.println(data);
		JSONObject j1 = (JSONObject) data;
		Object id = j1.get("id");
		System.out.println(id);
		Object email = j1.get("email");
		System.out.println(email);
		Object firstname = j1.get("first_name");
		System.out.println(firstname);
		Object lastname = j1.get("last_name");
		System.out.println(lastname);
		Object avatar = j1.get("avatar");
		System.out.println(avatar);
		Object support = j.get("support");
		System.out.println(support);
		JSONObject j2 = (JSONObject) support;
		Object url = j2.get("url");
		System.out.println(url);
		Object text = j2.get("text");
		System.out.println(text);
	}

}
