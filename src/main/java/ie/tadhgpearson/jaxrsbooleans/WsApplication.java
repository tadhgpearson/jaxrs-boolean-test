package ie.tadhgpearson.jaxrsbooleans;

import org.glassfish.jersey.server.ResourceConfig;

public class WsApplication extends ResourceConfig {

	public WsApplication() {
		setApplicationName("jaxrs-jersey-tomcat");
		// separate packages with ';'
		packages(true, "ie.tadhgpearson.jaxrsbooleans");

	}
}
