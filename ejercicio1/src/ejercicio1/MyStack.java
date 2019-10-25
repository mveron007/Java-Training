package ejercicio1;
import java.util.Stack;

public class MyStack {
	
	static void stackPush(Stack<Integer> stack) {
		
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		
	}
	
	static void stackPop(Stack<Integer> stack) {
		System.out.println("Elemento eliminado: ");
		for (int i = 0; i < 5; i++) {
			Integer item=(Integer) stack.pop();
			System.out.println(item);
		}
		
	}
	
	static void showStack(Stack<Integer> stack) {
		Integer item=(Integer) stack.peek();
		System.out.println("Elemento en la parte superior " + item);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> newStack = new Stack<Integer>();
		
		
		stackPush(newStack);
		showStack(newStack);
		stackPop(newStack);
		

	}

}
