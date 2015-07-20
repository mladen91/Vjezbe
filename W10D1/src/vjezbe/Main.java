package vjezbe;

import vjezbe.Editor.TYPE;

public class Main {

	public static void main(String[] args) {
	
      
      
      Editor ed = new Editor("Photo editor", 2015, 1.1, 10, TYPE.PHOTO, true);
      Application app = new Application("Photo editor", 2015, 1.1, 10);
		
      MyStack<Editor> stack = new MyStack<Editor>();
      MyStack<Application> stack1 = new MyStack<Application>();
      stack.push(ed);
      
      stack1.push(app);
      
      System.out.println(stack);
      System.out.println(stack1);
		

	}

}
