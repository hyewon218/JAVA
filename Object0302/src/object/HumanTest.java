package object;

public class HumanTest {

	public static void main(String[] args) {
		//�ܺ��� HumanŬ������ main�Լ��� �����ͼ�
		//humanKim�̶�� �ν��Ͻ��� ������
		Human humanKim=new Human();
		humanKim.name="ȫ�浿";
		humanKim.height=170F;
		humanKim.weight=60F;
		System.out.println(humanKim.name);
		System.out.println(humanKim.height);
		System.out.println(humanKim.weight);
		//�Ű����� 3���� �ν��Ͻ� ����
		Human humanLee=new Human("������", 155.0F, 45.0F);
		System.out.println(humanLee.name);
		System.out.println(humanLee.height);
		System.out.println(humanLee.weight);
	}

}






