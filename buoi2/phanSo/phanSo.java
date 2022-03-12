package buoi2.phanSo;

import java.util.Scanner;

public class phanSo {
	private int tu;
	private int mau;
	public phanSo(int tu, int mau) {
		//super();
		this.tu = tu;
		this.mau = mau;
	}
	public phanSo() {
		//super();
	}
	public phanSo(phanSo a) {
		this.tu=a.tu;
		this.mau=a.mau;
	}
	public int nhapSoTu() {
		String s =new String();
		int a=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			s=sc.nextLine();
			try {
				a=Integer.parseInt(s);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("nhap lai chu sooooo,nhap lai:");
			}
		}
		return a;
	}
	public int nhapSoMau() {
		String s =new String();
		int a=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			s=sc.nextLine();
			try {
				a=Integer.parseInt(s);
				if(a==0)
					System.out.println("nhap lai 1 so  khac 0");
				else break;
			}
			catch(NumberFormatException e) {
				System.out.println("nhap lai chu sooooo,nhap lai:");
			}
		}
		return a;
	}
	public void nhap() {
		System.out.println("nhap vao tu:");
		tu=nhapSoTu();
		System.out.println("nhap vao mau:");
		mau=nhapSoMau();
	}
	public void hienThi() {
//		if(tu*mau<0)
//			System.out.println("-"+tu+"/"+mau);
//		else if(tu!=0) System.out.println(tu+"/"+mau);
//		if(tu==0 ||mau==1)
//			System.out.println(tu/mau);
//		
//		}
		if(tu==0)
			System.out.println("0");
		else	if(mau==1) 
			System.out.println(tu);
		else	if(mau==-1) 
			System.out.println("-"+tu);
			
		else 	if(mau==tu)
			System.out.println("1");
		else {
			if(tu*mau<0)
			System.out.println("-"+(int)Math.abs(tu)+"/"+(int)Math.abs(mau));
			else System.out.println((int)Math.abs(tu)+"/"+(int)Math.abs(mau));
		}
		
	}
	public void nghichDao() {
		int t=tu;
		tu=mau;
		mau=t;
		System.out.println(tu+"/"+mau);
	}
	public phanSo nghichDaoGt() {
		return new phanSo(mau,tu);
	}
	public float giaTriThuc() {
		return (float)tu/mau;
	}
	public phanSo cong(phanSo a) {
		return new phanSo(tu*a.mau+a.tu*mau,mau*a.mau);
	}
	public phanSo tru(phanSo a) {
		return new phanSo(tu*a.mau-a.tu*mau,mau*a.mau);
	}
	public phanSo nhan(phanSo a) {
		return new phanSo(tu*a.tu,mau*a.mau);
	}
	public phanSo chia(phanSo a) {
		return new phanSo(tu*a.mau,mau*a.tu);
	}
	public boolean lonHon(phanSo a) {
		phanSo t = new phanSo(tu,mau);
		if(t.giaTriThuc()>a.giaTriThuc())
			return true;
		return false;
	}
	public phanSo congSo(int a) {
		return new phanSo(mau*a+tu,mau);
	}
public phanSo truSo(int a) {
	return new phanSo(mau*a-tu,mau);
	}
public phanSo nhanSo(int a) {
	return new phanSo(tu*a,mau);
}
public phanSo chiaSo(int a) {
	return new phanSo(tu,a*mau);
}
	public phanSo toiGian() {
		return new phanSo(tu/ucln(tu,mau),mau/ucln(tu,mau));
	}
	public int ucln(int a, int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else b=b-a;
		}
		return a;
	}
	
}
	
	

