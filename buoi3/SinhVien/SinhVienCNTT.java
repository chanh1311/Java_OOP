package buoi3.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

import buoi2.Date0;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan;
	private String matkhau;
	private String email;
	/**
	 * 
	 */
	public SinhVienCNTT() {
		super();
		taikhoan =new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		this.taikhoan= new String(sv.taikhoan);
		this.matkhau= new String(sv.matkhau);
		this.email= new String(sv.email);
	}
	
	public SinhVienCNTT(String mssv, String hoten, Date0 ngaysinh, int soluonghp, ArrayList<String> hocphan,
			ArrayList<String> diem,String taikhoan,String matkhau,String email) {
		super(mssv, hoten, ngaysinh, soluonghp, hocphan, diem);
		this.taikhoan=new String(taikhoan);
		this.matkhau=new String(matkhau);
		this.email=new String(email);
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap tai khoan: ");
		taikhoan=sc.nextLine();
		System.out.print("Nhap mat khau: ");
		matkhau=sc.nextLine();
		System.out.print("Nhap email: ");
		email=sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("\nTAI KHOAN: "+ taikhoan);
		System.out.println("MAT KHAU: "+ "*******");
		System.out.println("email: "+ email);
	}
	public  String toString() {
		return super.toString()+"TAI KHOAN: "+taikhoan+", "+"MATKHAU:*******, "+"EMAIL: "+email+" HET!!! ]";
	}
	public void doiMatKhau( String newpassword) {
		this.matkhau=new String(newpassword);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
