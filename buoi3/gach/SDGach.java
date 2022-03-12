package buoi3.gach;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n:");
		int n=sc.nextInt();
		Gach a[] =new Gach[n];
		for(int i=0;i<n;i++) {
			a[i]=new Gach();
			System.out.printf("\n____Nhap loai %d____\n",i+1);
			a[i].nhap();
			
		}
		System.out.println("****CAC LOAI GACH VUA NHAP****\n");
		for(int i=0;i<n;i++) {
			System.out.printf("\n----Gach loai %d----\n",i+1);
			a[i].hienThi();
		}
		Gach m= new Gach();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((a[i].getGia()/a[i].dienTichHop())>(a[j].getGia()/a[j].dienTichHop())){
						m=a[i];
						a[i]=a[j];
						a[j]=m;
					
			}
		}
		}
			
			System.out.println("=====GACH SAU KHI SAP XEP====\n");
			for( int i=0;i<n;i++) {
				System.out.printf("\n----Gach loai %d----\n",i+1);
				a[i].hienThi();
			}
		System.out.println("\n>>>>>>> GACH CO GIA RE NHAT LA:<<<<<<<<");
		a[0].hienThi();
		
		
		for( int i=0;i<n;i++) {//k biet chua//
			System.out.println("GIA KHI DUNG LOAI"+ (i+1)+ " LOT NEN LA:"+ ((int)a[i].soLuongH(2000,500)*(int)(a[i].getGia())));
			System.out.println(a[i].getMaso()+" : "+(a[i].getGia()*a[i].soluonghop(2000,500)));
			
		}
		

	}

	
	}


