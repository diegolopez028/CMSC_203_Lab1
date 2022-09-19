import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		Movie i = new Movie();

		
		System.out.println("Enter the title of a movie: ");
		String title = in.nextLine();
		i.setTitle(title);
		System.out.println("Enter the rating of the movie: ");
		String rating = in.nextLine();
		i.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int tickets = in.nextInt();
		i.setSoldTickets(tickets);
		System.out.println(i);
		System.out.println("Do you want to enter another ? (y or n)");
		String loop = in.next();
		if(loop.equalsIgnoreCase("y")||loop.equalsIgnoreCase("n")) 
		{
			while(loop.equalsIgnoreCase("y")) 
			{
				in.nextLine();
				System.out.println("Enter the title of a movie: ");
				title = in.nextLine();
				i.setTitle(title);
				System.out.println("Enter the rating of the movie: ");
				rating = in.nextLine();
				i.setRating(rating);
				System.out.println("Enter the number of tickets sold for this movie: ");
				tickets = in.nextInt();
				i.setSoldTickets(tickets);
				System.out.println(i);
				System.out.println("Do you want to enter another ? (y or n)");
				loop = in.next();
		}
		
			System.out.println("Done");
		}
		
		
		
	

		
		
		
		
		
		
	}
		
		
		

	}


