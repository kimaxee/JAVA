
// 문5 책 예제 p.167~8 배열복사
public class q005 {
	public static void main(String[] args) {
				int[] oldIntArray = { 1, 2, 3 };
				int[] newIntArray = new int[5];
				
				
				for(int i = 0; i < oldIntArray.length; i++) {
					newIntArray[i] = oldIntArray[i];
					System.out.println(oldIntArray[i] + ", " + newIntArray[i]);
				}
				
				
				for (int i = 0; i < newIntArray.length; i++) {
					System.out.print(newIntArray[i] + ", ");
				}
	}

}
