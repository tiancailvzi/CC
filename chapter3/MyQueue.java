import java.util.*;

public class MyQueue{
	Stack<Integer> s1,s2;

	public MyQueue(){
		 s1 = new Stack<Integer>();
		 s2 = new Stack<Integer>();  //不能携程Stack<Integer>s2 = new Stack<Integer>()
	}

	public void add(int data){
		s1.push(data);
		//System.out.println(s1.toString());
	}

	public int pop(){
		if(s2.empty()){
			while(!s1.empty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	public String toString(){
		return s1.toString() + "\n" + s2.toString();
	}

	public static void main(String[] args){
		MyQueue ss = new MyQueue();
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);

		//for(int i =1;i<5;i++){
		//	ss.add(i);
		//}
		System.out.println(ss.toString());
		ss.pop();
		ss.pop();
		System.out.println(ss.toString());
	}
}