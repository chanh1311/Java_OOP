package buoi3.gach;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluong;
	private int chieudai;
	private int chieungang;
	private long gia;

	public Gach(String maso, String mau, int soluong, int chieudai, int chieungang, long gia) {
//	super();
		this.maso = new String(maso);
		this.mau = new String(mau);
		this.soluong = soluong;
		this.chieudai = chieudai;
		this.chieungang = chieungang;
		this.gia = gia;
	}

	public Gach() {
		this.maso = new String();
		this.mau = new String();
		this.soluong = 1;
		this.chieudai = 1;
		this.chieungang = 1;
		this.gia = 1000;
	}

	public Gach(Gach g) {
		this.maso = new String(g.maso);
		this.mau = new String(g.mau);
		this.soluong = g.soluong;
		this.chieudai = g.chieudai;
		this.chieungang = g.chieungang;
		this.gia = g.gia;
	}

	public static long nhapso() {
		int n = 0;
		String s = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				s = sc.next();// nhan vao mot ki tu dau//
				n = Integer.parseInt(s); // ép kiểu//
				if (n > 0) {
					break;
				} else {
					System.out.println("Vui long nhap lai so duong");
				}

			} catch (NumberFormatException e) {
				System.out.print(s + " khong phai so nguyen!");
				System.out.print("vui long nhap lai: ");

			}
		}
		return n;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap maso: ");
		maso = sc.nextLine();
		System.out.println("nhap mau: ");
		mau = sc.nextLine();
		System.out.println("nhap so luong: ");
		soluong = (int) nhapso();
		System.out.println("nhap chieu dai: ");
		chieudai = (int) nhapso();
		System.out.println("nhap chieu ngang: ");
		chieungang = (int) nhapso();
		System.out.println("nhap gia: ");
		gia = (long) nhapso();

	}

	public void hienThi() {
		System.out.printf("--maso la: %s\n", maso);
		System.out.printf("--mau la: %s\n", mau);
		System.out.printf("--so luong la: %d\n", soluong);
		System.out.printf("--chieu dai la: %d\n", chieudai);
		System.out.printf("--chieu ngang la: %d\n", chieungang);
		System.out.print("--gia la: " + gia + "\n");
	}

	public float giaBanLe() {
		return (float) (gia / soluong * 1.2);
	}

	public int dienTichHop() {
		return (int) (chieudai * chieungang * soluong);
	}

	public int soLuongH(int D, int N) {
		return (int) ((D * N) / dienTichHop());// them float?//
	}

//public int soluonghop(int D,int N) {
//	return (int)Math.ceil((D*N)/dienTichHop());
//				
//}
	public int soluonghop(int D, int N) {
		return (int) Math.ceil((float) (D * N) / dienTichHop());

	}

	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		this.chieudai = chieudai;
	}

	public int getChieungang() {
		return chieungang;
	}

	public void setChieungang(int chieungang) {
		this.chieungang = chieungang;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

}
