
public class problem2 {
	public void GetProblem(){
		final String str="世纪末的星期: 曾有邪教称1999年12月31日是世界末日。当然该谣言已经不攻自破。\n还有人称今后的某个世纪末的12月31日如果是星期一则会....  有趣的是 任何一个世纪末的年份的12月31日都不可能是星期一!!   于是 \"谣言制造商\"又修改为星期日......     1999年的12月31日是星期五，请问，未来哪一个离我们最近的一个世纪末年即xx99年的12月31日正好是星期天，即星期日  请回答该年份，只写这个4位整数，不要写12月31等多余信息";
		System.out.println(str);
	}
	public void Problem(){
		int week=5;//周五
		int Year=1999;//1999年
		while(!(Year%100==99&&0==week%7)){
			if((0==++Year%100&&0==Year%400)||(0!=Year%100&&0==Year%4)){	//如果为闰年
				week+=2;
			}
			else{
				week++;
			}
		}
		System.out.println(Year);
	}
}
