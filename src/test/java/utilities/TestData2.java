package utilities;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import stepdefinition.PostRequestSteps;

public class TestData2 {
	
	ExcelUtility e2=new ExcelUtility("./src/test/resources/Response_data.xlsx");
	ExcelUtility e3=new ExcelUtility("./src/test/resources/Team11_TestData.xlsx");
	
	
	public  HashMap<String, Object> assignsubmitPut(String testcaseName,String Sheetname) throws IOException
	{
		List<String> data=e3.getData(testcaseName,Sheetname);
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp sub_datestamp = new Timestamp(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		//submit date is +2 days of current date
		cal.setTimeInMillis(sub_datestamp.getTime());
	    cal.add(Calendar.DAY_OF_MONTH,2);
	    sub_datestamp = new Timestamp(cal.getTime().getTime());
		
		 Timestamp grade_stamp = new Timestamp(System.currentTimeMillis());
		    cal.setTimeInMillis(grade_stamp.getTime());
		    cal.add(Calendar.DAY_OF_MONTH,8);
		    grade_stamp = new Timestamp(cal.getTime().getTime());
		
		HashMap<String,Object> submitdataput=new HashMap<String,Object>();
		
		
		
		submitdataput.put("assignmentId",PostRequestSteps.AssignId_env);
		submitdataput.put("userId",PostRequestSteps.userId_env);
		submitdataput.put("subDesc","Submitted");
		
		submitdataput.put("subComments",data.get(2));
		submitdataput.put("subPathAttach1",data.get(3));
		submitdataput.put("subPathAttach2",data.get(4) );
		submitdataput.put("subPathAttach3",data.get(5));
		submitdataput.put("subPathAttach4",data.get(6));
		submitdataput.put("subPathAttach5",data.get(7));
		submitdataput.put("subDateTime",sdf.format(sub_datestamp));
		submitdataput.put("gradedBy",PostRequestSteps.userId_env);
		submitdataput.put("gradedDateTime",sdf.format(grade_stamp));
		submitdataput.put("grade",2);
		
		
		
		System.out.println(submitdataput);
	
		return submitdataput;
	}
	public  HashMap<String, Object> gradeAssignPut(String testcaseName,String Sheetname) throws IOException
	{
		List<String> data=e3.getData(testcaseName,Sheetname);
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Timestamp sub_datestamp = new Timestamp(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		//submit date is +2 days of current date
		cal.setTimeInMillis(sub_datestamp.getTime());
	    cal.add(Calendar.DAY_OF_MONTH,2);
	    sub_datestamp = new Timestamp(cal.getTime().getTime());
		
		 Timestamp grade_stamp = new Timestamp(System.currentTimeMillis());
		    cal.setTimeInMillis(grade_stamp.getTime());
		    cal.add(Calendar.DAY_OF_MONTH,8);
		    grade_stamp = new Timestamp(cal.getTime().getTime());
		
		HashMap<String,Object> submitdataput=new HashMap<String,Object>();
		
		
		
		submitdataput.put("assignmentId",PostRequestSteps.AssignId_env);
		submitdataput.put("userId",PostRequestSteps.userId_env);
		submitdataput.put("subDesc","Submitted");
		
		submitdataput.put("subComments",data.get(2));
		submitdataput.put("subPathAttach1",data.get(3));
		submitdataput.put("subPathAttach2",data.get(4) );
		submitdataput.put("subPathAttach3",data.get(5));
		submitdataput.put("subPathAttach4",data.get(6));
		submitdataput.put("subPathAttach5",data.get(7));
		submitdataput.put("subDateTime",sdf.format(sub_datestamp));
		submitdataput.put("gradedBy","");
		submitdataput.put("gradedDateTime","");
		submitdataput.put("grade",2);
		
		
		
		System.out.println(submitdataput);
	
		return submitdataput;
	}
	
	public  HashMap<String, Object> UserPut(String testcaseName,String Sheetname) throws IOException
	{
		List<String> data=e2.getData(testcaseName,Sheetname);
		Random randomNum = new Random();
		String User_name="GoogleSurvivors-"+randomNum.nextInt(10);
		int num1,num2,num3;
		num1=randomNum.nextInt(900)+100;
		num2=randomNum.nextInt(643)+100;
		num3=randomNum.nextInt(9000)+1000;
		String phonenumber=String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3);
		HashMap<String,Object> userdataput=new HashMap<String,Object>();
		userdataput.put("userComments",data.get(11));
		userdataput.put("userEduPg",data.get(10));
		userdataput.put("userEduUg",data.get(9));
		userdataput.put("userFirstName",User_name);
		userdataput.put("userLastName",data.get(3));
		userdataput.put("userId", data.get(1));
		userdataput.put("userLinkedinUrl",data.get(8));
		userdataput.put("userLocation",data.get(6));
		userdataput.put("userMiddleName",data.get(4));
		userdataput.put("userPhoneNumber",phonenumber);
		userdataput.put("userTimeZone",data.get(7));
		userdataput.put("userVisaStatus",data.get(12));
		
		System.out.println(userdataput);
	
		return userdataput;
	}
	
	//call from get
	public  HashMap<String, Object> UserPutprogbathstatus(String testcaseName,String Sheetname) throws IOException
	{
		
		
		HashMap<String,Object> parent=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("batchId",PostRequestSteps.bacthId_env);
		map.put("userRoleProgramBatchStatus","Active");
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		parent.put("programId",PostRequestSteps.progID_env);
		parent.put("roleId","R01");
		parent.put("userId",PostRequestSteps.userId_env);
		parent.put("userRoleProgramBatches",maparray);
		
		
		System.out.println(parent);
	
		return parent;
	}
	//get request
	public  HashMap<String, Object> Updaterolestatus(String testcaseName,String Sheetname) throws IOException
	{
		
		HashMap<String,Object> userdataput=new HashMap<String,Object>();
		userdataput.put("roleId","R03");
		userdataput.put("userRoleStatus","Inactive");
		System.out.println(userdataput);
		return userdataput;
		
		
		
	}
	
	
	
	public  HashMap<String, Object> batchPut(String testcaseName,String Sheetname) throws IOException
	{
		List<String> data=e2.getData(testcaseName,Sheetname);
		Random randomNum = new Random();
		String batch_name="Jul23-GoogleSurvivors-SDET-SDET01-"+randomNum.nextInt();
		HashMap<String,Object> batchdataput=new HashMap<String,Object>();
		batchdataput.put("batchDescription",data.get(1));
		batchdataput.put("batchId",data.get(2));
		batchdataput.put("batchName", batch_name);
		batchdataput.put("batchNoOfClasses",data.get(4));
		batchdataput.put("batchStatus",data.get(5));
		batchdataput.put("programId",data.get(6));
		batchdataput.put("programName",data.get(7));
		System.out.println(batchdataput);
		return batchdataput;
	}
	
	public  HashMap<String, Object> assignPut(String testcaseName,String Sheetname) throws IOException
	{
		List<String> data=e2.getData(testcaseName,Sheetname);
		HashMap<String,Object> assigndataput=new HashMap<String,Object>();
		assigndataput.put("assignmentDescription",data.get(1));
		assigndataput.put("assignmentId",data.get(2));
		assigndataput.put("assignmentName",data.get(3));
		assigndataput.put("batchId",PostRequestSteps.bacthId_env);
		assigndataput.put("comments","aaaa");
		assigndataput.put("createdBy",PostRequestSteps.userId_env);
		assigndataput.put("dueDate",data.get(6));
		assigndataput.put("graderId",data.get(7));
		assigndataput.put("pathAttachment1","/Users/srihari/API/file1.json");
		assigndataput.put("pathAttachment2","/Users/srihari/API/file2.json");
		assigndataput.put("pathAttachment3","/Users/srihari/API/file3.json");
		assigndataput.put("pathAttachment4","/Users/srihari/API/file4.json");
		assigndataput.put("pathAttachment5","/Users/srihari/API/file5.json");
		return assigndataput;
		
		
	}
	
	
	
	public  HashMap<String,Object> programPut(String testcaseName,String sheetname) throws IOException
	{
		
		
		
		Random randomNum = new Random();
		String prog_name="Jul23-GoogleSurvivors-SDET-"+randomNum.nextInt(10);
		String prog_Desc="Jul23-GoogleSurvivors-SDET-"+randomNum.nextInt(10);
		
		
		HashMap<String,Object> programdataput=new HashMap<String, Object>();
		programdataput.put("programDescription", prog_Desc);
		//programdataput.put("programId",PostRequestSteps.progID_env);
		programdataput.put("programName",prog_name);
		programdataput.put("programStatus","inactive");
		
		
		System.out.println(programdataput);
		return programdataput;
	}
	public  HashMap<String, Object> ProgramPut(String testcaseName,String Sheetname) throws IOException
	{
	
		Random randomNum = new Random();
		String p_name="GoogleSurvivors-"+randomNum.nextInt(10);
		String p_desc="Sdet-"+randomNum.nextInt(10);
		HashMap<String,Object> progdataput=new HashMap<String,Object>();
		progdataput.put("programDescription",p_desc);
		progdataput.put("programId",PostRequestSteps.progID_env);
		progdataput.put("programName",p_name);
		progdataput.put("programStatus","active");
		System.out.println(progdataput);
		return progdataput;
	}
	
	
}