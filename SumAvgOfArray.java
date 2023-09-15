import java.util.Scanner;
public class SumAvgOfArray {
	void userinput()
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int a=sc.nextInt();
		System.out.println("Enter the array: ");
		int arr[]=new int[a];
		int sum=0,avg;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("User Input Sum = "+sum);
		avg=sum/arr.length;
		System.out.println("User Inuput Avg = "+avg);
	}
	void input()
	{
		int a[]= {1,2,3,4,5};
		int sum=0,avg;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum = "+sum);
		avg=sum/a.length;
		System.out.println("Avg = "+avg);
	}
	public static void main(String[] args) {
		SumAvgOfArray s=new SumAvgOfArray();
		s.userinput();		
		s.input();
	}
}
