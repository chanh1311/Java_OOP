package buoi2;

import java.util.Scanner;

public class Date0 {
	private int ngay;
	private int thang;
	private int nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public Date0(int ngay, int thang, int nam) {
		// super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public Date0() {
		this.ngay = 13;
		this.thang = 11;
		this.nam = 2000;
	}
	public Date0(Date0 a) {
		this.ngay=a.ngay;
		this.thang=a.thang;
		this.nam=a.nam;
	}
	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
		System.out.printf("%d/%d/%d", ngay, thang, nam);
	}

	public int nhapSo() {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		int a = 0;
		while (true) {
			s = sc.nextLine();
			try {
				a = Integer.parseInt(s);
				if (a < 0)
					System.out.println("hay nhap vao so duong!");
				else
					break;

			} catch (NumberFormatException e) {
				System.out.println("ban hay nhap vao chu so,nhap lai ok!!!\n");
			}

		}
		return a;

	}

	public void nhap() {
		System.out.println("nhap ngay");
		ngay = nhapSo();
//		Date0 d =new Date0(ngay,1,2000);
		while(true) {
			if(ngay>31) {
			System.out.println("vui long nhap ngay ho le ok?");
			System.out.println("nhap ngay");
			ngay = nhapSo();
			}
			else 
				break;
			
		}
		System.out.println("nhap thang");
		thang = nhapSo();
		while(true) {
			if(thang>12) {
			System.out.println("nhap lai thang cho dung,ok!");
			System.out.println("nhap thang");
			thang = nhapSo();
			}
			else break;
		}
		System.out.println("nhap nam");
		nam = nhapSo();

	}

	public boolean hopLe() {
		int ngaymax = 0;
		if (thang > 12)
			return false;
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			ngaymax = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			ngaymax = 30;
			break;
		case 2:
			if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
				ngaymax = 29;
			else
				ngaymax = 28;
			break;
		}
		if (ngay <= ngaymax)
			return true;
		return false;

	}

	public boolean hopLe1() {
		int ngaymax[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
			ngaymax[2] = 29;
		if (ngay <= ngaymax[thang] && thang<13 )
				return true;
		return false;
	}

	public Date0 ngayMai() {
		Date0 t = new Date0(ngay + 1, thang, nam);
		if (t.hopLe() == true)
			return t;
		Date0 t1 = new Date0(1, thang + 1, nam);
		if (t1.hopLe() == true)
			return t1;
		return new Date0(1, 1, nam + 1);

	}

	public Date0 congNgay(int n) {
		Date0 a = new Date0(ngay, thang, nam);
		for (int i = 0; i < n; i++) {
			a = a.ngayMai();
		}
		return a;

	}

	@Override
	public String toString() {
		return ngay + "/" +thang + "/" + nam;
	} 
	

}
