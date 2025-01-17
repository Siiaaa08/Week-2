//importing util package for taking input from the users
import java.util.*;
//creating a class MovieTicket class with attributes movieName, seatNumber, and price 
class MovieTicket {
	Random random = new Random();
    boolean[] seats=new boolean[100];
   public MovieTicket() {
        Arrays.fill(seats, true); // All seats are available
    }
	String movieName;
	int seat;
	int price=400;
	
	
	void bookticket(String movieName){
		this.movieName=movieName;
		this.seat=ticketBooking();
		System.out.println("The ticket has been booked for movie "+movieName+". Your seat number is "+seat+" and the total amount is "+price);
	}
	
	//for booking seats randomly
	int ticketBooking(){ 
		int k= random.nextInt(101);
		if(seats[k]){
			seats[k]=false;
		return k;}
		else{
			return ticketBooking();
		}
	
	}
}
class MovieTicketBooking{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
       MovieTicket ticket=new MovieTicket();
		System.out.print("Enter the no of tickets you wants to book :- ");
		int m=sc.nextInt();
		System.out.println();
		 sc.nextLine();

		for(int i=0;i<m;i++){
		System.out.print("Enter the name of movie :- ");
		String movie=sc.nextLine();
		System.out.println();
		
		ticket.bookticket(movie);
		}
		
		
		
    }
}