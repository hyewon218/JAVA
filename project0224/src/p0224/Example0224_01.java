package p0224;

public class Example0224_01 {

	public static void main(String[] args) {
		int num=1;
		int res=0;
		int out =0;
		
		//������Ų ������ ����
		res=++num;
		System.out.println(num);
		System.out.println(res);
		
		//������ ���� ������Ŵ
		res=num++;
		System.out.println(num);
		System.out.println(res);
		
		//���ҽ�Ų ������ ����
		out =--num;
		System.out.println(num);
		System.out.println(out);
		
		//������ ���� ���ҽ�Ŵ
		out =num--;
		System.out.println(num);
		System.out.println(out);
		

	}

}
