
public class Chocolate {
	

	
	
	
	
	private boolean empty;
	private boolean boiled;
//	private static Chocolate uniqueInstance;
	Chocolate(){
		empty=true;
		boiled=false;
	}
	
//	public static Chocolate getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Chocolate();
//		}
//		return uniqueInstance;
//	}
	
	public void fill(){
		if(empty==true){
			System.out.println("�����ɿ�����ţ�̳ɹ�");
			empty=false;
		}
		else{
			System.out.println("�����Ѿ������ɿ�����ţ����");
		}
	}
	public void boil(){
		if(boiled==false && empty==false){
			System.out.println("��ʼ���");
			boiled=true;
		}
		else if(boiled==true && empty==false){
			System.out.println("�Ѿ���⿹���");
		}
		else{
			System.out.println("��δ���ʳ��");
		}
	}
	public void drain(){
		if(boiled==true && empty==false){
			System.out.println("ȡ��ʳ��");
			boiled=false;
			empty=true;
		}
		else {
			System.out.println("ȡ��ʳ��ʧ��");
		}
	}
	public boolean Isempty(){
		return empty;
	}
	public boolean Isboil(){
		return boiled;
	}
};
