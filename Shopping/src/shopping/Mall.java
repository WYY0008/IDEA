package shopping;
/*
 * Mall类
 * 存储商场所有商品的容器 commodities
 * 初始化加载商品的方法：
 * 展示所有商品的方法：
 * 搜索功能
 * 1. 按编号搜索的方法：
 * 2. 按名字搜索的方法：
 * 3. 按类型搜索的方法：
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Mall {
	static Scanner in = new Scanner(System.in);
	private static ArrayList<Commodity> commodities = new ArrayList<>();
	public static ArrayList<Commodity> getCommodities() {
		return commodities;
	}
	public static void setCommodities(ArrayList<Commodity> commodities) {
		Mall.commodities = commodities;
	}

	public static void SumCommodity() {//加载商品
		try (Scanner scanner = new Scanner(Paths.get("data.csv").toFile())) {
			String DELIMITER = ",";// CSV文件分隔符
			scanner.useDelimiter(DELIMITER);// 设置分隔符
			String s = scanner.nextLine();// 读取
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] str = line.split(",");
				int id = Integer.parseInt(str[0]);
				String name = str[1];
				double price = Double.parseDouble(str[2]);
				String type = str[3];
				String address = str[4];
				commodities.add(new Commodity(id, name, price, type, address));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void showAll() {// 展示商场的所有商品
		for (Commodity item : commodities) {
			System.out.println(item.toString());
		}
	}
	public static void SearchId(int id) {//按编号搜索商品
		
		int i,flag=0;
		for (i = 0; i < commodities.size(); i++) {
			if (commodities.get(i).getId()==id) {
				System.out.println("ID为"+id+"的商品是：");
				System.out.println(commodities.get(i).toString());
				System.out.println("请问您是否需要加入购物车1/0:");
				int op=in.nextInt();
				if(op==1) {
					Cart.add(commodities.get(i));
					System.out.println("商品已加入购物车");
					flag=1;
				}
			}
		}
		if(flag==0)
			System.out.println("没有找到该商品");
	}
	public static void SearchName(String name) {//按名称搜索商品
		int flag=0;
		for (int i = 0; i < commodities.size(); i++) {
			if (commodities.get(i).getName().equals(name)) {
				System.out.println("名称为"+name+"的商品是：");
				System.out.println(commodities.get(i).toString());
				System.out.println("请问您是否需要加入购物车1/0:");
				int op=in.nextInt();
				if(op==1) {
					Cart.add(commodities.get(i));
					System.out.println("商品已加入购物车");
					flag=1;
				}
			}
		}
		if(flag==0)
			System.out.println("没有找到该商品");
	}
	public static ArrayList<Commodity> SearchType(String type) {// 按类型搜索商品
		int i = 0;
		ArrayList<Commodity> list = new ArrayList<>();
		for (i = 0; i < commodities.size(); i++) {
			if (commodities.get(i).getType().equals(type)) {
				list.add(commodities.get(i));
			}
		}
		return list;
	}
}
