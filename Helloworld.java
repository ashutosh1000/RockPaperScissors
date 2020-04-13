package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println(message);
      String a[]=new String [4];
		for(int i=1;i<=50;i++)
	{
		System.out.println(i+" Iteration:");
		for(int j=0;j<a.length;j++)
		{
			double rand=Math.random();
			if(rand>=0 && rand<=0.33)
				a[j]="rock";
			if(rand>0.33 && rand<=0.66)
				a[j]="paper";
			if(rand>0.66 && rand<=0.99)
				a[j]="scissors";
	    }
      String format = "| %1$-10s| %2$-10s| %3$-10s| %4$-10s|\n";
      System.out.format(format, "Player 1", "Player 2", "Player 3","Player 4");
      System.out.format(String.format(format, (Object[]) a));
      System.out.println("__________________________________________________________");
		String arr[][]=new String [4][4];
		for(int k=0;k<4;k++)
		{
			for(int l=0;l<4;l++)
			{
				if(l==k)
					arr[k][l]="-";
				else
				{
					if((a[k].compareTo(a[l])==0)||
							(a[k].contentEquals("rock") && a[l].contentEquals("paper"))||
							(a[k].contentEquals("scissors") && a[l].contentEquals("rock"))||
							(a[k].contentEquals("paper") && a[l].contentEquals("scissors")))
						arr[k][l]="0";
					else
						arr[k][l]="1";
				}
			}
		}
		String format1 = "%1$-10s| %2$-10s| %3$-10s| %4$-10s| %5$-10s|\n";
		System.out.println(" ");
		System.out.println("------------------------------------------------------------");
		System.out.println("Total      |                Against                        |");
		System.out.println("------------------------------------------------------------");
		System.out.format(format1, "Player wins","Player 1", "Player 2", "Player 3","Player 4");
		String format2 = "   %1$-10s";
		for(int k=0;k<4;k++)
		{
			System.out.print("Player "+(k+1)+"  ");
			for(int l=0;l<4;l++)
			{
				System.out.format(format2, arr[k][l]);
			}
			System.out.println("\n");
		}
	}
   }
}