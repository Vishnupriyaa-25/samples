package Arrayprog;

public class Copypaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[] = {1,2,3,4,5};
int arr2[] = new int[arr1.length];
// copy 1 array to another
for (int i=0;i<arr1.length;i++) {
arr2[i] = arr1[i];
}
//elements of first array
System.out.println("Elements of first array:");
for (int i=0; i<arr1.length;i++) 
{
System.out.print(arr1[i] + ",");
}
//elements of second array
System.out.println("elemets of new array:");
for (int i=0; i<arr2.length;i++)
{
System.out.print(arr2[i] + ",");
}
		
		
		
		
		
		
	}

}
