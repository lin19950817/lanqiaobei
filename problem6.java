import java.lang.*;
public class problem6 {
//	С�������� 203879 ������ַ����� ԭ����203879 * 203879 = 41566646641����ʲô�����أ���ϸ�۲죬203879 �Ǹ�6λ������������ÿ����λ�ϵ����ֶ��ǲ�ͬ�ģ�������ƽ�����������λ�϶��������������������֡����������ص��6λ������һ���������ҳ�����
//			�ٹ���һ��ɸѡҪ��
//			   1. 6λ������
//			   2. ÿ����λ�ϵ����ֲ�ͬ
//			   3. ��ƽ������ÿ����λ����ԭ���ֵ��κ������λ
//			����һ��6λ����������
//			��ͨ��������ύ�𰸡�
//			ע�⣺ֻ�ύ��һ6λ���������Ѿ������������Ҫ�ύ��
//			ע�⣺��Ҫ��д���������ݣ����磺˵���Ե����֣���

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
