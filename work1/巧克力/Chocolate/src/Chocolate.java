
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
			System.out.println("加入巧克力和牛奶成功");
			empty=false;
		}
		else{
			System.out.println("锅内已经含有巧克力和牛奶了");
		}
	}
	public void boil(){
		if(boiled==false && empty==false){
			System.out.println("开始烹饪");
			boiled=true;
		}
		else if(boiled==true && empty==false){
			System.out.println("已经烹饪过了");
		}
		else{
			System.out.println("尚未添加食物");
		}
	}
	public void drain(){
		if(boiled==true && empty==false){
			System.out.println("取出食物");
			boiled=false;
			empty=true;
		}
		else {
			System.out.println("取出食物失败");
		}
	}
	public boolean Isempty(){
		return empty;
	}
	public boolean Isboil(){
		return boiled;
	}
};
