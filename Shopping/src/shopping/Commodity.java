package shopping;

public class Commodity {
	private int Id;//��Ʒ����
	private String name;//��Ʒ����
	private double price;//��Ʒ����
	private String type;//��Ʒ����
	private String address;//��Ʒ������
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
