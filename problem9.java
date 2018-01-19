
public class problem9 {
    // 福尔摩斯到某古堡探险，看到门上写着一个奇怪的算式：
    // ABCDE * ? = EDCBA
    // 他对华生说：“ABCDE应该代表不同的数字，问号也代表某个数字！”
    // 华生：“我猜也是！”
    // 于是，两人沉默了好久，还是没有算出合适的结果来。
    // 请你利用计算机的优势，找到破解的答案。
    // 把 ABCDE 所代表的数字写出来。
    public void Problem() {
        pro1();
    }

    private void pro1() {
        for (int a = 1; a < 10; a++)
            for (int b = 1; b < 10; b++)
                for (int c = 1; c < 10; c++)
                    for (int d = 1; d < 10; d++)
                        for (int e = 1; e < 10; e++)
                            if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e
                                    && d != e) {
                                int first = a * 10000 + b * 1000 + c * 100 + d * 10 + e,
                                        second = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
                                if (0 == second % first)
                                    System.out.println(first + "*" + second / first + "=" + second);
                            }

    }

    public void Answer() {
        int i;
        for (i = 10000; i < 100000; i++) {
            int a = i / 10000;
            int b = i % 10000 / 1000;
            int c = i % 10000 % 1000 / 100;
            int d = i % 10000 % 1000 % 100 / 10;
            int e = i % 10;
            if (a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e) {
                continue;
            }
            int y = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
            if (y % i == 0) {
                System.out.printf("%d*%d=%d", i, y / i, y);
            }

        }

    }
}
