package pattern.level.alpha;

public class Y {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(j==n-i+1||i==j&&i<=n/2)
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
