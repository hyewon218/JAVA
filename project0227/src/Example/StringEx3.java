package Example;

public class StringEx3 {

	public static void main(String[] args) {
		String arr="���,���,�쵿,������,����";
		//split()�� Ư�� ���ڷ� �����Ͽ� ���ڿ��� ����� �迭�� ������
		//[]:�迭
		//res[0]="���",res[1]="���",res[2]="�쵿"
		//res[3]="������",res[4]="����"
		String[] res=arr.split(",");
		
		//length()�� res�迭�� ������ ���ϴ� �޼���(0,1,2,3,4)
		System.out.println("res�迭�� ����:"+res.length);
		
		//res�迭�� ������ŭ �ݺ�, i������ �ε�����ȣ�� ��Ÿ��
		//for(int i=0; i<=res.length-1; i++) {
		for(int i=0; i<res.length; i++) {
			System.out.println(i+","+res[i]);
		}
		//System.out.println(i+","+res[0]);
		//System.out.println(i+","+res[1]);
		//System.out.println(i+","+res[2]);
		//System.out.println(i+","+res[3]);
		//System.out.println(i+","+res[4]);
		
	}

}
