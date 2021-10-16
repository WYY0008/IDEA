package shopping;
/*
 * Mall��
 * �洢�̳�������Ʒ������ commodities
 * ��ʼ��������Ʒ�ķ�����
 * չʾ������Ʒ�ķ�����
 * ��������
 * 1. ����������ķ�����
 * 2. �����������ķ�����
 * 3. �����������ķ�����
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

	public static void SumCommodity() {//������Ʒ
		try (Scanner scanner = new Scanner(Paths.get("data.csv").toFile())) {
			String DELIMITER = ",";// CSV�ļ��ָ���
			scanner.useDelimiter(DELIMITER);// ���÷ָ���
			String s = scanner.nextLine();// ��ȡ
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
	public static void showAll() {// չʾ�̳���������Ʒ
		for (Commodity item : commodities) {
			System.out.println(item.toString());
		}
	}
	public static void SearchId(int id) {//�����������Ʒ
		
		int i,flag=0;
		for (i = 0; i < commodities.size(); i++) {
			if (commodities.get(i).getId()==id) {
				System.out.println("IDΪ"+id+"����Ʒ�ǣ�");
				System.out.println(commodities.get(i).toString());
				System.out.println("�������Ƿ���Ҫ���빺�ﳵ1/0:");
				int op=in.nextInt();
				if(op==1) {
					Cart.add(commodities.get(i));
					System.out.println("��Ʒ�Ѽ��빺�ﳵ");
					flag=1;
				}
			}
		}
		if(flag==0)
			System.out.println("û���ҵ�����Ʒ");
	}
	public static void SearchName(String name) {//������������Ʒ
		int flag=0;
		for (int i = 0; i < commodities.size(); i++) {
			if (commodities.get(i).getName().equals(name)) {
				System.out.println("����Ϊ"+name+"����Ʒ�ǣ�");
				System.out.println(commodities.get(i).toString());
				System.out.println("�������Ƿ���Ҫ���빺�ﳵ1/0:");
				int op=in.nextInt();
				if(op==1) {
					Cart.add(commodities.get(i));
					System.out.println("��Ʒ�Ѽ��빺�ﳵ");
					flag=1;
				}
			}
		}
		if(flag==0)
			System.out.println("û���ҵ�����Ʒ");
	}
	public static ArrayList<Commodity> SearchType(String type) {// ������������Ʒ
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
