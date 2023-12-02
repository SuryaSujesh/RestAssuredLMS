package utilities;


import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;


import stepdefinition.PostRequestSteps;

public class TestData {
	
	ExcelUtility e1=new ExcelUtility("./src/test/resources/Team11_TestData.xlsx");
	public  HashMap<String,Object> programPayload(String testcasename,String sheetname) throws IOException
	{
		
		
		List<String> data=e1.getData(testcasename,sheetname);
		Random randomNum = new Random();
		String prog_name="Jul23-GoogleSurvivors-SDET-"+randomNum.nextInt();
		
		
		HashMap<String,Object> programdata=new HashMap<String, Object>();
		
		programdata.put("programName",prog_name);
		programdata.put("programDescription",data.get(1));
		programdata.put("programStatus",data.get(2));
		
		
		System.out.println(programdata);
		return programdata;
	}
	
	public  HashMap<String,Object> BatchPayload(String testcasename,String sheetname) throws IOException
	{
		
		
		List<String> data=e1.getData(testcasename,sheetname);
		Random randomNum = new Random();
		String batch_name="Jul23-GoogleSurvivors-SDET-SDET01-"+randomNum.nextInt();
		
		
		HashMap<String,Object> batchdata=new HashMap<String, Object>();
		
		batchdata.put("batchName",batch_name);
		batchdata.put("batchDescription",data.get(1));
		batchdata.put("batchStatus",data.get(2));
		batchdata.put("batchNoOfClasses",data.get(3));
		
		batchdata.put("programId",PostRequestSteps.progID_env);
		
		System.out.println(batchdata);
		return batchdata;
	}
	
	public  HashMap<String, Object> UserPayload(String testcasename,String sheetname) throws IOException
	{
		
		
		List<String> data=e1.getData(testcasename,sheetname);
		Random randomNum = new Random();
		String User_name="GoogleSurvivors-"+randomNum.nextInt(10);
		
		int num1,num2,num3;
		num1=randomNum.nextInt(900)+100;
		num2=randomNum.nextInt(643)+100;
		num3=randomNum.nextInt(9000)+1000;
		String phonenumber=String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3);
		
		HashMap<String,Object> userdata=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("roleId",data.get(12));
		map.put("userRoleStatus",data.get(13));
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		userdata.put("userComments",data.get(1));
		userdata.put("userEduPg",data.get(2));
		userdata.put("userEduUg",data.get(3));
		userdata.put("userFirstName",User_name);
		
		userdata.put("userLastName",data.get(4));
		userdata.put("userLinkedinUrl",data.get(5));
		userdata.put("userLocation",data.get(6));
		userdata.put("userMiddleName",data.get(8));
		userdata.put("userPhoneNumber",phonenumber);
					
		userdata.put("userRoleMaps",maparray);
		
		userdata.put("userTimeZone",data.get(16));
		userdata.put("userVisaStatus",data.get(20));
		
		System.out.println(userdata);
	
		return userdata;
	}
	
	public  HashMap<String, Object> AssignPayload(String testcasename,String sheetname) throws IOException
	{
		
		List<String> data=e1.getData(testcasename,sheetname);
		Random randomNum = new Random();
		String Ass_name="Jul23-GoogleSurvivors-SDET-RestAPI-"+randomNum.nextInt();
		
	 final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	 Calendar cal = Calendar.getInstance();
	 cal.setTimeInMillis(timestamp.getTime());
	    cal.add(Calendar.DAY_OF_MONTH,5);
	    timestamp = new Timestamp(cal.getTime().getTime());
	    System.out.println(timestamp);
	    
		
		HashMap<String,Object> assdata=new HashMap<String, Object>();
		
		assdata.put("assignmentDescription",data.get(1));
		assdata.put("assignmentName",Ass_name);
		assdata.put("batchId",PostRequestSteps.bacthId_env);
		assdata.put("comments",data.get(7));
		
		assdata.put("createdBy",PostRequestSteps.userId_env);
		
		assdata.put("dueDate",sdf.format(timestamp));
		assdata.put("graderId",PostRequestSteps.userId_env);
		assdata.put("pathAttachment1",data.get(2));
		assdata.put("pathAttachment2",data.get(3));
		assdata.put("pathAttachment3",data.get(4));
		assdata.put("pathAttachment4",data.get(5));
		assdata.put("pathAttachment5",data.get(6));
		
		System.out.println(assdata);
		return assdata;
	}
	
	public  HashMap<String, Object> AssignSubmitPayload(String testcasename,String sheetname) throws IOException
	{
		
		List<String> data=e1.getData(testcasename,sheetname);
		
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp sub_datestamp = new Timestamp(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		
		//submit date is +2 days of current date
		cal.setTimeInMillis(sub_datestamp.getTime());
	    cal.add(Calendar.DAY_OF_MONTH,2);
	    sub_datestamp = new Timestamp(cal.getTime().getTime());
	
	    
	    //graded date is +8 days of current date
	    Timestamp grade_stamp = new Timestamp(System.currentTimeMillis());
	    cal.setTimeInMillis(grade_stamp.getTime());
	    cal.add(Calendar.DAY_OF_MONTH,8);
	    grade_stamp = new Timestamp(cal.getTime().getTime());
		
		HashMap<String,Object> subdata=new HashMap<String, Object>();
		subdata.put("assignmentId",PostRequestSteps.AssignId_env);
		subdata.put("userId",PostRequestSteps.userId_env);
		subdata.put("subDesc",data.get(1));
		subdata.put("subComments",data.get(2));
		subdata.put("subPathAttach1",data.get(3));
		
		subdata.put("subPathAttach2",data.get(4));
		
		subdata.put("subPathAttach3",data.get(5));
		subdata.put("subPathAttach4",data.get(6));
		subdata.put("subPathAttach5",data.get(7));
		subdata.put("subDateTime",sdf.format(sub_datestamp));
		subdata.put("gradedBy",PostRequestSteps.userId_env);
		subdata.put("gradedDateTime",sdf.format(grade_stamp));
		subdata.put("grade",data.get(8));
		
		System.out.println(subdata);
		return subdata;
	}
	
}
