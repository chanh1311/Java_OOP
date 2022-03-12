package buoi3.SinhVien;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
//		SinhVien sv1 = new SinhVien();
//		sv1.nhap();
//		sv1.chuyenDiem();
//		sv1.hienThi();
//		System.out.println(sv1.toString());
//		sv1.themnHP();
//		System.out.println("THONG TIN SINH VIEN: "+sv1.toString());
//		sv1.xoaHPn();
//		System.out.println("sinh vien sau khi xoa hp la:");
//		System.out.println("THONG TIN SINH VIEN: "+sv1.toString());
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ban muon nhap may sv?");
		int n=nhapSot();
		SinhVien sv[] = new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.printf("***THONG TINH SV %d***\n",i+1);
			sv[i]= new SinhVien();
			sv[i].nhap();
//			sv[i].chuyenDiem();
		}
		
		sv[1].themnHP();
		
		for(int i=0;i<n;i++) {
			if(sv[i].diemTB()<1) {
				System.out.println("---CAC SV BI CANH CAO HOC VU---");
				sv[i].hienThi();
			}
		}
		float diemtbmax=sv[0].diemTB();
		for(int i=1;i<n;i++) {
			if(sv[i].diemTB()>diemtbmax) {
				diemtbmax=sv[i].diemTB();
			}
		}
		System.out.println("****SV CO DIEM TB CAO NHAT LA****");
		for(int i=0;i<n;i++) {
			if(sv[i].diemTB()==diemtbmax)
				sv[i].hienThi();
		}
		hienThiTen(sv,n);
		System.out.println("----CAC SV SAU KHI DUOC SX THEO TEN LA:");
		for(int i=0;i<n;i++) {
			System.out.printf("****THONG TIN SINH VIEN %d****\n",i+1);
			sv[i].hienThi();
		}
		
		
	}


	
	
	
	
	
	
	
	public static void hienThiTen(SinhVien sv[], int n) {
		SinhVien t = new SinhVien();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n-1; j++) {
				if ((sv[i].getTen().charAt(0))>(sv[j].getTen().charAt(0))) {
					t = sv[i];
					sv[i] = sv[j];
					sv[j] = t;
				}
			}
		}
	}
	
	
	
	
	
	public static int nhapSot() {
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
}
