  package com.codenuclear;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class RestXMLService 
{
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	
	public Student getStudentDetails(@PathParam("id") int stuId)
	{
		
		Student stu = new Student();
		stu.setStuName("Smith");
		stu.setStuCity("Australia");
		stu.setStuId(stuId);
		
		return stu;
	}
}