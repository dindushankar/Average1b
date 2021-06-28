import java.util.*;
class Average1b
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int score[]=new int[10],student_no,sum=0;
		double avg;
		System.out.print("the scores:");
		for(student_no=0;student_no<10;student_no++)
		{
			score[student_no]=((int)(Math.random()*10000))%101;
			sum+=score[student_no];		
			System.out.print(score[student_no]+" ");
		}
		avg=average(sum,student_no);
		System.out.println("\nno. of students:"+student_no);
		System.out.println("total score:"+sum);
		System.out.print("average of score:");
		fraction(avg,2);
	}
	static double average(int sum,int student_no)
	{
		if(student_no==0) return 0;
		return (double)sum/student_no;
	}
	static void fraction(double avg,int c)
	{
		int a=(int)avg;
		System.out.print(a+".");
		avg=avg-a;		
		while(c>0)
		{
			avg=avg*10;
			a=(int)avg;
			avg=avg-a;
			System.out.print(a);
			c--;
		}
	}
}