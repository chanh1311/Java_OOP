package buoi2;

public class SDDate0 {

	public static void main(String[] args) {
		Date0 a=new Date0(29,2,2020);
		a.hienThi();
//		System.out.println("\n");
//		a=a.ngayMai();
//		a.hienThi();
//		System.out.println("\n");
//		Date0 b=new Date0();
//		b.nhap();
//		b.hienThi();
//		System.out.println("\n");
//		b=b.congNgay(18);
//		b.hienThi();
		Date0 c =new Date0();
		c.nhap();
		if(c.hopLe1()==true)
		System.out.println("ngay lop le!!!");
		else System.out.println("ngay khong hop le!!!");
	}

}
