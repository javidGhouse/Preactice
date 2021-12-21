package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class readJasonFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		FileReader file=new FileReader("./file.json");
		JSONParser jp=new JSONParser();
		Object parse=jp.parse(file);
		HashMap map=(HashMap)parse;
		System.out.println(map.get("Username"));
		System.out.println(map.get("Password"));
		
		
	}

}
