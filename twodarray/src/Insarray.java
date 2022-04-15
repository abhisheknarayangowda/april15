import java.util.Scanner;

public class Insarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] twodArray = new int[3][2];
Scanner  s1= new Scanner(System.in);
System.out.println("please enter the values to be added");
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		twodArray[i][j]=s1.nextInt();
	}
	System.out.println();
}
System.out.println("yoyr output would be as below:");
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
	System.out.print(twodArray[i][j] + " " );
}
System.out.println();
}



	}

}
