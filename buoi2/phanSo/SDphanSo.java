package buoi2.phanSo;

import java.util.Scanner;





public class SDphanSo {

	public static void main(String[] args) {
		
		
		phanSo a= new phanSo(3,7);
		a.hienThi();
		phanSo b= new phanSo(4,9);
		b.hienThi();
		phanSo x= new phanSo();
		x.nhap();
		x.hienThi();
		phanSo y= new phanSo();
		y.nhap();
		y.hienThi();
		System.out.println("nghiach dao cua x:");
		x.nghichDaoGt().hienThi();
		System.out.println("tong x+y da toi gian:");
		x.cong(y).toiGian().hienThi();
		
		
//		System.out.println("nhap n:");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		phanSo t[] = new phanSo[n];
//		for(int i=0;i<n;i++) {
//			t[i]=new phanSo();
//		}
//		for(int i=0;i<n;i++) {
//			System.out.printf("nhap phan so thu %d ",i+1);
//			t[i].nhap();
//		}
//		System.out.println("day pso vua nhap la: ");
//		for(int i=0;i<n;i++) {
//			t[i].toiGian().hienThi();
//			System.out.print("\n");
//		}
//		phanSo tong = new phanSo();
//		tong=t[0];
//		for(int i=1;i<n;i++) {
//			tong=tong.cong(t[i]);
//		}
//		System.out.println("tong cua day so se la: ");
//		tong.toiGian().hienThi();
//		phanSo kt = new phanSo();
//		//kt=t[0];
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(t[i].giaTriThuc()>t[j].giaTriThuc()) {
//					kt=t[i];
//					t[i]=t[j];
//					t[j]=kt;
//				}
//					
//			}
//		}
//		System.out.println("day pso sau khi sx la: ");
//		for(int i=0;i<n;i++) {
//			t[i].toiGian().hienThi();
//			System.out.print("\n");
//		}
//		System.out.println("phan so lon nhat la:");
//		t[n-1].toiGian().hienThi();
//		
		//cach2//
		System.out.println("nhap n: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		phanSo m[] = new phanSo[n];
		for(int i=0;i<n;i++) {
			m[i] = new phanSo();
			System.out.printf("-----phan so thu %d-----\n",i+1);
			m[i].nhap();
		}
		System.out.print("day vua nhaP:\n");
		for(int i=0;i<n;i++) {
			m[i].toiGian().hienThi();
			System.out.print("\n");
		}
		
		System.out.println("tong day so la:");
		tongDaySo(m,n).toiGian().hienThi();
		System.out.println("so lon nhat trong day la: ");
		phanSoMax(m,n).toiGian().hienThi();
		System.out.println("day so sau khi sap xep la:");
		sapXep(m,n);
		for(int i=0;i<n;i++) {
			m[i].toiGian().hienThi();
			System.out.print("\n");
		}
	}
		
	
		static phanSo tongDaySo(phanSo m[],int n) {
			phanSo mai=new phanSo();
			mai=m[0];
			for(int i=1;i<n;i++) {
				mai=mai.cong(m[i]);
			}
			return mai;
		}

	static void sapXep(phanSo m[], int n) {
		phanSo tam = new phanSo();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n-1; j++) {
				if (m[i].giaTriThuc() > m[j].giaTriThuc()) {
					tam = m[i];
					m[i] = m[j];
					m[j] = tam;
				}

			}

		}
	}
	
	
	
		static phanSo phanSoMax(phanSo m[],int n) {
			sapXep(m,n);
			return  m[n-1];
			
		}
		
		
			
	}


