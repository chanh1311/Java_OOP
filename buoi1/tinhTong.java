package buoi1;
import java.util.Scanner;
public class tinhTong {

	public static int input() {
		Scanner Sc = new Scanner(System.in);
		String s; int n;


		do {
			//System.out.print("nhap vao 1 so ");
			s=Sc.nextLine();
			try {
				n=Integer.parseInt(s);
			}
			catch(Exception e) {
				System.out.println("loi!!!,Nhap lai");
				System.out.print("Nhap lai: ");
				n=Integer.MAX_VALUE;

			}
		}
		 while (n==Integer.MAX_VALUE);
		
			return n;
		}		
	public static void main( String[] args ) {
		int a,b;
		System.out.print("nhap a = ");
			a=tinhTong.input();
		System.out.print("nhap b = ");
			b=tinhTong.input();
		System.out.print("tong = " +(a+b));
		
	}
	}

