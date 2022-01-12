
// 문6 책 예제 p.168~9 배열복사 함수로 System.arraycopy()
public class q006 {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		String[] a = { "고양이", "너구리", "강아지" };
		String[] b = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		System.arraycopy(a, 1, b, 2, 2);
		
		for (int j = 0; j < newStrArray.length; j++) {
			System.out.println(b[j] + ", ");
		}
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
