package com.object.innerClass;



public class Car2 {
	
	private class Engine{
		private String name="12346";
		
		
		
		public String getName() {
			return name;
		}
		
		private void run() {
			System.out.println("发动机启动");
		}
	}

	
	public Engine getEngine() {
		return new Engine();
	}
	
	
	public static void main(String[] args) {
		//一
		Engine engine = new Car2().new Engine();
		engine.run();
		String a=engine.getName();
		System.out.println(a);
		//二
		Car2 car2=new Car2();
		Engine engine2=car2.new Engine();
		engine2.run();
		//三、获取内部类的实例的方法写在外部类中
		Car2 car3 =new Car2();
		Engine engine3 = car3.getEngine();
		engine3.run();
		
		

	}

}
