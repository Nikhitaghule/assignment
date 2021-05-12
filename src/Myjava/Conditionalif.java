/**
 * 
 */
package Myjava;
  
public class Conditionalif {

	 public static void main(String[] args) {
		int x=69;
		int y=89;
		int z=79;
		int largestnumber=(x > y) ? (x > z ? x: z):(y > z ? y: z);
		System.out.println("the largest numbers is: "+largestnumber);

	}

}
