import java.util.*;

public class setofstack{

	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	int N = 5;

	public setofstack(int N){
		this.N = N;
	}

	public void push(int data){
		Stack<Integer> m = getlaststack();
		if(m != null ){
			m.push(data);
		}else{
			Stack<Integer> mm = new Stack<Integer>();
			mm.push(data);
			stacks.add(mm);
		}


	}

	public int pop(){
		Stack<Integer> m = getlaststack();
		int n = m.pop();
		if(m.isEmpty()){
			stacks.remove(stacks.size() - 1);
		}
		return n;
	}


	public Stack<Integer> getlaststack(){
		if( stacks.size() == 0 ){
			return null;
		}
		return stacks.get(stacks.size() - 1);
		
	}


	public static void main(String args[]){
		setofstack a = new setofstack(5);
		for(int i = 0;i<5;i++){
			a.push(i);
		}
		System.out.print(a);
		//System.out.print(a.pop());
		//System.out.print(a.pop());
		//System.out.print(a.pop());
		//System.out.print("\n" + a);
	}



}

