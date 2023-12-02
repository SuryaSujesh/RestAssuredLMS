package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification req;
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
		
	}
	
	public RequestSpecification requestSpecification() throws IOException
	{
	if(req==null)
	{
		PrintStream log=new PrintStream(new FileOutputStream("logDetails.txt"));
	
		req = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri(getGlobalValue("baseurl"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
	
	return req;
		
	}
	return req;

}
	public String getJsonPath(Response response,String key)
	{
		String resp=response.asString();
		JsonPath js=new JsonPath(resp);
		return js.getString(key).toString();
	}
}
