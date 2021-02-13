package com.object.innerClass;

import javax.sound.midi.VoiceStatus;

public class Car6 {
	public static class Engine{
		public void run() {
			System.out.println("静态内部类的run方法");
			System.out.println("发动机启动了");
		}
	}
	
	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.run();
	}

}
