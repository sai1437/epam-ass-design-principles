import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		Operations op;
		Scanner sc=new Scanner(System.in);
		char q=0;
		while(q!='n')
		{
		System.out.println("1:Addition");
		System.out.println("2:Divide");
		System.out.println("3:Multiply");
		System.out.println("4:subtract");
		System.out.println("enter your choice:");
		int n=sc.nextInt();
		if(n>4)
		{
			System.out.println("enter valid option");
			continue;
		}
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		System.out.println("enter 2st number");
		int b=sc.nextInt();
		int result=0;
		if(n==1)
		{
			op=new Add();
			result=op.operations(a,b);
		}
		if(n==2)
		{
			op=new Mul();
			result=op.operations(a, b);
		}
		if(n==3)
		{
			op=new Div();
			result=op.operations(a,b);
		}
		if(n==4)
		{
			op=new Sub();
			result=op.operations(a, b);
		}
		System.out.println(result);
		System.out.println("do you want to continue y/n");
		q=sc.next().charAt(0);		
		}
		
	}
}
