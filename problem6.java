import java.lang.*;
public class problem6 {
//	小明正看着 203879 这个数字发呆。 原来，203879 * 203879 = 41566646641这有什么神奇呢？仔细观察，203879 是个6位数，并且它的每个数位上的数字都是不同的，并且它平方后的所有数位上都不出现组成它自身的数字。具有这样特点的6位数还有一个，请你找出它！
//			再归纳一下筛选要求：
//			   1. 6位正整数
//			   2. 每个数位上的数字不同
//			   3. 其平方数的每个数位不含原数字的任何组成数位
//			答案是一个6位的正整数。
//			请通过浏览器提交答案。
//			注意：只提交另一6位数，题中已经给出的这个不要提交。
//			注意：不要书写其它的内容（比如：说明性的文字）。

	public void Problem(){
		pro1();
		System.out.println("end");
	}
	public void pro1(){
		for(int a=1;a<10;a++){
			for(int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					for(int d=0;d<10;d++){
						for(int e=0;e<10;e++){
							for(int f=0;f<10;f++){
								if(a==1&&b==2&&c==3&&d==8&&e==7&&f==9)
									System.out.println("b==2");
								if(a==1&&b==1&&c==3&&d==8&&e==7&&f==9)
									System.out.println("b==1");
								if(a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&b!=c&&b!=d&&b!=e&&b!=f&&c!=d&&c!=e&&c!=f&&d!=e&&d!=f&&e!=f){
									long l=a*100000+b*10000+c*1000+d*100+e*10+f;
									long lPow=l*l;
									boolean bl=false;
									int[] array=new int[10];
									array[a]=1;
									array[b]=1;
									array[c]=1;
									array[d]=1;
									array[e]=1;
									array[f]=1;
									while(lPow>10){
										int i=(int)(lPow%10);
										if(1==array[i]){
											bl=true;
											break;
										}
										lPow/=10;
									}
									if(bl)
										break;
									System.out.println("l="+l+"\n"+"lPow="+lPow);
								}
							}
						}
					}
				}
			}
		}
	}
}
