package ArrayModAPP;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayModAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		// get a 20 integer array and display
		int[] integer=new int[20];
		System.out.print("Enter up to 20 integers.");
		for (int i=0;i<integer.length;i++) {
			integer[i]=userinput.nextInt();
		}
		userinput.nextLine();
		// allow the user to edit this array and display and determine when done
		System.out.print("The original sequence is: " + Arrays.toString(integer));
		System.out.print("\nEnter q to stop editing\n");
		String index="";
		String newint="";
		while (!index.equals("q")&&!newint.equals("q")) {
			System.out.println("\nEnter the index of the integer you want to edit");
			index=userinput.nextLine();
			if (index.equals("q")) {
				break;
			}
			System.out.println("Enter the new integer");
			newint=userinput.nextLine();
			if (index.equals("q")) {
				break;
			}
			int index1=Integer.parseInt(index);
			int newint1=Integer.parseInt(newint);
			integer[index1]=newint1;
			System.out.print("The new sequence is: " + Arrays.toString(integer));
			System.out.print("\nEnter q to stop editing\n");
		}
		// sort the array and display
		Arrays.sort(integer,0,20);
		System.out.print("The sorted sequence is: " + Arrays.toString(integer));
	}

}
