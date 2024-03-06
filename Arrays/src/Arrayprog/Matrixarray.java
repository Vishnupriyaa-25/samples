package Arrayprog;

public class Matrixarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][] = {{2,3,1},{5,8,6},{8,9,5}};
int b[][] = {{4,5,6},{8,5,3},{6,4,9}};
int c[][] = new int[3][3];
for (int i=0;i<3;i++) {
for (int j=0;j<3;j++) {
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+ " ");

}
System.out.println();
}

	}}

