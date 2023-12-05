package patterns.java.level1;

public class Main23 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("-");
			}
			for(int z=5;z>=i;z--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for (int i=2;i<=5;i++)
			{
			for(int j=1;j<=5;j++)
			{
				System.out.print("-");
			}
			for(int z=1;z<=i;z++)
			{
				System.out.print("*");
			}
			System.out.println();
			}

	}

}
