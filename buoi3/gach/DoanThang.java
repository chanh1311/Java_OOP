package buoi3.gach;

import buoi2.diem;

public class DoanThang {
	private diem d1;
	private diem d2;

	public DoanThang() {
		// super();
		d1 = new diem();
		d2 = new diem();
	}

	public DoanThang(diem a, diem b) {
		// super();
		d1 = new diem(a);
		d2 = new diem(b);
	}

	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new diem(ax, ay);
		d2 = new diem(bx, by);
	}
	public void nhap() {
		System.out.println("nhap diem dau mut thu 1: ");
		d1.nhap();
		System.out.println("nhap diem dau mut thu 2: ");
		d2.nhap();
	}
	public void hienThi() {
		System.out.println("DIEM DAU MUT THU 1 LA: ");
		d1.hienthi();
		System.out.println("\nDIEM DAU MUT THU 2 LA: ");
		d2.hienthi();
	}
	public DoanThang doDoi(int dx,int dy) {
		return new DoanThang(d1.doidiem(dx,dy),d2.doidiem(dx,dy));
	}
	public float doDai() {
		return (float)d1.khoangcach(d2);
	}
}
