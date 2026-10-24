package LearnOops;


//one way binding

class fan{
	void demo() {
		System.out.println("Fan is  circulate the air");
	}
}


// two way binding
class book{
	 void fun1() {
		System.out.println("Book Name : Learn Java..");

	}
}

class author extends book{
	 void fun2() {
		System.out.println("Author Name : Learn Siddarth..");

	}
}


public class Learn_binding {

		public static void main(String[] args) {
			
//			fan n = new fan();
//			n.demo();
			
			
			// two way binding
			
			book a = new author();
			a.fun1();
			
			
			
			
			
			
			
			
		}
	
	
}
