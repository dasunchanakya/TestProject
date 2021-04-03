package net.codejava.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hellow")
public class HellowResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String dirHellow() {
    	return "Dasun Done";
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String HtmlHellow() {
    	return "<html><title>Dasun Title</title>"
    			+"<body><h1>Hellow Fuck me hard</h1></body></html>";
    }
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Student JasonStudent() {
//    	return Student;
//    }
}
