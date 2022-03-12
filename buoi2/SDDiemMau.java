package buoi2;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau a = new DiemMau(5,10,"trang");
		a.hienthi();
		
		DiemMau b = new DiemMau();
		b.nhap();
		b.doidiem(10,8);
		System.out.println("B: "+b);
		b.ganMau("vang");
		System.out.println("B: "+b);
		

	}

}
