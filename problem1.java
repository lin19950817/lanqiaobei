
import java.util.Scanner;

public class problem1 {
	public void GetProblem(){
		System.out.println("亲密数：假设有a、b两个数，若a的所有因子之和等于b,b的所有因子之和等于a，并且a不等于b，则称a和b是一对亲密数。如284和220就是一对亲密数。");
	}
	private int SumOfFactors(int number){	
		int i=1,half=number/2;
		int sum=1;  //1为任何数质因子
		/// number/4获取两个因子
		
		while(++i<=half){
			if(0==number%i){
				sum+=i;
			}
		}
		return sum;
	}
	public void Problem(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("输入a的值：");
		int num1 =Integer.parseInt(sc.nextLine());
		System.out.println("输入b的值：");
		int num2=Integer.parseInt(sc.nextLine());
		
		if(num1!=num2&&SumOfFactors(num1)==num2&&num1==SumOfFactors(num2)){
			System.out.println(num1+" 和 "+num2+"是一对亲密数");
		}
		else{
			System.out.println(num1+" 和 "+num2+"不是一对亲密数");
		}
		
	}
}
