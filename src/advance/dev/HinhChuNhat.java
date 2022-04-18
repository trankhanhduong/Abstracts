package advance.dev;

public class HinhChuNhat extends Hinh {
	 private double dai ;
	 private double rong;
	 private double bankinh;
	 public HinhChuNhat(double dai , double rong, double bankinh) {
		 super();
		 this.dai = dai;
			this.rong = rong;
			this.bankinh= bankinh;
	 }
	 

	@Override
	double chuvi() {
		// TODO Auto-generated method stub
		return (dai+rong)   * 2;
	}

	@Override
	double dientich() {
		// TODO Auto-generated method stub
		return (dai+ rong);
	}

}
