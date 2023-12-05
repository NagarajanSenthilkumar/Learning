package pattern.level.alpha;

public class R {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||j==6&&i<=n/2||i== n/2&&j>=n/2||i>=n/2&&i==j)
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
	}

	}

}
