package utilities;

public enum API_enum {
	
	AddProgram("/saveprogram"),
	AddBatch("/batches"),
	GetallProgs("/allPrograms"),
	GetByProgID("/programs/"),
	GetAllBatches("/batches"),
	GetBAtchID("/batches/batchId/"),
	AddUsers("/users/users/roleStatus"),
	AddAssignment("/assignments"),
	SubmitAssgn("/assignmentsubmission"),
	DeleteProgramID("/deletebyprogid/"),
	DeleteProgramName("/deletebyprogname/"),
	DeleteBatchID("/batches/"),
	DeleteUserID("/users/users/"),
	DeleteassignID("/assignments/"),
	DelSubmitID("/assignmentsubmission/"),
	GetAllAssign("/assignments"),
	GetAssignID("/assignments/"),
	GetAssignByBAtch("/assignments/batch/"),
	GetAllSubmissions("/assignmentsubmission"),
	GetSubByAssign("/assignmentsubmission/getGrades/"),
	GetgradByStudentID("/assignmentsubmission/getGradesByStudentId/"),
	GetgradByBatchID("/assignmentsubmission/grades/"),
	GetSubsByUserId("/assignmentsubmission/student/"),
	GetSubBYBAtchID("/assignmentsubmission/studentbatch/")
	,GetRoles("/users/users/roles"),
	GetUserId("/users/users/"),
	GetUserIdInvalid("/users/users/Invalid"),
	GetAllStaff("/users/users/getAllStaff"),
	
	updateuser("/users/users/"),
	updateuserrolestatus("/users/users/roleStatus/"),
	updateuserprogbatch("/users/users/roleProgramBatchStatus/"),
	updateprogram("/putprogram/"),
	updateprogramname("/program/"),
	updatebatchbyid("/batches/"),
	updateAssign("/assignments/"),
	updateAssignsubmit("/assignmentsubmission/"),
	putgradeAssignment("/assignmentsubmission/gradesubmission/"); 
     

	private String resource;
	API_enum(String resource)
	{
		this.resource=resource;
	}
	
	public String getresource()
	{
		return resource;
	}

}
