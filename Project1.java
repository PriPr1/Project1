/*
* Class: CMSC203
* Instructor: Professor Khandan Monshi
* Description: The objective of this program is to run 11 rounds of guessing a color
* and if it's incorrect the program will keep asking till the answer is correct and at the
* end will return values of how many rounds were won, the name, description, and due date.
* Due: 09/11/2023
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Priyanka Estoll
*/

import java.util.Scanner; //imports scanner library
import java.util.Random; //imports random library
public class Project1
{
	public static void main(String[] args) 
	{ //opens main function
		String name, description, dueDate; //declared variables

		
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		System.out.println("Enter Name: ");
		name = input.nextLine(); //assigns name variable
		
		System.out.println("Describe yourself: ");
		description = input.nextLine(); //assigns description variable
		
		System.out.println("Due Date: ");
		dueDate = input.nextLine(); //assigns dueDate variable
		
		int counter = 0; //determines score at the end of the program
		for (int i = 1;i < 11; i++) // i defined value for while loop
		{ //opens for loop
			
			String color,answer = "Black"; //initialized variable for answer that will get replaced
			
			System.out.println("Round " + i);
			System.out.println("I am thinking of a color. \n Is it Red, Orange, Yellow, Green, Blue, Purple, Pink?");
			System.out.println("Enter your guess: ");
			color = input.nextLine();
			System.out.println();
			
			int randomColor = randomNumber.nextInt(7); //random color will select a number at random in the switch statement and each number assigns answer a string value.
			switch(randomColor)
			{
				case 0:
					answer = "Red";
					break;
				case 1:
					answer = "Orange";
					break;
				case 2:
					answer = "Yellow";
					break;
				case 3:
					answer = "Green";
					break;
				case 4:
					answer = "Blue";
					break;
				case 5:
					answer = "Purple";
					break;
				case 6:
					answer = "Pink";
					break;
			}
			
			
				if(color.equals("Red")) //conditional checks if string color matches any of the colors in the selected list
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer)) //conditional checks if color and answer are the same and if they are it iterates counter
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Orange"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Yellow"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Green"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Blue"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Purple"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else if(color.equals("Pink"))
				{
					System.out.println("I was thinking of " + answer + "\n");
					if(color.equals(answer))
					{
						counter = counter + 1;
					}
				}
				else
				{
					//error message
					System.out.println("You entered incorrect color. Is it Red, Orange, Yellow, Green, Blue, Purple, Pink?\n"+ "Enter your guess again:");
					color = input.nextLine();
					System.out.println("I was thinking of " + answer + "\n");
				}
		}//closes for loop
		
		System.out.println("You guessed " + counter + "/10 colors correctly."); //displays score
		
		//End of code
				System.out.println("User Name: " + name);
				System.out.println("User Description: " + description);
				System.out.println("Due date: " + dueDate);
	} //closes main function
}//closes class