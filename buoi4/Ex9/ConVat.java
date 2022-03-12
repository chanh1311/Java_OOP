
package Ex9;

import java.util.Scanner;
public abstract class ConVat {
	public String tenConVat;
	public String gioitinh;
	public String maulong;
	public int cannang;	
	public  ConVat() {
		tenConVat= new String();
		gioitinh = new String();
		maulong = new String();
		cannang = 0;
	}
	

	   
	//pt trừu tượng//
	public void nhap() {
		Scanner sc=new Scanner(System.in);
//		System.out.println("nhap ten con vat: ");
//		gioitinh=sc.nextLine();
		System.out.println("nhap gioi tinh: ");
		gioitinh=sc.nextLine();
		System.out.println("nhap mau long: ");
		maulong=sc.nextLine();
		System.out.println("nhap can nang: ");
		cannang=sc.nextInt();
	}
	public void hienThi() {
		System.out.println(gioitinh+"__" +maulong+"__"+cannang);
	}
	public abstract void keu();
	}


