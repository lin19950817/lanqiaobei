
public class problem1 {
	public void GetProblem() {
		System.out.println("��������������a��b����������a����������֮�͵���b,b����������֮�͵���a������a������b�����a��b��һ������������284��220����һ����������");
	}

	private int SumOfFactors(int number) {
		int i = 1, half = number >> 1;
		int sum = 1; // 1Ϊ�κ���������

		while (++i <= half) {
			if (0 == number % i) {
				sum += i;
			}
		}
		return sum;
	}

	public void Problem() {
		for (int num1 = 1; num1 < 10000; num1++) {
			int num2 = SumOfFactors(num1);
			if (num2 < num1)
				if (num1 == SumOfFactors(num2))
					System.out.println(num1 + " �� " + num2 + "��������");
		}
	}
}
