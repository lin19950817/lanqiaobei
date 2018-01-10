
public class problem1 {
	public void GetProblem() {
		System.out.println("亲密数：假设有a、b两个数，若a的所有因子之和等于b,b的所有因子之和等于a，并且a不等于b，则称a和b是一对亲密数。如284和220就是一对亲密数。");
	}

	private int SumOfFactors(int number) {
		int i = 1, half = number >> 1;
		int sum = 1; // 1为任何数质因子

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
					System.out.println(num1 + " 和 " + num2 + "是亲密数");
		}
	}
}
