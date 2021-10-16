package shopping;

import java.util.ArrayList;
import java.util.Scanner;

import User.MenuUser;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Mall.SumCommodity();//加载商品
        while(true) {
        	MenuUser.mainMenu();//展示菜单
        	System.out.print("请输入您的选项：");
        	int choose=in.nextInt();
        	String Pause;
        	
        	switch(choose) {
        	case 1://商品清单
        		Mall.showAll();
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 2://按ID查找商品
        		System.out.println("请输入商品ID:");
        		int id=in.nextInt();
				Mall.SearchId(id);
				System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();	
        		break;
        	case 3://按名称查找商品
        		System.out.println("请输入商品名称:");
				String name = in.next();
				Mall.SearchName(name);
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 4://按类型查找商品
        		System.out.println("请输入查找类型:");
				String type = in.next();
				ArrayList<Commodity>lists=Mall.SearchType(type);
				System.out.println(lists.toString());
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 5:
        		System.out.println("请输入要删除商品的id:");
        		int Id=in.nextInt();
        		Cart.delete(Id);
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 6://查看购物车
        		Cart.show();
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 7://清空购物车
        		Cart.clear();
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 8://购物车预结算
        		Cart.PrintSumPrice();
        		System.out.println("<输入任意数字，按回车返回主界面>");
				Pause = in.next();
        		break;
        	case 0:
        		break;
        	default:
        		System.out.println("请输入正确的数字");
        	}
        	if(choose==0)break;
        }
        User.MenuUser.MenuEnd();
	}
}
