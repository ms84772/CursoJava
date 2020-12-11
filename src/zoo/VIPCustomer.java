package zoo;

public class VIPCustomer extends Customer{
	
	private int vipContumerId;
	private double specialDiscount;
	public int getVipContumerId() {
		return vipContumerId;
	}
	public void setVipContumerId(int vipContumerId) {
		this.vipContumerId = vipContumerId;
	}
	public double getSpecialDiscount() {
		return specialDiscount;
	}
	public void setSpecialDiscount(double specialDiscount) {
		this.specialDiscount = specialDiscount;
	}
	
	

}
