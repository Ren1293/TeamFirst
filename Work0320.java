package bijiao;
import java.util.*;
public class Work0320 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int a = input.nextInt();	//把输入的整数放入a中
		int m,n;
		m = a/10000;
		n = a%10;
		System.out.println("最高位="+m +"最低位="+n);
	}
}
