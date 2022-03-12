package buoi3.SinhVien;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("NHAP VAO SO SINH VIEN CNTT MUON NHAP: ");
		int n=nhapSot();
		SinhVienCNTT sv[] = new SinhVienCNTT[n];
		for(int i=0;i<n;i++) {
			System.out.printf("---NHAP THONG TIN SV %d---\n",i+1);
			sv[i]= new SinhVienCNTT();
			sv[i].nhap();
		}
//		sc.nextLine();
		System.out.println("NHAP VAO EMAIL CAN TIM? ");
		String e=sc.nextLine();
		int t=0;
		int idex=0;
		
		for(int i=0;i<n;i++) {
			if(sv[i].getEmail().equals(e)==true) {
				idex=i;
				t=1;
			}
		}
		if(t==1) 
			sv[idex].hienThi();
		else System.out.println("khong tim thay");
		
		
	
		
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
