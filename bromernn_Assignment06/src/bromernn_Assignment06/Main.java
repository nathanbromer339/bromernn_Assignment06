/**
 * Author: Nathan Bromer
 * Assignment: 06
 * Professor: Bill Nicholson
 * Due Date: 03/08/2018
 * Class: IT2040C | Section: 02 | Semester: Spring 2018
 * Description: This is the class for project euler problem 18 to find the solution. 
 */
package bromernn_Assignment06;

public class Main {

	public static void main(String[] args) {

		System.out.println(new Main().run()); // prints out a run of the calculation
		System.out.println(new Main().run2());

	}

	public String run() {
		for (int i = triangle.length - 2; i >= 0; i--) { // basic calculation
			for (int j = 0; j < triangle[i].length; j++) // uses a form of dual array programming to compare the above
				triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]); //this makes it move down to the next row in the list
		}
		return Integer.toString(triangle[0][0]);// return statement for run() constructor
	}
	
	//same as above just with the bigger triangle
	public String run2() {
		for (int i = triangle2.length - 2; i >= 0; i--) { 
			for (int j = 0; j < triangle2[i].length; j++)
				triangle2[i][j] += Math.max(triangle2[i + 1][j], triangle2[i + 1][j + 1]);
		}
		return Integer.toString(triangle2[0][0]);
	}

	private int[][] triangle = { // triangle 1 array list

			{ 3 }, 
			{ 7, 4 }, 
			{ 2, 4, 6 }, 
			{ 8, 5, 9, 3 }

	};
	
	private int[][] triangle2 = { // triangle 2 array list(you know the bigger one this assignment is on)
			
			{75},
			{95, 64},
			{17, 47, 82},
			{18, 35, 87, 10},
			{20, 04, 82, 47, 65},
			{19, 01, 23, 75, 03, 34},
			{88, 02, 77, 73, 07, 63, 67},
			{99, 65, 04, 28, 06, 16, 70, 92},
			{41, 41, 26, 56, 83, 40, 80, 70, 33},
			{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
			{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
			{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
			{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
			{63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
			{04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23},	
	
	};
	
}
