import java.util.*;

public class hanoi{
	private Stack<Integer> disk;
	private int index;

	public hanoi(int i){
		disk = new Stack<Integer>();
		index = i;
	}

	public int index(){
		return index;
	}

	public void add(int data){
		if(!disk.isEmpty()&&disk.peek() < data){
			System.out.println("error place");
		}
		disk.push(data);
	}

	public void movetopto(hanoi i){
		if(!disk.empty()){

			i.add(disk.pop());

		}
		
		System.out.println("Move disk" + disk.pop() +"from" + index() + "to" + i.index() );
	
	}

	public void movefrom(int n, hanoi origin, hanoi middle,hanoi destination){
		if(n ==0){
			return ;
		}else if(n==1){
			origin.movetopto(destination);
			return;
		}

		
		movefrom(n-1, origin,destination,middle);
		origin.movetopto(destination);
		movefrom(n-1,middle,origin,destination);

	}

	public String toString(){
		return disk.toString();
	}

	public static void main(String args[])throws Exception{

		int n = 5;
		hanoi[] towers = new hanoi[3];
		for(int i= 0; i < 3; ++i){
			towers[i] = new hanoi(i);
		}

		for(int i = 5; i > 0 ; i--){
			towers[0].add(i);
		}
		System.out.println(towers[0]);
		towers[0].movefrom(n,towers[0], towers[1], towers[2]);
		System.out.println(towers[2]);


	}
}