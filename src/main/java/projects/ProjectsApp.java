/**
 * 
 */
package projects;

import projects.dao.DbConnection;

/**
 * @author Candace Samuels
 *
 */
public class ProjectsApp { // inside the projects package create a class with the main() method to test connection 

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main() method 
		
		DbConnection.getConnection(); // DbConncection method
		

	}

}
