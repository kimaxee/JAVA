
// ��6 å ���� p.168~9 �迭���� �Լ��� System.arraycopy()
public class q006 {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		String[] a = { "�����", "�ʱ���", "������" };
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
