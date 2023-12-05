package pattern.level.alpha;

public class W {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==j&&j<=2||j==n/2&&i<2||i==2&&j==4||j==5&&i<2)
				System.out.print("* ");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
	}

	}
}
