package buoi2;

import java.util.Scanner;
public class diem {
	private int x;
	private int y;
	
	public diem() {
		this.x=0;
		this.y=1;
	}
	public diem(int a,int b) {
		this.x=a;
		this.y=b;
	}
	public diem(diem a) {
		this.x=a.x;
		this.y=a.y;
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap X: ");
		x=sc.nextInt();
		System.out.println("nhap Y: ");
		y=sc.nextInt();
	}
	
	public void hienthi() {
		System.out.print("("+x+","+y+") - ");
	}
	public String toString() {
		return ("("+x+","+y+") - ");
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setdiem(int x1,int y1) {
		this.x=x1;
		this.y=y1;
	}
	public diem doidiem(int dx,int dy) {
		x=x+dx;
		y=y+dy;
		return new diem(x,y);
	}
	public float khoangcach() {
		return (float)Math.sqrt(x*x+y*y);
	}
	public float khoangcach(diem d) {
		return (float)Math.sqrt(Math.pow(d.x-x,2)+Math.pow(d.y-y,2));
	}
	boolean equals(diem d){
		return x==d.x && y==d.y;
	}
}
