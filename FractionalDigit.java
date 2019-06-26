// 13/17小数点后第100位的数字是几？
public class FractionalDigit {

	public static void main(String[] args) {
		int d = 13;
		int q = 17;
		int a = 0;
		int temp = 0;
		for(int i=1;i<=100;i++)
		{
			temp = d*10;
			d = temp % q;
		}
		a = temp / q;
		
		System.out.println(a);

	}

}
