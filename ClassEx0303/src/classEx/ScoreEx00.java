package classEx;

public class ScoreEx00 {
	String name;
	int age;
	String date;
	int price;
	String timeType;	
	//���� : 59800��
	//59800*0.5(50������)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	public String getHuman() {
		String human="";
		if(age>=19) {
			human="�";
		}else {
			human="û�ҳ�";
		}
		return human;
	}
	public String getTimeType() {
		return timeType;
	}
	//�������� ���� ���ΰ����� ���ϴ� �޼���, �Ϲ����� �Ⱓ������, ��� û�ҳ�
	public double getRate( ) {
		double rate=0.0;
	
		
		if(timeType=="�Ϲ���") {
			//getHuman()�Լ� ȣ���ϰ� �� ������� "�"�� ��
			if(getHuman()=="�") {
				if(date=="10�Ͽ�") {
					rate=0.45;
				}else if(date=="1������"){
					rate=0.5;
				}else {
					rate=0.0;
				}
			//�Ϲ���->û�ҳ��� ���	
			}else {
				rate=0.6;
			}
		}else if(timeType=="�Ⱓ������"){
			if(getHuman()=="�") {
				if(date=="10��~20��") {
					rate=0.5;
				}else {
					rate=0.0;
				}
			}else {
				rate=0.6;
			}
			//�Ϲ����� �ƴϰ�, �Ⱓ�������� �ƴ� ���
		}else {
			rate=0.0;
		}
		return rate;
	}
	
	public double getDiscount() {
		double discount=0.0;
		//�������� ������ ���ΰ� ���ϱ�
		discount=price-(price*getRate());
		return discount;
	}

	public static void main(String[] args) {
		//���缮, �Ⱓ������, �, 50% ���ι���
		ScoreEx00 score =new ScoreEx00();
		score.name="���缮";
		score.age=30;
		score.price=59800;
		score.date="10�Ͽ�"; 
		score.timeType="�Ϲ���";

		System.out.println("���� : "+score.getTimeType());
		System.out.println("���� : "+score.getAge()+"��");
		System.out.println("���� : "+score.getHuman());
		System.out.println("��¥ : "+score.getDate());
		System.out.println("�̸� : "+score.getName()+"��");
		System.out.println("���� : "+score.getPrice()+"��");
		System.out.println("������ : "+(int)(score.getRate()*100)+"%");
		System.out.println("���ΰ� : "+(int)score.getDiscount());
		
		
	}
}
