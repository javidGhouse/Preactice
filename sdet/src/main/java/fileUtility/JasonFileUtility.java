package fileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JasonFileUtility {

	@Test
	public String readDataFromJason(String key) throws IOException, ParseException
		{
			FileReader file=new FileReader(IpathConstant.JasonPath);
			JSONParser jp=new JSONParser();
			Object parsed=jp.parse(file);
			HashMap map=(HashMap) parsed;
			String value=map.get(key).toString();
			return value;
		}
	}


