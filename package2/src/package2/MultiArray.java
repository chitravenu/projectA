package package2;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int x[][]= new int [2][3];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[1][0]=4;
		x[1][1]=5;
		x[1][2]=6;
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(x[i][j]);
			}
		}
		

	}

}
