Code:-
import java.util.*;
public class Main
{	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("HI, please enter your name:");
		String aa=s.nextLine();
		System.out.println("hey "+aa);
		System.out.println("1.Dal fry -40 \n2.paneer utter masala -100\n3.chicken curry -120\n4.fish fry -100\n5.tomato curry -30\n");
		System.out.println("select from this menu:");
		int c=s.nextInt();
		System.out.println("please enter quantity:");
		int n=s.nextInt();
		switch (c) {

		case 1:
			System.out.println("you selected dal fry pay "+n*40 +"rs");
			int b=s.nextInt();
			if(b==n*40) {
				System.out.println("order placed kindly wait");
			}
			else {
				System.out.println("INVALID");
			}
			break;
		case 2:
			System.out.println("you selected paneer butter masala pay "+n*100 +"rs");
			b=s.nextInt();
			if(b==n*100) {
				System.out.println("order placed kindly wait");
			}
			else {
				System.out.println("INVALID");
			}
			break;
		case 3:
			System.out.println("you selected chicken curry pay "+n*120 +"rs");
			b=s.nextInt();
			if(b==n*120) {
				System.out.println("order placed kindly wait");
			}
			else {
				System.out.println("INVALID");
			}
			break;
		case 4:
			System.out.println("you selected fish fry pay "+n*100 +"rs");
			b=s.nextInt();
			if(b==n*100) {
				System.out.println("order placed kindly wait");
			}
			else {
				System.out.println("INVALID");
			}
			break;
		case 5:
			System.out.println("you selected tomato curry pay "+n*30 +"rs");
			b=s.nextInt();
			if(b==n*30) {
				System.out.println("order placed kindly wait");
			}
			else {
				System.out.println("INVALID");
			}
			break;
		}

	}
}

Output:
HI, please enter your name:
rajitha
hey rajitha
1.Dal fry -40 
2.paneer utter masala -100
3.chicken curry -120
4.fish fry -100
5.tomato curry -30

select from this menu:
2
please enter quantity:
3
you selected paneer butter masala pay 300rs
300
order placed kindly wait
