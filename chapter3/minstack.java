import java.util.*;

public class minstack extends Stack<Integer>{  

	Stack<Integer> min = new Stack<Integer>();

	public void push(int data) throws Exception{ //用到引用父类对象super（）
		super.push(data);
		if(min.empty()){
			min.push(data);
		}
		if(min.peek() >= data){
			min.push(data);
		}

	}

	public Integer pop() {  //继承的方法与原来的写法一致，所以没有throws exception，返回值为Integer，不能为int

			//while(min.peek() > super.peek()){
			//	super.pop();
		//	}
			//super.pop();
			//int a = min.peek();
			//min.pop();
			//return a;

		int a = super.pop();
		if(min.peek() == a) {min.pop();}
		return a;
	}

	public int min() throws Exception{
		return min.peek();
	}

	

	public static void main(String[] args) throws Exception{
		minstack s = new minstack();
		s.push(3);
		s.push(2);
		s.push(5);
		s.push(4);
		s.push(1);
		System.out.println(s.min());
		s.pop();
		System.out.println(s.min());
		s.pop();
		System.out.println(s.min());
		s.pop();
		System.out.println(s.min());
		s.pop();
		System.out.println(s.min());


	}


}