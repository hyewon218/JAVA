package classEx;

public class ScoreEx {
	
	String name;
	int age;
	String date;
	int price;
	String timeType;
	
	int term;
	//�(19���̻�)/û�ҳ�(19��̸�)
	String adult;
	String type;
	//��¥
	//1������ 31��,1������ :10���̻�30�� �̸�
	
	//���� : 59800��
	//59800*0.5(50������)
	//price-(price*0.5)
	//���ǹ� �ȿ� ���ǹ�
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
	public int getTimeType() {
		return price;
	}
	public String getTerm() {
		String type="";
		if(term==10||term==30) {
			type="�Ϲ���";
		}else {
			type="�Ⱓ������";
		}
		return type;
	}
	//�Ϲ����� �Ⱓ�������� ������
	public String type() {
		return type;
	}
	
	public String isAdutl() {
		String discount ="";
			if(age>=19) {
				if(getTerm()=="�Ϲ���") {
					if(term==10) {
						discount="45";
					}else if(term==30) {
						discount="50";
					}else {
						discount="";
					}
						
				}else if(getTerm()=="�Ⱓ������") {
					if(term>9&&term<21) {
						discount="45";
					}else if(term>20&&term<31) {
						discount="50";
					}else {
						discount="";
				}
			//û�ҳ�
			}else if(age<19) {
				if(getTerm()=="�Ϲ���") {
					if(term==10&&term==30) {
						discount="60";
					}else {
						discount="";
					}
				}else if(getTerm()=="�Ⱓ������") {
					if(term>9&&term<31) {
						discount="60";
					}else {
						discount="";
					}
					}
				}
			}
		
		return discount;
	}
	//�������̾����� ���ݱ״�� ����ϱ�!!!
	//�������� ���ݱ��ϱ�
	public int getDiscount() {
		int discountPrice=0;
		
		if(isAdutl()=="45") {
			discountPrice=(int)(price-(price*0.45));
		}else if(isAdutl()=="50") {
			discountPrice=(int)(price-(price*0.5));
		}else if(isAdutl()=="60") {
			discountPrice=(int)(price-(price*0.6));
		}else {
			discountPrice=price;
		}
		return discountPrice;
	}


	
	public static void main(String[] args) {
		//���缮, �Ⱓ������, �, 50% ���ι���
		ScoreEx score =new ScoreEx();
		score.name="���缮";
		score.age=30;
		//�⺻����
		score.price=59800;
		score.term=22;
		System.out.println("�̸� : "+score.getName());
		System.out.println("���� : "+score.getAge());
		System.out.println("�Ⱓ : "+score.getTerm());
		System.out.println("������ : "+score.isAdutl());
		System.out.println("���ε� ���� : "+score.getDiscount());
		
		
	}


}
