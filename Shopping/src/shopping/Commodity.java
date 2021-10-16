package shopping;

public class Commodity {
	private int Id;//商品单价
	private String name;//商品名称
	private double price;//商品单价
	private String type;//商品类型
	private String address;//商品发货地
	public Commodity(int id, String name, double price, String type, String address) {
		this.Id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Id=" + Id + ", name=" + name + ", price=" + price + ", type=" + type + ", address=" + address;
	}
	
	
}
