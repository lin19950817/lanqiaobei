
import java.util.Scanner;

public class problem1 {
	public void GetProblem(){
		System.out.println("��������������a��b����������a����������֮�͵���b,b����������֮�͵���a������a������b�����a��b��һ������������284��220����һ����������");
	}
	private int SumOfFactors(int number){	
		int i=1,half=number/2;
		int sum=1;  //1Ϊ�κ���������
		/// number/4��ȡ��������
		
		while(++i<=half){
			if(0==number%i){
				sum+=i;
			}
		}
		return sum;
	}
	public void Problem(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����a��ֵ��");
		int num1 =Integer.parseInt(sc.nextLine());
		System.out.println("����b��ֵ��");
		int num2=Integer.parseInt(sc.nextLine());
		
		if(num1!=num2&&SumOfFactors(num1)==num2&&num1==SumOfFactors(num2)){
			System.out.println(num1+" �� "+num2+"��һ��������");
		}
		else{
			System.out.println(num1+" �� "+num2+"����һ��������");
		}
		
	}
}
