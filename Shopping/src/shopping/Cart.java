package shopping;
/*
 * Cart��
 * �����Ʒ��items����
 * ���빺�ﳵ�ķ�����add()
 * �ӹ��ﳵ��ɾ����Ʒ�ķ�����delete()
 * ��չ��ﳵ�ķ�����clear()
 * չʾ���ﳵ���ݵķ�����show()
 */
import java.util.ArrayList;
public class Cart {
	private static ArrayList<Commodity> items = new ArrayList<>();//�����Ʒ������
	
	public static void add(Commodity item) {//���빺�ﳵ
		items.add(item);
		
	}
	public static  void delete(int id) {//ɾ��ĳ��Ʒ
		Commodity item=Mall.getCommodities().get(id-1);
		items.remove(item);
		System.out.println("����Ʒ��ɾ��");
		show();
	}
	public static  void clear() {//��չ��ﳵ
		items.clear();
		System.out.println("���ﳵ�����");
	}
	public static void show() {//չʾ���ﳵ����
		System.out.println("��ǰ���ﳵ����"+items.size()+"����Ʒ");
		for (Commodity commodity : items) {
			System.out.printf("Id: %d, name: %s, price: %.2f", commodity.getId(),commodity.getName(), commodity.getPrice());
			System.out.println();
		}
	}
	
	public static void PrintSumPrice() {//���ﳵ�ܼ۸�
		double x = 0;
		for (Commodity commodity : items) {
			x += commodity.getPrice();
		}
		System.out.printf("��ǰ���ﳵ�ܼ۸�Ϊ��%.2f",x);
		show();
	}
}
