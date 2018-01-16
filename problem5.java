
public class problem5 {
	// 大数学家高斯有个好习惯：无论如何都要记日记。
	// 他的日记有个与众不同的地方，他从不注明年月日，而是用一个整数代替，比如：4210
	// 后来人们知道，那个整数就是日期，它表示那一天是高斯出生后的第几天。这或许也是个好习惯，它时时刻刻提醒着主人：日子又过去一天，还有多少时光可以用于浪费呢？
	// 高斯出生于：1777年4月30日。
	// 在高斯发现的一个重要定理的日记上标注着：5343，因此可算出那天是：1791年12月15日。
	// 高斯获得博士学位的那天日记上标着：8113 请你算出高斯获得博士学位的年月日。提交答案的格式是：1799-07-16,例如：1980-03-21
	// 请严格按照格式，通过浏览器提交答案。
	// 注意：只提交这个日期，不要写其它附加内容，比如：说明性的文字。

	public void Problem() {
		pro1();
		Answer();
	}

	private void pro1() {
		int Year = 1777, month = 4, day = 30;
		int date = 5343;
		int[] monthday = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 1,2,3,4,5,6,7,8,9,10,11,12月份天数

		if (date > 1) {
			// 出生那天为第一天
			month++;
			date--;
		} else
			date = day;
		while (date > monthday[month]) {
			if (1 == month && (0 == Year % 100 && 0 == Year % 400) || (0 != Year % 100 && 0 == Year % 4))
				monthday[2] = 29; // 闰年二月天数
			else
				monthday[2] = 28;
			date -= monthday[month];
			if (++month > 12) {
				month = 1;
				Year++;
			}
		}

		System.out.println(Year + "-" + month + "-" + date);

	}

	// 答案
	private void Answer() {
		int year = 1777, month = 4, day = 30;
		int a[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i < 8113; i++) {
			if (2 == month && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				a[2] = 29;
			else
				a[2] = 28;
			day = day % a[month] + 1;
			if (day == 1) {
				month = month % 12 + 1;
				if (month == 1)
					year++;
			}
		}
		System.out.printf("%d-%d-%d", year, month, day);

	}
}
