
public class problem9 {
    // ����Ħ˹��ĳ�ű�̽�գ���������д��һ����ֵ���ʽ��
    // ABCDE * ? = EDCBA
    // ���Ի���˵����ABCDEӦ�ô���ͬ�����֣��ʺ�Ҳ����ĳ�����֣���
    // ���������Ҳ�Ҳ�ǣ���
    // ���ǣ����˳�Ĭ�˺þã�����û��������ʵĽ������
    // �������ü���������ƣ��ҵ��ƽ�Ĵ𰸡�
    // �� ABCDE �����������д������
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
