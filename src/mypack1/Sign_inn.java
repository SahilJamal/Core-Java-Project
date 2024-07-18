package mypack1;
import java.util.*;
import java.sql.*;
public class Sign_inn {
	Scanner sc=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	Connection con;int ch,row;
	String str, playAgain;
	String users,pass,emails,s;
	loging L=new loging();
	credits C=new credits();
	int Level;
	int sum=0;
	ResultSet rs;
	PreparedStatement psmt;
	public Sign_inn() throws Exception
	{
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sahil","sahil","sahil@sahil");
	}
	public void dis1() throws Exception
	{
		System.out.println("Do you want to SIGN_IN with\n1: Username \n2:or Email \n3 Exit");
		ch=sc.nextInt();
		if(ch==2) {
			System.out.println("Enter your Email and password");
		    emails=sc.next();
		    pass=sc.next();}
		else if(ch==1) {
			System.out.println("Enter your Username  and password");
			users=sc.next();
			pass=sc.next();
			}
		else if(ch==3)
		{
			Sign_up U=new Sign_up();
			U.dis();	
		}
		s="select * from loging where(email='"+emails+"' OR user='"+users+"') and password ='"+pass+"'";
		PreparedStatement psmt=con.prepareStatement(s);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			System.out.println("SIGN_IN SUCCESSFUL");
			System.out.println("\n");
			C.dis6();
			System.out.println("\n");
			sc = new Scanner(System.in);
			 System.out.println("Enter the Level you want to play \n1:Easy \n2:Medium \n3:Hard \n4:quit");
			Level=sc.nextInt();
			int ans, guess, guessNum = 0;
			playAgain = "y";
			switch(Level)
			{
			case 1:
	        final int maxGuesses = 6;
	 while (playAgain.equals("y") || playAgain.equals("Y")) {
		  scan = new Scanner(System.in);
	     Random generator = new Random();
	     ans = generator.nextInt(100) + 1;                         //(101) is the range and + 1 is starting point
	     System.out.println("Guess a number between 1 and 100");
	     System.out.println("Enter 0 for Exit");
	     System.out.println("Guess a number ");
	     guess = scan.nextInt();
	     guessNum = 0;
	     while (guess != 0)
	     {
	         guessNum++;
	         if (guess == ans) {
	       	  
	            C.dis3();
	            sum+=sum;
				  sum++;
				  break;
	         } else if (guess < ans)
	             System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
	         else if (guess > ans)
	             System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
			  if(guessNum == maxGuesses) {
				  System.out.println("The number was " + ans);
					      C.dis4();
				 break;
	         }
	         System.out.println("Enter your guess (0 for quit):");
	         guess = scan.nextInt();
	     }
		  System.out.println("Your Score ="+sum);
	     System.out.println("Want to Play again?(y/n)");
	     playAgain = scan.next();
	 }
	 String g="UPDATE score SET sc='"+sum+"' WHERE (user='"+users+"' OR email='"+emails+"')";
	  psmt=con.prepareStatement(g);
	  row=psmt.executeUpdate();
	  	if(row>0)
	  	{
	    	String s1 = "select * from scores ";
	    	psmt=con.prepareStatement(s1);
	    		
	    		rs = psmt.executeQuery();
	    		
	    		System.out.println("\n----------------------SCOREBOARD--------------------------\n");
	    		while(rs.next())
	    		{	
	    			System.out.println("USER Name is : " + rs.getString("user")+"    "+"SCORE is : " + rs.getInt("sc"));
	    		}
	    		System.out.println("\n----------------------------------------------------------\n");
	  	}
	  	else
	  	{
	  		System.out.println("something not working");
	  	}
	    
	    L.run();
	    
	 break;
	 
	 
	 
		case 2:
	 final int maxGuesses1 = 7;
	 while (playAgain.equals("y") || playAgain.equals("Y")) {
		 scan = new Scanner(System.in);
	     Random generator = new Random();
	     ans = generator.nextInt(500) + 50;
	     System.out.println("Guess a number between 1 and 500");
	     System.out.println("Enter 0 for Exit");
	     System.out.println("Guess a number ");

	     guess = scan.nextInt();
	     guessNum = 0;
	     while (guess != 0)
	     {
	         guessNum++;
	         if (guess == ans) {
	             C.dis3();
	             sum+=sum;
				  sum++;
				  break;
	         } else if (guess < ans)
	             System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
	         else if (guess > ans)
	             System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
	         if (guessNum == maxGuesses1) {
	             System.out.println("The number was " + ans);
					      C.dis4();
	             break;
	         }
	         System.out.println("Enter your guess (0 for quit):");
	         guess = scan.nextInt();
	     }
	     System.out.println("Your Score ="+sum);
	     System.out.println("Want to Play again?(y/n)");
	     playAgain = scan.next();
	 }
	  g="UPDATE score SET sc='"+sum+"' WHERE (user='"+users+"' OR email='"+emails+"')";
	  psmt=con.prepareStatement(g);
	  row=psmt.executeUpdate();
	  	if(row>0)
	  	{
	    	String s1 = "select * from scores ";
	    	psmt=con.prepareStatement(s1);
	    		
	    		rs = psmt.executeQuery();
	    		
	    		System.out.println("\n----------------------SCOREBOARD--------------------------\n");
	    		while(rs.next())
	    		{	
	    			System.out.println("USER Name is : " + rs.getString("user")+"    "+"SCORE is : " + rs.getInt("sc"));
	    		}
	    		System.out.println("\n----------------------------------------------------------\n");
	  	}
	  	else
	  	{
	  		System.out.println("something not working");
	  	}
	    
	    L.run();
	    
	 break;
	 
	 
	 
		case 3:
		final int maxGuesses2 = 10;
	 while (playAgain.equals("y") || playAgain.equals("Y")) {
		  scan = new Scanner(System.in);
	     Random generator = new Random();
	     ans = generator.nextInt(1000) + 100;
	     System.out.println("Guess a number between 1 and 1000");
	     System.out.println("Enter 0 for Exit");
	     System.out.println("Guess a number ");

	     guess = scan.nextInt();
	     guessNum = 0;
	     while (guess != 0)
	     {
	         guessNum++;
	         if (guess == ans) {
	             C.dis3();
	             sum+=sum;
				  sum++;
				  break;
	         } else if (guess < ans)
	             System.out.println("Opss! Your guess was too LOW, try some higher numbers.");
	         else if (guess > ans)
	             System.out.println("Opps! Your guess was too HIGH, Try some lower numbers");
	         if (guessNum == maxGuesses2) {
	             System.out.println("The number was " + ans);
					      C.dis4();
	             break;
	         }
	         System.out.println("Enter your guess (0 for quit):");
	         guess = scan.nextInt();
	     }
	     System.out.println("Want to Play again?(y/n)");
	     playAgain = scan.next();
	 }
	  g="UPDATE score SET sc='"+sum+"' WHERE (user='"+users+"' OR email='"+emails+"')";
	  psmt=con.prepareStatement(g);
	  row=psmt.executeUpdate();
	  	if(row>0)
	  	{
	    	String s1 = "select * from scores ";
	    	psmt=con.prepareStatement(s1);
	    		
	    		rs = psmt.executeQuery();
	    		
	    		System.out.println("\n----------------------SCOREBOARD--------------------------\n");
	    		while(rs.next())
	    		{	
	    			System.out.println("USER Name is : " + rs.getString("user")+"    "+"SCORE is : " + rs.getInt("sc"));
	    		}
	    		System.out.println("\n----------------------------------------------------------\n");
	  	}
	  	else
	  	{
	  		System.out.println("something not working");
	  	}
	    
	    L.run();
	    
	 break;

	 
		case 4:
			L.run();
			break;
		}
		}
		else {
			System.out.println("Something went wrong");
			Sign_inn I=new Sign_inn();
			I.dis1();
		}
	}
	public static void main(String args[]) throws Exception
	{
		Sign_inn I=new Sign_inn();
		I.dis1();
	}
	
}

