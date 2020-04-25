package leetcode;

class MinStack {

	int top = -1;
	int[] arr = new int[100];

	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {
		top++;
		arr[top] = x;
	}

	public void pop() {
		arr[top] = -1;
		top--;
	}

	public int top() {
		return arr[top];
	}

	public int getMin() {
		if(top == 0) {
			return arr[0];
		}
		int min = arr[0];
		for(int i = 0; i <= top; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}
}

public class StackImpl {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		System.out.println(stack.top());
	}

}
