/**
 * 
 */
package com.singtel.dtassignment.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.singtel.dtassignment.model.Animal;

/**
 * @author mshafi
 * Rest API to query animals
 */
@Path("/")
public class AnimalService {

	@GET
	@Path("/{param}")
	public Response whatAnimalSays(@PathParam("param") String animalName)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = "com.singtel.dtassignment."+animalName;
		Animal animal = (Animal) Class.forName(className).newInstance();
		String output = animalName + " says : " + animal.sing();
		return Response.status(200).entity(output).build();
	}

}
