package bmijisuan;
import java.util.Scanner;
public class Work {
	public static void main(String[] args) {
		 Scanner input = new  Scanner(System.in);
	        System.out.println("请输入你的身高(米）、体重（千克）以及性别(0为男性、1为女性）：");
	        double height = input.nextDouble();
	        int weight = input.nextInt();
	        int sex = input.nextInt(); 
	        double stander = weight / (height * height);
	        System.out.println("你的体重指数是："+stander);
	        switch(sex){
	        case 0:
	        if(stander > 0 && stander <= 20)
	            System.out.println("过轻");
	        else if(stander > 20 && stander <= 25)
	            System.out.println("适中");
	        else if(stander > 25 && stander <= 30)
	            System.out.println("过重");
	        else if(stander > 30 && stander <= 35)
	            System.out.println("肥胖");
	        else if(stander > 35 )
	            System.out.println("非常肥胖");
	        else
	        	System.out.println("身高、体重等数据输入有误！");break;
	        case 1:
	        	if(stander > 0 && stander <= 19)
		            System.out.println("过轻");
		        else if(stander > 19 && stander <= 24)
		            System.out.println("适中");
		        else if(stander > 24 && stander <= 29)
		            System.out.println("过重");
		        else if(stander > 29 && stander <= 34)
		            System.out.println("肥胖");
		        else if(stander > 34)
		            System.out.println("非常肥胖");
		        else
		        	System.out.println("身高、体重等数据输入有误！");break;	
		     default:System.out.println("输入性别有误！");
	        }       
	}
}
