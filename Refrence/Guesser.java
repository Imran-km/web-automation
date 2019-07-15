import java.util.*;
class Umpire1{
			public int gnum;
			public int pnum1;
			public int pnum2;
			public int pnum3;
			
			public void gnum1()
				{
						
						Scanner scan=new Scanner(System.in);
			
					System.out.print("Enter Guesser Number= ");
					gnum=scan.nextInt();
				}
			public void pnum()
			{
				
				Scanner scan=new Scanner(System.in);
			System.out.print("Enter player1 Number= ");
				pnum1=scan.nextInt();
			System.out.print("Enter player2 Number= ");
				pnum2=scan.nextInt();
			System.out.print("Enter player3 Number= ");
				pnum3=scan.nextInt();
			}
			public void umpire()
			{
			
	
				if(gnum==pnum1)
				{
						System.out.println("Player Number1 matched with Guesser number");
						
				}
				else if(gnum==pnum2)
				{
						System.out.println("Player Number2 matched with Guesser number");
						
				}
				else if (gnum==pnum3)
				{
						System.out.println("Player Number3 matched with Guesser number");
						
				}

				else
				{
						System.out.println("Player Numbers not matched with Guesser number");
				}

			}
}
class Guesser{

		public static void main(String[] args){
			
			Umpire1 u=new Umpire1();
			u.gnum1();
			u.pnum();
			u.umpire();
				
		}
}
