package Ex9;

import java.util.Scanner;

public class SDConvat1 {
	public static ConVat create(int ran) {
		switch(ran) {
		case 1: 
			return new Cho();
		case 2: return new Heo();
		default: return new De();	
		}
	}
	public static void main(String[] args) {
		System.out.println("so luong: ");
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	ConVat a[]=new ConVat[n];
	for(int i=0;i<n;i++) {
		//a[i]=new ConVat();
	int ran=(int) (Math.random()*3+1);
       a[i]=create(ran);
       a[i].keu();
	   }
	System.out.println(Math.random()*4);
}
}