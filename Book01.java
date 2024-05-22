package Guanli;
import java.util.*;
public class Book01 {
	public static void main(String[] args) {
		String p1[] = {"红楼梦","曹雪芹","人民文学出版社","9787"};
		String p2[] = {"红星照耀中国","斯诺","人民教育出版社","0104"};
		String p3[] = {"昆虫记","法布尔","四川科学技术出版社","0241"};
		
		String book[][]=new String[4][];	//定义了一个字符串数组？
		book [0]=p1;
		book [1]=p2;
		book [2]=p3;
		
		System.out.print("请输入图书作者名称:");
		Scanner sc = new Scanner(System.in);
		String nameSelect=sc.next(); 
		
		boolean success=false;								//名称不对不会执行下面的语句
		
		for(int i=0;i<book.length;i++)
		{
			if(book[i][1].equals(nameSelect)) 				//根据作者名查找图书信息
			{
				success=true;								//名称正确才可以执行下列语句
				System.out.println("你要查询的图书信息为：");
				System.out.println("图书名称："+book[i][0]);
				System.out.println("图书作者："+book[i][1]);
				System.out.println("图书出版社："+book[i][2]);
				System.out.println("图书ISBN码："+book[i][3]);
			}
		}	

	}

}
