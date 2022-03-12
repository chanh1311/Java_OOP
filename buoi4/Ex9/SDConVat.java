package Ex9;

import java.util.Scanner;

public class SDConVat {
//	public static ConVat create(int ran) {
//		switch(ran) {
//		case 1: 
//			return new Cho();
//		case 2: return new Heo();
//		default: return new De();	
//		}
	public static void main(String[] args) {
		System.out.println("so luong: ");
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	ConVat a[]=new ConVat[n];
	for(int i=0;i<n;i++) {
		System.out.print("ban muon nhap con vat thu"+(i+1)+" la con vat nao?"+"(1.con cho)/(2.conheo)/(3.conde)/(4.conga)" );
		int c =sc.nextInt();
		if (c==1) {
		a[i] = new Cho();
		a[i].nhap();
		System.out.println("--------Con cho-------- ");
		a[i].hienThi();
		a[i].keu();
		}
		else if(c==2) {
			a[i] = new Heo();
			a[i].nhap();
			System.out.println("-----------Con Heo--------- ");
			a[i].hienThi();
			a[i].keu();
		}
		else if(c==3) {
			a[i] = new De();
			a[i].nhap();
			System.out.println("------------Con De---------- ");
			a[i].hienThi();
			a[i].keu();
		}
		else {
			a[i] = new Ga();
			a[i].nhap();
			System.out.println("------------Con GA---------- ");
			a[i].hienThi();
			a[i].keu();
		}
		
//	int ran=(int) (Math.random()*3+1);
//       a[i]=create(ran);
//       a[i].keu();
//	   }
//	System.out.println(Math.random()*4);
//
	}
}
}
