
import java.util.Scanner;
class GradeCalculator
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of subjects:");
		int sub=sc.nextInt();
		int totalmarks=0;
		for(int i=0;i<sub;i++)
		{
			System.out.println("enter mark:");
			int marks=sc.nextInt();
			totalmarks+=marks;
		}
		double avgPercent = (double) totalmarks / (sub * 100) * 100;

        char grade;
        if (avgPercent>= 90) {
            grade = 'A';
        } else if (avgPercent >= 80) {
            grade = 'B';
        } else if (avgPercent >= 70) {
            grade = 'C';
        } else if (avgPercent>= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
		System.out.println("Total Marks:"+totalmarks);
		System.out.println("Average Percentage: "+avgPercent+"%");
        System.out.println("Grade:"+grade);
	}

}