package com.example.JerseyCrudDemo.resources;


import java.util.List;

import com.example.JerseyCrudDemo.daoclass.Studentdao;
import com.example.JerseyCrudDemo.model.Student;


import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResources {
	
	
	// Create Instance of studentdao class
	Studentdao studentdao = new Studentdao();
	
	
	// Using Simple @GET Request
	@GET
	@Path("getAllStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() {

		return studentdao.getallStudents();
		
	}
	
	
	
	
	
	
    // Using @QueryParam to GET Operations
	@GET
	@Path("getStudentQuery")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentByQuery(@QueryParam("id") int id){

		return studentdao.getstudentbyId(id);
		
	}
	
	

	
	
	
	

	
	
	
	
	// Using @QueryParam to DELETE Operations
		@DELETE
		@Path("removeStudentquery")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Student> removeStudentusingQuery(@QueryParam("id") int id) {

			return studentdao.removeStudent(id);
			
		}
	
	
				
	
	
	
	
	
	  // Using @QueryParam to PUT Operations
	  
	  @PUT
	  
	  @Path("updateStudentquery")
	  
	  @Produces(MediaType.APPLICATION_JSON) 
	  public List<Student> updateStudentsQuery(@QueryParam("id") int sid, Student student) {
	 
	  return studentdao.updateStudent(sid, student.getName());
	  
	  }
	 
	 
	
}
