package model;

/**
 * DESCRIPTION: 
 * This is a class meant for creating the Face Data Structure in which the information would be stored.
 * It is a part of the model package of the MVC Architectural Pattern.
 * 
 * CAPABILITIES:
 * It creates a data structure for loading Face information which includes a list of all vertices
 * which make a specific face.
 *
 */

//Importing the required libraries.
import java.util.*;

public class Face {

	public List<Vertex> vertices = new ArrayList<Vertex>();
}
