package buoi3.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

import buoi2.Date0;

public class SinhVien {
	private String mssv;
	private String hoten;
	private Date0 ngaysinh;
	private int soluonghp;
	private  ArrayList<String> hocphan;
	private  ArrayList<String> diem;
	
	
	
	public SinhVien(String mssv, String hoten, Date0 ngaysinh, int soluonghp, ArrayList<String> hocphan, ArrayList<String> diem) {
//		super();
		this.mssv = new String(mssv);
		this.hoten =new String(hoten);
		this.ngaysinh = new Date0(ngaysinh);
		this.soluonghp = soluonghp;
		this.hocphan = new ArrayList<String>(hocphan);
		this.diem = new ArrayList<String>(diem);
	}

	public SinhVien() {
//		super();
		this.mssv = new String();
		this.hoten =new String();
		this.ngaysinh = new Date0();
		this.soluonghp = 1;
		this.hocphan = new ArrayList<String>();
		this.diem = new ArrayList<String>();
	}
	
	public SinhVien(SinhVien sv) {
//		super();
		this.mssv = new String(sv.mssv);
		this.hoten =new String(sv.hoten);
		this.ngaysinh = new Date0(sv.ngaysinh);
		this.soluonghp = sv.soluonghp;
		this.hocphan = new ArrayList<String>(sv.hocphan);
		this.diem = new ArrayList<String>(sv.diem);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-->Nhap mssv:");
		mssv=sc.nextLine();
		System.out.println("-->Nhap hoten:");
		hoten=sc.nextLine();
		System.out.println("-->Nhap ngaysinh:");
		ngaysinh.nhap();
		System.out.println("-->Nhap so luong HP:");
		soluonghp=nhapSot();
		System.out.println("-->Nhap hoc phan va diem:");
		for(int i=0;i<soluonghp;i++) {
			System.out.printf("nhap hoc phan %d:",i+1);
			hocphan.add(sc.nextLine());
			System.out.print("-->diem: ");
			diem.add(nhapDiem());
		}
		chuyenDiem();
	}
	public String nhapDiem() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		float a;
		while(true) {
			s= sc.nextLine();
			try {
				a=Float.parseFloat(s);
				if(a<0.0 || a>10.0)
					System.out.println("nhap lai diem cho dung ok?");
				else break;
			}catch(NumberFormatException e){
				System.out.println("nhap vao 1 soooooooo,nhap lai ne: ");
			}
		}
		return Float.toString(a);
	}
	
	 public ArrayList<String> chuyenDiem() {
		for(int i=0;i<soluonghp;i++) {
			if(Float.parseFloat(diem.get(i))<= 10.0 && Float.parseFloat(diem.get(i))>=9.0) 
					diem.set(i,"A");
				else if(Float.parseFloat(diem.get(i))<=8.9 && Float.parseFloat(diem.get(i))>=8.0)
					diem.set(i,"B+");
				else if(Float.parseFloat(diem.get(i))<=7.9 && Float.parseFloat(diem.get(i))>=7.0)
					diem.set(i,"B");
				else if(Float.parseFloat(diem.get(i))<=6.9 && Float.parseFloat(diem.get(i))>=6.5)
					diem.set(i,"C+");
				else if(Float.parseFloat(diem.get(i))<=6.4 && Float.parseFloat(diem.get(i))>=5.5)
					diem.set(i,"C");
				else if(Float.parseFloat(diem.get(i))<=5.4 && Float.parseFloat(diem.get(i))>=5.0)
					diem.set(i,"D+");
				else if(Float.parseFloat(diem.get(i))<=5.0 && Float.parseFloat(diem.get(i))>=4.0)
					diem.set(i,"D");
				else diem.set(i,"F");
			}
		
	return diem;
	}
	public ArrayList<String> chuyenDiemm(int t) {
//		soluonghp=soluonghp+t;
		for(int i=soluonghp-t;i<soluonghp;i++) {
			if(Float.parseFloat(diem.get(i))<= 10.0 && Float.parseFloat(diem.get(i))>=9.0) 
					diem.set(i,"A");
				else if(Float.parseFloat(diem.get(i))<=8.9 && Float.parseFloat(diem.get(i))>=8.0)
					diem.set(i,"B+");
				else if(Float.parseFloat(diem.get(i))<=7.9 && Float.parseFloat(diem.get(i))>=7.0)
					diem.set(i,"B");
				else if(Float.parseFloat(diem.get(i))<=6.9 && Float.parseFloat(diem.get(i))>=6.5)
					diem.set(i,"C+");
				else if(Float.parseFloat(diem.get(i))<=6.4 && Float.parseFloat(diem.get(i))>=5.5)
					diem.set(i,"C");
				else if(Float.parseFloat(diem.get(i))<=5.4 && Float.parseFloat(diem.get(i))>=5.0)
					diem.set(i,"D+");
				else if(Float.parseFloat(diem.get(i))<=5.0 && Float.parseFloat(diem.get(i))>=4.0)
					diem.set(i,"D");
				else diem.set(i,"F");
			}
		
	return diem;
	}
	

	public float nhapSo() {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		float a = (float)0.0;
		while (true) {
			s = sc.nextLine();
			try {
				a = Float.parseFloat(s);
				if (a < 0.0)
					System.out.println("hay nhap vao so duong!");
				else
					break;

			} catch (NumberFormatException e) {
				System.out.println("ban hay nhap vao chu so,nhap lai ok!!!\n");
			}

		}
		return a;

	}
	public int nhapSot() {
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
	public void hienThi() {
		System.out.println("---MSSV---: "+mssv);
		System.out.println("---HOTEN---: "+hoten);
		System.out.println("---ngaysinh---: "+ngaysinh);
		System.out.println("---so luong hoc phan---: "+soluonghp);
		for(int i=0;i<soluonghp;i++) {
			System.out.printf("---hoc phan %d---: ",i);
			System.out.print(hocphan.get(i)+", ");
			System.out.println(" diem "+ diem.get(i));
			
		}
		
		System.out.println("DIEMTB: "+ diemTB());
		
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String toString() {
		String s= "SinhVien [mssv= " + mssv + ", hoten= " + hoten + ", ngaysinh =" + ngaysinh.toString() + ", soluonghp =" + soluonghp
				+ ", ";
		for(int i=0;i<soluonghp;i++) {
			s=s +hocphan.get(i)+": "+diem.get(i)+", ";
		}
		s=s+",diemtb: " +diemTB()+" ";
		return s;
	}
	
	public Float diemTB() {
//		float t[]= null;
		float t[]= new float[soluonghp];
		float tam=(float)0.0;
		for(int i=0;i<soluonghp;i++) {
		if(diem.get(i).equals("A")) 
			t[i]=(float)4.0;
		else if(diem.get(i).equals("B+")) 
			t[i]=(float)3.5;
		else if(diem.get(i).equals("B")) 
			t[i]=(float)3.0;
		else if(diem.get(i).equals("C+")) 
			t[i]=(float)2.5;
		else if(diem.get(i).equals("C")) 
			t[i]=(float)2.0;
		else if(diem.get(i).equals("D+")) 
			t[i]=(float)1.5;
		else if(diem.get(i).equals("D")) 
			t[i]=(float)1.0;
		else t[i]=(float)0.0;
		tam+=t[i];
		}
		return tam/(float)soluonghp;
		
	}
	public void themnHP() {
		Scanner sc = new Scanner(System.in);
		int t;
//		String s = new String();
		System.out.println("ban muon them may hp?");
		t=nhapSot();
		soluonghp=soluonghp+t;
		for(int i=soluonghp-t;i<soluonghp;i++) {
		System.out.printf("hoc phan thu %d can them:\n",i+1);
		hocphan.add(sc.nextLine());
		System.out.println("--->diem: ");
		diem.add(sc.nextLine());
//		chuyenDiem();
		}
		diem=chuyenDiemm(t);
	}
	public void themHP() {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		soluonghp++;
		System.out.println("ban muon them hp gi?");
		s=sc.nextLine();
		hocphan.add(s);
		System.out.println("--->diem: ");
		diem.add(nhapDiem());
		diem=chuyenDiemm(1);
//		chuyenDiem();
		
	}
	public void xoaHP() {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("ban muon xoa hp gi?");
		s=sc.nextLine();
		for(int i=0;i<soluonghp;i++) {
			if(s.equals(hocphan.get(i))==true) {
				hocphan.remove(hocphan.get(i));
				diem.remove(diem.get(i));
				soluonghp--;
			}
		}
	}
	public void xoaHPn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ban muon xoa may hp?");
		int t=nhapSot();
		String s[] = new String[t];
//		soluonghp=soluonghp+t;
		for(int i=0;i<t;i++) {
			s[i]=new String();
			System.out.printf("nhap hoc phan thu %d can xoa\n",i+1);
			s[i]=sc.nextLine();
		}
		for(int i=0;i<t;i++) {
			for(int j=0;j<soluonghp;j++) {
			if(s[i].equals(hocphan.get(j))==true) {
				hocphan.remove(hocphan.get(j));
				diem.remove(diem.get(j));
				soluonghp--;
			}
		}
	}
	
}
	public String getTen() {
		String ten[] = hoten.split(" ");
		return ten[ten.length-1];
	}
}