package palindrome.checker;

public class PalindromeChecker {
	boolean Checkerpalindrome(int n)
	{
		int orignal=n;
		int rev=0;
		while(n>0)
		{
			int ld=n%10;//take last digit we use remainder formula n%10
			rev=rev*10+ld;
			n=n/10;//remove last digit we use n/10
		}
		if(orignal==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
