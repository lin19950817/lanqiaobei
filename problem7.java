
public class problem7 {
	// ��һԪ����Ҷһ���1�֡�2�ֺ�5��Ӳ�ң����ж����ֲ�ͬ�Ķһ�������
	public void Problem() {
		pro1();
	}

	public void pro1() {
		int sum = 0;
		for (int a = 0; a < 101; a++) 
			for (int b = 0; b < 51; b++) 
				for (int c = 0; c < 21; c++) 
					if (100 == a + 2 * b + 5 * c)
						sum++;
		System.out.println(sum);
	}

	public void Answer() {	
	    int a, b, c, i = 0;
		for (a = 1; a <= 100; a++) {
			for (b = 0; b <= 50; b++) {
				for (c = 1; c <= 20; c++) {
					if (a * 1 + b * 2 + c * 5 == 100)
						i++;
				}
			}
		}
		System.out.printf("%d", i);

	}
}
