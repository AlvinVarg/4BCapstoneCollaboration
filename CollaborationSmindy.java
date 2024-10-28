public class CollaborationSmindy {

	public static void main(String [] args){

		squareArray(5,5);

	}

	public static void squareArray(int x, int y)
	{
		int[][]newArray = new int[x][y];

		for(int i = 0; i<x; i++)
		{
			for(int j =0; j<y; j++)
			{
				int rand = (int)(Math.random()*10)+1;
				newArray[i][j] =rand;
				System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}