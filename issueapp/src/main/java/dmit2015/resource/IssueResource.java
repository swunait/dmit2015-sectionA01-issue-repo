package dmit2015.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dmit2015.entity.Issue;
import dmit2015.service.IssueService;

@Path("issues")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IssueResource {
	
	@Inject
	private IssueService issueService;
	
	@GET
	public List<Issue> findAll() {
		return issueService.findAllIssue();
	}
	
	@GET
	@Path("{id}")
	public Issue findOneById(@PathParam("id") long id) {
		return issueService.findOneIssue(id);
	}
	
	@POST
	public void create(Issue newIssue) {
		issueService.createIssue(newIssue);
	}
	
	@PUT
	public void update(Issue existingIssue) {
		issueService.updateIssue(existingIssue);
	}
	
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") long id) {
		Issue existingIssue = issueService.findOneIssue(id);
		issueService.deleteIssue(existingIssue);
	}
	
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloPlainText() {
		return "JAX-RS plain text message";
	}
	
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_HTML)
	public String helloHtmlText() {
		return "<p>JAX-RS <strong>HTML</strong> text message</p>";
	}
	
	

}
