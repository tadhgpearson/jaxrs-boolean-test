package ie.tadhgpearson.jaxrsbooleans;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

@Path("booleans")
public class BooleanTest {

	@Inject
	private Logger logger;

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BooleanTestDTO booleanTest(@Valid BooleanTestDTO rq){
		logger.debug("Received [" + rq +"]");

		Validation.buildDefaultValidatorFactory().getValidator().validate(rq);
		BooleanTestDTO rs = rq;

	  logger.debug("Responded [" +rs + "]");

	  return rs;
	}
}
