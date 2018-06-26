package com.inner_classes.Member_inner_class;

//Java Member inner class
/*�st:kapsayan alt:kapsanan
 * Alt s�n�f �st s�n�f�n de�i�ken ve metodlara ula�abilir
 * Alt s�n�fdan nesne �retmek i�in �st s�n�fdan nesne �retmek �artt�r
 * Derlendi�i zaman:
 * App.class
 * App$Inner.class
classlar� olu�ur*/

public class App {

	private int data = 30;

	class Inner {

		void msg() {

			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {

		App obj = new App();
		App.Inner in = obj.new Inner();
		in.msg();
	}
}

// Internal code generated by the compiler
/*
class App$Inner {

	final App this$0;

	App$Inner() {

		super();
		this$0 = App.this;
	}

	void msg() {

		System.out.println((new StringBuilder()).append("data is ").append(App.access$000(App.this)).toString());
	}
}
*/