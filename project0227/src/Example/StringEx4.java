package Example;

public class StringEx4 {

	public static void main(String[] args) {
		
		String st1="������ ������ ȭâ�մϴ�.";
		String st2="������,���޷�,ö��,����ȭ,���,�عٶ��";
		String st3="�ܿ�";
		//����ȭ�� �����Ͽ� st4�� ����
		String st4=st2.substring(11, 14);
		
		System.out.println(st1);
		//'ȭ'������ �ε��� ��ȣ
		System.out.println(st1.indexOf('ȭ'));
		//5��° �ε��� ��ȣ�� �ش��ϴ� ����
		System.out.println(st1.charAt(5));
		
		System.out.println(st4);
		//��ü ġȯ
		System.out.println(st3.replaceAll("�ܿ�", "���� ���� �־��"));
		System.out.println();
		
		String[] arr=st2.split(",");
		
		for(int i=0; i<arr.length; i++) {
		System.out.println(i+","+arr[i]);
		}
		
		System.out.println(arr.length);
	
	}

}
