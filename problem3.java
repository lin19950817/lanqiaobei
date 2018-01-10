
public class problem3 {
	// 马虎的算式： 小明是个急性子，上小学的时候经常把老师写在黑板上的题目抄错了。 有一次老师出的题目是36 x 495 = ? 他却给抄成了396
	// x 45 = ? 但结果却很戏剧性他的答案竟然是对的 因为 36 * 495 = 396 * 45 = 17820
	// 类似这样的巧合情况可能还有很多，比如27 * 594 = 297 * 54 假设 a b c d e
	// 代表1~9不同的5个数字，注意是各不相同的数字且不含0 能满足形如： ab * cde = adb * ce 这样的算式一共有多少种呢
	// 请你利用计算机的优势寻找所有的可能，并回答不同算式的种类数。 满足乘法交换律的算式计为不同的种类，所以答案肯定是个偶数。
	// 答案直接通过浏览器提交。 注意：只提交一个表示最终统计种类数的数字，不要提交解答过程或其它多余的内容。

	int[] book = new int[10];	//用来标记1-9数字有没有在使用
	int[] number = new int[5];	//存放a、b、c、d、e
	int sum = 0;	//统计种类
	
	public void Problem() {
//		for (int a = 1; a < 10; a++) {
//			for (int b = 1; b < 10; b++) {
//				for (int c = 1; c < 10; c++) {
//					for (int d = 1; d < 10; d++) {
//						for (int e = 1; e < 10; e++) {
//							if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e) && a != b
//									&& a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e
//									&& d != e)
//								sum++;
//						}
//					}
//				}
//			}
//		}

		
		digui(0);
		System.out.println(sum);
	}

	public void digui(int step){
		if(step<=4){
			for (int i = 1; i < 10; i++) {
				if (0 == book[i] && step < 5) { // 没有用到的数字
					book[i] = 1;
					number[step] = i;
					digui(step+1);
					book[i] = 0; //
				}
				
			}
		}else if ((number[0] * 10 + number[1])
				* (number[2] * 100 + number[3] * 10 + number[4]) == (number[0] * 100 + number[3] * 10 + number[1])
						* (number[2] * 10 + number[4])) {
			sum++;
		}
	}
}
