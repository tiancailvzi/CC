public class threestack{
		static int length = 10;
		int[] stack = new int[length*3];
		int[] stackpoint = {0,0,0};

		public void push(int stacknum, int data) throws Exception{
			if(stackpoint[stacknum]+1 >length){
				throw new Exception("overflow");
			}
			stackpoint[stacknum]++;
			stack[absthestack(stacknum)] = data;
		}

		public int pop(int stacknum) throws Exception{
			if(isempty(stacknum)){
				throw new Exception("underflow");
			}
			int ss = stack[absthestack(stacknum)];
			stackpoint[stacknum]--;
			//stack[absthestack(stacknum)] = null;
			return ss;
		}

		public int peek(int stacknum) throws Exception{
			if(isempty(stacknum)){
				throw new Exception("underflow");
			}
			return stack[absthestack(stacknum)];
		}


		public boolean isempty(int stacknum){
			return(absthestack(stacknum) == -1);
		}



		public int absthestack(int stacknum){
			return stacknum*length + stackpoint[stacknum];
		}


		public static void main(String args[]) throws Exception{
			/*threestack a = new threestack();
			a.push(2, 4);
			System.out.println("Peek 2: " + a.peek(2));
			a.push(1, 3);
			a.push(1, 7);
			a.push(1, 5);
			System.out.println("Peek 1: " + a.peek(1));
			a.pop(1);
			System.out.println("Peek 1: " + a.peek(1));
			a.pop(1);
			System.out.println("Peek 1: " + a.peek(1)); */

			push(2, 4);
			System.out.println("Peek 2: " + peek(2));
			push(1, 3);
			push(1, 7);
			push(1, 5);
			System.out.println("Peek 1: " + peek(1));
			pop(1);
			System.out.println("Peek 1: " + peek(1));
			pop(1);
			System.out.println("Peek 1: " + peek(1));


		}
}