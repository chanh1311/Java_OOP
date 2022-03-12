package buoi3.gach;
import buoi2.diem;

public class SDdoanThang {

	public static void main(String[] args) {
		diem a = new diem(2,5);
		diem b = new diem(20,35);
		DoanThang ab = new DoanThang(a,b);
		System.out.println("doan thang ab la:");
		ab.hienThi();
		ab=ab.doDoi(5,3);
		System.out.println("do dai cua doan thang ab la: "+ ab.doDai());
		DoanThang cd = new DoanThang();
		cd.nhap();
		System.out.println("do dai cua cd la: " + cd.doDai());

	}

}
