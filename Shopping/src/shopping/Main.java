package shopping;

import java.util.ArrayList;
import java.util.Scanner;

import User.MenuUser;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Mall.SumCommodity();//������Ʒ
        while(true) {
        	MenuUser.mainMenu();//չʾ�˵�
        	System.out.print("����������ѡ�");
        	int choose=in.nextInt();
        	String Pause;
        	
        	switch(choose) {
        	case 1://��Ʒ�嵥
        		Mall.showAll();
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 2://��ID������Ʒ
        		System.out.println("��������ƷID:");
        		int id=in.nextInt();
				Mall.SearchId(id);
				System.out.println("<�����������֣����س�����������>");
				Pause = in.next();	
        		break;
        	case 3://�����Ʋ�����Ʒ
        		System.out.println("��������Ʒ����:");
				String name = in.next();
				Mall.SearchName(name);
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 4://�����Ͳ�����Ʒ
        		System.out.println("�������������:");
				String type = in.next();
				ArrayList<Commodity>lists=Mall.SearchType(type);
				System.out.println(lists.toString());
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 5:
        		System.out.println("������Ҫɾ����Ʒ��id:");
        		int Id=in.nextInt();
        		Cart.delete(Id);
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 6://�鿴���ﳵ
        		Cart.show();
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 7://��չ��ﳵ
        		Cart.clear();
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 8://���ﳵԤ����
        		Cart.PrintSumPrice();
        		System.out.println("<�����������֣����س�����������>");
				Pause = in.next();
        		break;
        	case 0:
        		break;
        	default:
        		System.out.println("��������ȷ������");
        	}
        	if(choose==0)break;
        }
        User.MenuUser.MenuEnd();
	}
}
