package advance.dev;

public class MaiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinh h = new HinhTron(5);
		h.chuvi();
		h.dientich();
		System.out.println("chu vi: "+h.chuvi());
		System.out.println("dien tich:"+ h.dientich());
		Hinh h1 = new HinhChuNhat(10, 5, 5);
		h1.chuvi();
		h1.dientich();
		System.out.println("-------------------");
		System.out.println("chu vi: "+h1.chuvi());
		System.out.println("dien tich:"+ h1.dientich());
		Hinh h2 = new HinhTamGiac(11, 8, 6, 5);
		h2.chuvi();
		h2.dientich();
		System.out.println("-------------------");
		System.out.println("chu vi :"+h2.chuvi());
		System.out.println("dien tich:"+ h2.dientich());
	}

}
