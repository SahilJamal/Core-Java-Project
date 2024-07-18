package mypack1;

public class credits extends Thread{
	public void dis1()
	{
		int i,j,k;
		for(i=1;i<6;i++)
		{for(k=1;k<15;k++)
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
			 for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
				if((i==1 && j==1) || (j==5 && (i==2 || i==3 || i==4 || i==5)) || i==3)
				{
					System.out.print("* ");
				}
				else if(i==1 && j==5)
				{
					System.out.print("   * ");
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
			for(k=1;k<3;k++)
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
			if(j==1)
			{
				System.out.print("* ");
			}
			else if((j==2 && i==3) || (j==3 && i==2) || (j==4 && i==1) || (j==3 && i==4) || (j==4 && i==5))
			{
				System.out.print(" * ");
			}
			/*else if
			{
				System.out.print(" * ");
			}*/
			else 
			{
				System.out.print("  ");
			}
			System.out.println();
	}
	System.out.print("\n");
		for(i=1;i<6;i++)
		{
		for(k=1;k<30;k++)
				System.out.print(" ");
		for(j=1;j<6;j++)
		{
	       if(i==1 && j==1)
		   {
			   System.out.print("*    ");
		   }                                             //y
		   else if(i==1 && j==5)
		   {
			   System.out.print("* ");
		   }
		   else if(i==2 && j==2)
		   {
			 System.out.print(" * ");  
		   }
		   else if(i==2 && j==4)
		   {
			   System.out.print(" *  ");
		   }
			else if(j==3 && (i==3 || i==4 || i==5))
			{
				System.out.print("  *    ");
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
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
				{
					System.out.print("* ");
				}
				else                                                               //o
				{
					System.out.print("  ");
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
			System.out.println();
	}
	System.out.print("\n");
		for(i=1;i<6;i++)
		{
			for(k=1;k<30;k++)
				System.out.print(" ");
			              for(j=1;j<6;j++)
			{
			if(j==1 || i==1 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
			{
				System.out.print("* ");
			}
			else                                         //f
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
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
				{
					System.out.print("* ");
				}
				else                                                               //o
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
				}
			System.out.println();
	}
			System.out.print("\n");
		for(i=1;i<6;i++)
		{
			for(k=1;k<3;k++)
				System.out.print(" ");
			              for(j=1;j<6;j++)
			{
			if(j==1 || i==1 || i==3 || (j==5 && i==2))
			{
				System.out.print("* ");
			}
			else                                         //p
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
	       if(i==1 && j==1)
		   {
			   System.out.print("*    ");
		   }                                             //y
		   else if(i==1 && j==5)
		   {
			   System.out.print("* ");
		   }
		   else if(i==2 && j==2)
		   {
			 System.out.print(" * ");  
		   }
		   else if(i==2 && j==4)
		   {
			   System.out.print(" *  ");
		   }
			else if(j==3 && (i==3 || i==4 || i==5))
			{
				System.out.print("  *    ");
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
	}
		public void dis2()
		{
			int i,j,k;
			for(i=1;i<6;i++)
			{
				
				for(k=1;k<3;k++)
					System.out.print(" ");
				              for(j=1;j<6;j++)
				{
				if(j==1 || i==1 || i==3 || (j==5 && i==2))
				{
					System.out.print("* ");
				}
				else                                         //p
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
					}                                                       //e
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
				for(k=1;k<4;k++)
						System.out.print(" ");
		              for(j=1;j<6;j++)
					{
					if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
					{
						System.out.print("* ");
					}                                                       //e
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
					if(i==1)
					{
						System.out.print("* ");
					}                                               //t
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
				System.out.println();
	        }
			System.out.println("\n");
			for(i=1;i<6;i++)
			{
				for(k=1;k<45;k++)
					System.out.print(" ");
				              for(j=1;j<6;j++)
				{
				if(j==1 || i==1 || i==3 || (j==5 && (i==2 || i==4) ) || i==5)
				{
					System.out.print("* ");
				}
				else                                         //b
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
		       if(i==1 && j==1)
			   {
				   System.out.print("*    ");
			   }                                             //y
			   else if(i==1 && j==5)
			   {
				   System.out.print("* ");
			   }
			   else if(i==2 && j==2)
			   {
				 System.out.print(" * ");  
			   }
			   else if(i==2 && j==4)
			   {
				   System.out.print(" *  ");
			   }
				else if(j==3 && (i==3 || i==4 || i==5))
				{
					System.out.print("  *    ");
				}
			}
				System.out.println();
	        }
			System.out.println("\n");
			for(i=1;i<6;i++)
			{
				for(k=1;k<15;k++)
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
					for(k=1;k<3;k++)
						System.out.print(" ");
				for(j=1;j<6;j++)
				{
					if((i==1 && j==1) || (j==5 && (i==2 || i==3 || i==4 || i==5)) || i==3)
					{
						System.out.print("* ");
					}
					else if(i==1 && j==5)
					{
						System.out.print("   * ");
					}
					else if(j==1 && (i==2 || i==4 || i==5))
					{
						System.out.print("*    ");
					}                                                      //h
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
					if(j==1 || i==5)
					{
						System.out.print("* ");
					}
					else 
					{                                                //h
						System.out.print("  ");
					}
					}
				System.out.println();
	        }
			System.out.println("\n");

	        }
		
		public void dis3()
		{
			int i,j,k;
			System.out.print("\n");
		for(i=1;i<6;i++)
		{
		for(k=1;k<3;k++)
				System.out.print(" ");
		for(j=1;j<6;j++)
		{
	       if((i==1 && j==1) || (i==1 && j==5) || (i==2 && j==2) || (i==2 && j==4) || (j==3 && (i==3 || i==4 || i==5)))
	       {
	    	   System.out.print("* ");
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
		for(k=1;k<4;k++)
					System.out.print(" ");
				for(j=1;j<6;j++)
				{
				if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
				{
					System.out.print("* ");
				}
				else                                                               //o
				{
					System.out.print("  ");
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
			for(k=1;k<6;k++)
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
					System.out.println();
		}	
		}
		public void dis4()
		{
			int i,j,k;
			System.out.print("\n");
			for(i=1;i<6;i++)
			{
				for(k=1;k<3;k++)
					System.out.print(" ");
			for(j=1;j<6;j++)
			{
		       if((i==1 && j==1) || (i==1 && j==5) || (i==2 && j==2) || (i==2 && j==4) || (j==3 && (i==3 || i==4 || i==5)))
		       {
		    	   System.out.print("* ");
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
			for(k=1;k<4;k++)
						System.out.print(" ");
					for(j=1;j<6;j++)
					{
					if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
					{
						System.out.print("* ");
					}
					else                                                               //o
					{
						System.out.print("  ");
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
				for(k=1;k<10;k++)
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
					for(k=1;k<3;k++)
						System.out.print(" ");
					for(j=1;j<6;j++)
					{
					if((j==1 && (i==2 || i==3 || i==4)) || (i==1 && (j==2 || j==3 || j==4 )) || (i==5 && (j==2 || j==3 || j==4)) || (j==5 && (i==2 || i==3 || i==4)))
					{
						System.out.print("* ");
					}
					else                                                               //o
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
					if(j==1 || i==1 || i==5 || (i==3 && (j==1 || j==2 || j==3 || j==4)))
					{
						System.out.print("* ");
					}
					else 
					{
						System.out.print("  ");
					}
					}
					              System.out.println();
			}
		
		}
		public void dis6()
		{
			int i,j,k;
			System.out.print("\n");
			for(i=1;i<6;i++)
			{
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
					for(k=1;k<8;k++)
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
					if(i==1)
					{
						System.out.print("* ");
					}                                                                    //t
					else if(j==3 && (i==2 || i==3 || i==4 || i==5))
					{
						System.out.print("  *   ");
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
				if(i==1 || j==5 || i==3)
				{
					System.out.print("* ");
				}
				else if(j==1 && (i==2 || i==4 || i==5))
				{
					System.out.print("*    ");                                       //a
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
			}
			for(k=1;k<3;k++)
						System.out.print(" ");
				for(j=1;j<6;j++)
				{
					if(i==1)
					{
						System.out.print("* ");
					}                                                                    //t
					else if(j==3 && (i==2 || i==3 || i==4 || i==5))
					{
						System.out.print("  *   ");
					}
					else 
					{
							System.out.print(" ");
					}
				}   // game start
					System.out.println(" ");
			}
		}
	public static void main(String[] args) {
		
			credits C=new credits();
			C.dis1();
			System.out.println("\n");
			C.dis2();
			C.dis3();
			C.dis4();
			C.dis6();
	}}

