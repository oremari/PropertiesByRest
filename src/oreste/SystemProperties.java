package oreste;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.*;
import java.util.logging.Logger;


@Path("System/properties")


public class SystemProperties {

	   private static final Logger LOGGER = Logger.getLogger(SystemProperties.class.getName());

@GET
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public Map<String, String> getSystemProperties() {	 
	
	
	LOGGER.info("Logger Name: "+LOGGER.getName());
	LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
	LOGGER.finest("Finest");
	
	 Map<String, String> result = new HashMap<>();
	 Properties props = System.getProperties();
	 for (Map.Entry<Object, Object> entry : props.entrySet()) {
	 result.put((String)entry.getKey(), (String)entry.getValue());
	 }
	
	 return result;
	 
	}






}
