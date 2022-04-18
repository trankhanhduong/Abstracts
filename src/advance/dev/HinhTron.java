package advance.dev;
public class HinhTron extends Hinh {
	private double banKinh;
	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	@Override
	double chuvi() {
		// TODO Auto-generated method stub
		return (banKinh *2 * Math.PI);
	}
	@Override
	double dientich() {
		// TODO Auto-generated method stub
		return banKinh * banKinh * Math.PI;
	}
	

}