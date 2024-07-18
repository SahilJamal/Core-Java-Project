package mypack1;
import java.util.*;
import java.sql.*;
public class Sign_up {
	Scanner sc=new Scanner(System.in);
	Connection con;
	int sum=0;
	String user,pass,email;
	public Sign_up() throws Exception
	{
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sahil","root","");
	}
	public void dis()  throws Exception
	{
	System.out.println("Enter user,email and password in respective order ");
	user=sc.next();
	email=sc.next();
	pass=sc.next();
	
	 String g="insert into score(sc,user,email) values('"+sum+"','"+user+"','"+email+"');";
	 PreparedStatement	psmt=con.prepareStatement(g);
	 int row=psmt.executeUpdate();
	
	 g="insert into loging(user,email,password) values('"+user+"','"+email+"','"+pass+"');";
	 psmt=con.prepareStatement(g);
	 row=psmt.executeUpdate();

	
	
	if(row>0)
	{
		System.out.println("Save Success");
		 Sign_inn I=new Sign_inn();
		 I.dis1();
	}
	else
	{
		System.out.println("Something went wrong");
	}		
		
	}
	    public static void main(String[] args) throws Exception {
         Sign_up U=new Sign_up();
         U.dis();
	    }
	}