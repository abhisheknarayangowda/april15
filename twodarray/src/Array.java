
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] twoDimentional = {{"1","1"},{"2","2"},{"3","3"},{"4","4"}};
System.out.println("before updating an array: ");
printArray(twoDimentional);
twoDimentional[3][0]="5";
System.out.println("after updating an array element: ");
printArray(twoDimentional);
	
	}
	
	private static void printArray(String[][] twoDimentional)
	{
		for(int i=0;i<twoDimentional[0].length;i++)
		{
			for(int j=0;j<twoDimentional[0].length;j++)
			{
				System.out.print(twoDimentional[i][j]);
			}
			System.out.println("");
		}
	}

}
