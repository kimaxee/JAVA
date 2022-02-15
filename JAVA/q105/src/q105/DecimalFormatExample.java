package q105;

import java.text.DecimalFormat;

//p.544 ~ 545 예제
public class DecimalFormatExample {			// 숫자를 원하는 형식으로 출력

	public static void main(String[] args) {
		double num = 1234567.89;
		
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
	}

}
