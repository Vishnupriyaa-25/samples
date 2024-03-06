package Arrayprog;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,6,8,20,29};
System.out.println("Array in forward order");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i] + " ");
	System.out.println();
}
System.out.println("Array in reverse order");
for (int i = arr.length-1; i>=0; i--) {
System.out.print(arr[i] + " ");
}		
	}
}