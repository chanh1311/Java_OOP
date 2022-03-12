package buoi1;

public class TongDoiSo {

	public static void main(String[] args) {
		Double tong=0.0, n =0.0;
		for(String x :args) {
			try {
				n = Double.parseDouble(x);//chuyen doi string thanh double//
			}
			catch(Exception e) {
				n = 0.0;
			}
			tong+=n;
		}
		System.out.print("tong = " + tong);
	}
	
}
