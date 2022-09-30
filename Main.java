import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); //takes in a stdout variable
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(s); //prints "Hello, World." and concats it to the stdout var ffrom line 8
	}
}
