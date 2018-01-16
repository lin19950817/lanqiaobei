
public class problem4 {
	// 啤酒每罐2.3元，饮料每罐1.9元。小明买了若干啤酒和饮料，一共花了82.3元。
	// 我们还知道他买的啤酒比饮料的数量少，请你计算他买了几罐啤酒。
	// 注意：答案是一个整数。请通过浏览器提交答案。
	// 不要书写任何多余的内容（例如：写了饮料的数量，添加说明文字等）。

	public void Problem() {
		// 2.3x+1.9y=82.3
		// x<y
		// x,y不为0
		boolean b = false;
		for (int x = 1; x > 0; x++) {
			for (int y = x+1; y > 0; y++) {
				if (x < y && 82.3 == 2.3 * x + 1.9 * y) {
					System.out.println(x);
					b = true;
					break;
				}
				else if(2.3 * x + 1.9 * y > 82.3)
					break;
			}
			if (b)
				break;
		}

	}
}
