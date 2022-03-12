package buoi2;

import java.util.Scanner;

public class DiemMau extends diem {
	private String mau;

	
	public DiemMau() {
		super();
		String mau = new String("red");
	}
	public DiemMau(int x,int y,String mau) {
		super(x,y);
		this.mau= new String(mau);
	}
	public DiemMau(DiemMau d) {
		super(d);
		this.mau=new String(d.mau);
	}
	public void ganMau(String mau) {
		this.mau = new String(mau);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("mau cua diem: ");
		mau=sc.nextLine();
	}
	public void hienthi1() {
		super.hienthi();
		System.out.print(mau);
	}
	public String toString() {
		return super.toString()+mau;
	}
	
	
	

}
