package Example;

public class StringEx2 {

	public static void main(String[] args) {
		//���ڿ��� ���� ���� �� �ʱ�ȭ
		String str1="Have a good time!";
		//���ڿ��� ��ü�� �����ȴ�.
		//new: ��ü�� �����Ѵٴ� ���� Ű����
		//��ü�� �ݵ�� �빮�ڷ� �����ؾ� ��(����)
		String str2=new String("��ſ� �ð� �Ǽ���!");
		
		String str3="javascript";
		String str4="java";
		String str5="java";
		String str6="abcdefghijklmn";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//equals()�� ���ڿ��� ������ ���ϴ� �޼���
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		//IndexOf()�� ������ ��ġ�� ã���ִ� �޼���
		//���α׷��� ���� 0���� �ε����� ����,���� �����
		System.out.println(str6.indexOf('f'));
		
		//charAt()�� 8��° ���ڸ� ���ϴ� �޼���,���� �����
		System.out.println(str6.charAt(8));
		//replaceAll()�� ���ڿ��� �ٸ� ���ڿ��� ġȯ(�ٲ�)
		System.out.println(str4.replaceAll("java", "�ڹٴ� ��ƴ�"));
		//substring()�� ���ڿ��� �Ϻκ��� ���� �� ���(�����ε���,���ε���)
		//7��°���� 11��°������ ���ڿ��� ����,���� �����
		System.out.println(str1.substring(7,11));
		//toUpperCase()�� ��� ���ڿ��� �빮�ڷ� ��ȯ
		System.out.println(str1.toUpperCase());
		//toLowerCase()�� ��� ���ڿ��� �빮�ڷ� ��ȯ
		System.out.println(str1.toLowerCase());
		
	}

}


























