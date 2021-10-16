package shopping;
/*
 * Cart类
 * 存放物品的items数组
 * 加入购物车的方法：add()
 * 从购物车中删除商品的方法：delete()
 * 清空购物车的方法：clear()
 * 展示购物车内容的方法：show()
 */
import java.util.ArrayList;
public class Cart {
	private static ArrayList<Commodity> items = new ArrayList<>();//存放商品的容器
	
	public static void add(Commodity item) {//加入购物车
		items.add(item);
		
	}
	public static  void delete(int id) {//删除某商品
		Commodity item=Mall.getCommodities().get(id-1);
		items.remove(item);
		System.out.println("该商品已删除");
		show();
	}
	public static  void clear() {//清空购物车
		items.clear();
		System.out.println("购物车已清空");
	}
	public static void show() {//展示购物车内容
		System.out.println("当前购物车共有"+items.size()+"件商品");
		for (Commodity commodity : items) {
			System.out.printf("Id: %d, name: %s, price: %.2f", commodity.getId(),commodity.getName(), commodity.getPrice());
			System.out.println();
		}
	}
	
	public static void PrintSumPrice() {//购物车总价格
		double x = 0;
		for (Commodity commodity : items) {
			x += commodity.getPrice();
		}
		System.out.printf("当前购物车总价格为：%.2f",x);
		show();
	}
}
