package mypack1;
import mypack1.demo;
import java.util.*;
class loging extends Thread 
{	
	Scanner sc=new Scanner(System.in);
	public void run()
	{ 
		try
		{
		int choice;
		System.out.println("\n");
		System.out.println("Enter Choice:\n1:Sign_Up\n2:Sign_In\n3:exit");
		choice=sc.nextInt();
		if(choice==1)
		{
			Sign_up U=new Sign_up();
			U.dis();
		}
		else if(choice==2)
		{
			Sign_inn I=new Sign_inn();
			I.dis1();	
		}
		else if(choice==3)
		{
			 credits C=new credits();
		      C.dis1();
		      System.out.println("\n");
		      System.out.println("\n");
		      System.out.println("\n");
		      System.out.println("\n");
		      C.dis2();
		}
		else
		{
			System.out.println("Wrong input");
			loging L=new loging();
			L.run();
		}
		}
		catch(Exception e)
		{
			
		}
	}
}
class demo extends Thread
{
	public void run()
	{
		int i,j,k;
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		for(i=1;i<6;i++)
		{
			for(k=1;k<10;k++)
				System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(j==1)
				{
				System.out.print("* ");}
				else if(j==5)
				{
					System.out.print(" *");
				}
				else if((i==3 && j==3) || (i==4 && (j==4 || j==2)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				try
				{
					sleep(25);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				}
			}
				for(k=1;k<4;k++)
					System.out.print(" ");
	              for(j=1;j<6;j++)
				{
				if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
				for(k=1;k<4;k++)
					System.out.print(" ");
				for(j=1;j<6;j++)
				{
				if(j==1 || i==5)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
				for(k=1;k<4;k++)
					System.out.print(" ");
					for(j=1;j<6;j++)
				{
				for(j=1;j<6;j++)
				{
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 || j==5)) || (i==5 && (j==2 || j==3 || j==4 || j==5)) )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
				}
				for(k=1;k<4;k++)
					System.out.print(" ");
				for(j=1;j<6;j++)
				{
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
				for(k=1;k<4;k++)
					System.out.print(" ");
							for(j=1;j<6;j++)
			{
				if(j==1)
				{
				System.out.print("* ");}
				else if(j==5)
				{
					System.out.print(" *");
				}
				else if((i==3 && j==3) || (i==2 && (j==4 || j==2)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				for(k=1;k<4;k++)
					System.out.print(" ");
				              for(j=1;j<6;j++)
				{
				if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
			System.out.println(" ");
		}
		System.out.println("\n");
		System.out.println("\n");
			
		for(i=1;i<6;i++)
		{for(k=1;k<30;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1)
				{
					System.out.print("* ");
				}
				else if(i==1 && j==5)
				{
					System.out.print("*");
				}
				else if(j==3)
				{
					System.out.print("  *   ");
				}
				else
				{
					System.out.print(" ");
					try
					{
						sleep(25);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
			}
			for(k=1;k<4;k++)
					System.out.print(" ");
					for(j=1;j<6;j++)
				{
				for(j=1;j<6;j++)
				{
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				}
			}
			System.out.println("  ");
			}
		System.out.println("\n");
		System.out.println("\n");
		   
		for(i=1;i<6;i++)
		{
			for(k=1;k<2;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || (i==5 && (j==1 || j==2)) || (j==3 && i==3) || (i==3 && (j==3 || j==4 || j==5)) || (j==5 && (i==3 || i==4 || i==5)))
				{
					System.out.print("* ");
				}
				else if(j==3 && (i==4 || i==5))
				{
					System.out.print("*  ");
				}
				else if(j==1 && i==2)
				{
					System.out.print("*     ");
				}                                                                    //g
				else if(j==1 && (i==3 || i==4))
				{
					System.out.print("*  ");
				}
				else 
				{
						System.out.print(" ");
						try
						{
							sleep(25);
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
				}
			}
			for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(j==5 && (i==1 || i==2 || i==3 || i==4) || (i==5 && (j==3 || j==4)))
				{
					System.out.print("* ");
				}
				else if(j==1 && (i==1 || i==2 || i==3 || i==4))
				{                                                                        //u
				    System.out.print("*   ");
				}
				else if(i==5 && j==2)
				{
					System.out.print(" * ");
				}
				else 
				{
						System.out.print(" ");
				}
			}
			for(k=1;k<4;k++)
						System.out.print(" ");
		              for(j=1;j<6;j++)
					{
					if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
					{                                                                         //e
						System.out.print("* ");
					}
					else 
					{
						System.out.print("  ");
					}
					}
			for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || i==3 || i==5)
				{
					System.out.print("* ");
				}                                                                    //s
				else if(i==2 && j==1)
				{
					System.out.print("*     ");
				}
				else if(i==4 && j==5)
				{
					System.out.print("    * ");
				}
				else 
				{
						System.out.print(" ");
				}
			}
			for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || i==3 || i==5)
				{
					System.out.print("* ");
				}                                                                    //s
				else if(i==2 && j==1)
				{
					System.out.print("*     ");
				}
				else if(i==4 && j==5)
				{
					System.out.print("    * ");
				}
				else 
				{
						System.out.print(" ");
				}
			}
			for(k=1;k<4;k++)
						System.out.print(" ");
		              for(j=1;j<6;j++)
					{
					if(i==1 || i==5 || (j==3 && (i==2 || i==4 || i==3)))
					{                                                            //i
						System.out.print("* ");
					}
					else 
					{
						System.out.print("  ");
					}
					}
					for(k=1;k<4;k++)
						System.out.print(" ");
		              for(j=1;j<6;j++)
					{
					if(j==5 || (j==2 && i==2) || (j==3 && i==3) || (j==4 && i==4))
					{
						System.out.print("* ");
					}
					else if(j==1)
					{                                                                 //n
						System.out.print("*  ");
					}
					else 
					{
						System.out.print("  ");
					}
					}
					for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || (i==5 && (j==1 || j==2)) || (j==3 && i==3) || (i==3 && (j==3 || j==4 || j==5)) || (j==5 && (i==3 || i==4 || i==5)))
				{
					System.out.print("* ");
				}
				else if(j==3 && (i==4 || i==5))
				{
					System.out.print("*  ");
				}
				else if(j==1 && i==2)
				{
					System.out.print("*     ");
				}                                                                    //g
				else if(j==1 && (i==3 || i==4))
				{
					System.out.print("*  ");
				}
				else 
				{
						System.out.print(" ");
				}
		}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("\n");
		   
		for(i=1;i<6;i++)
		{
			for(k=1;k<30;k++)
				System.out.print(" ");
              for(j=1;j<6;j++)
			{
			if(j==5 || (j==2 && i==2) || (j==3 && i==3) || (j==4 && i==4))
			{
				System.out.print("* ");
			}
			else if(j==1)
			{                                                                 //n
				System.out.print("*  ");
			}
			else 
			{
				System.out.print("  ");
				try
				{
					sleep(25);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			}
			for(k=1;k<3;k++)
			System.out.print(" ");
	for(j=1;j<6;j++)
	{
		if(j==5 && (i==1 || i==2 || i==3 || i==4) || (i==5 && (j==3 || j==4)))
		{
			System.out.print("* ");
		}
		else if(j==1 && (i==1 || i==2 || i==3 || i==4))
		{                                                                        //u
		    System.out.print("*   ");
		}
		else if(i==5 && j==2)
		{
			System.out.print(" * ");
		}
		else 
		{
				System.out.print(" ");
		}
	}
		for(k=1;k<4;k++)
				System.out.print(" ");
						for(j=1;j<6;j++)
		{
			if(j==1)
			{
			System.out.print("* ");}
			else if(j==5)
			{                                           //m
				System.out.print(" *");
			}
			else if((i==3 && j==3) || (i==2 && (j==4 || j==2)))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		for(k=1;k<3;k++)
			System.out.print(" ");
		              for(j=1;j<6;j++)
		{
		if(i==1 || i==3 || i==5 || j==1 || j==5)
		{
			System.out.print("* ");
		}
		else 
		{
			System.out.print("  ");
		}                                            //b
		}
		for(k=1;k<4;k++)
				System.out.print(" ");
			              for(j=1;j<6;j++)
			{
			if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
			{
				System.out.print("* ");
			}
			else                                         //e
			{
				System.out.print("  ");
			}
			}
			for(k=1;k<3;k++)
		System.out.print(" ");
for(j=1;j<6;j++)
{
if(i==1 || (j==5 && (i==2 || i==3)) || i==3)
	{
		System.out.print("* ");
	}
	else if(j==1 && i==2)
	{
		System.out.print("*    ");                                       //r
	}
	else if(j==1 && i==4)
	{
		System.out.print("*  ");
	}
	else if(j==1 && i==5)
	{
		System.out.print("*   ");
	}
	else if(i==4 && j==4)
	{
		System.out.print("*   ");
	}
	else if(i==5 && j==5)
	{
		System.out.print("*  ");
	}
	else 
	{
			System.out.print(" ");
	}
}  System.out.println();
}			
	System.out.println("\n");
	System.out.println("\n");
	for(i=1;i<6;i++)
	{
			for(k=1;k<10;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || (i==5 && (j==1 || j==2)) || (j==3 && i==3) || (i==3 && (j==3 || j==4 || j==5)) || (j==5 && (i==3 || i==4 || i==5)))
				{
					System.out.print("* ");
				}
				else if(j==3 && (i==4 || i==5))
				{
					System.out.print("*  ");
				}
				else if(j==1 && i==2)
				{
					System.out.print("*     ");
				}                                                                    //g
				else if(j==1 && (i==3 || i==4))
				{
					System.out.print("*  ");
				}
				else 
				{
						System.out.print(" ");
						try
						{
							sleep(25);
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
				}
			}     
			
		          for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if(i==1 || j==5 || i==3)
				{
					System.out.print("* ");
				}
				else if(j==1 && (i==2 || i==4 || i==5))
				{
					System.out.print("*    ");
				}                                                      //a
				else 
				{
						System.out.print(" ");
				}
			}
			for(k=1;k<4;k++)
						System.out.print(" ");
								for(j=1;j<6;j++)
				{
					if(j==1)
					{
					System.out.print("* ");}
					else if(j==5)
					{
						System.out.print(" *");
					}
					else if((i==3 && j==3) || (i==2 && (j==4 || j==2)))
					{
						System.out.print("*");                                         //m
					}
					else
					{
						System.out.print(" ");
					}
				}
					for(k=1;k<4;k++)
						System.out.print(" ");
					              for(j=1;j<6;j++)
					{
					if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
					{
						System.out.print("* ");
					}
					else 
					{                                                             //e
						System.out.print("  ");
					}
					}
		
					System.out.println(" ");
			}
	System.out.println("\n");
	for(i=1;i<6;i++)
	{
	for(k=1;k<40;k++)
			System.out.print(" ");
	for(j=1;j<6;j++)
	{
		if((i==1 && (j==2 || j==3 || j==4)) || (j==4 && (i==1 || i==2)) || (j==5 && i==3))
		{
			System.out.print(" * ");
		}
		else if(j==2 && (i==1 || i==2 ))
		{
			System.out.print(" *   ");
		}
		else if((j==1 && i==3) || (j==4 && (i==3 || i==4)))
		{
			System.out.print("*");
		}
        else if(j==2 && i==3)
		{
			System.out.print(" *    ");
		}
        else if(j==2 && i==4)
		{
			System.out.print(" *    ");
		}
        else if(j==3 && i==5) 
		{
			System.out.print("   *   ");
		}				
		else 
		{
				System.out.print(" ");
		}
	}    
		System.out.println();
		}
	}
}
public class sahil extends Thread
{
	public static void main(String args[]) throws Exception
	{
	demo ob1=new demo();
	
	ob1.start();
	
	Thread.sleep(1600);
	loging L=new loging();
	L.run();
	
	
	
}	
}