/* creacking the code */

public class isUnigueChar{


	public static void main(String args[]){

	  
        String[] strArray ={"abcdef","dfdsafdsf"};
        for (String s : strArray)
            System.out.println(isUnique(s));
       

	}
	/*public static boolean isUnique(String s){
		if(s.length() > 256){return false;}

		int strlen = s.length();


		boolean flag[] = new boolean[256];

		for(int i = 0; i < strlen; i++){

			
			int val = s.charAt(i);
			if(flag[val] == true){
				return false;
			}

			flag[val] = true;
		}

		return true;
	}
}

*/


	public static boolean isUnique(String s){

		int stelen = s.length();

		if(stelen > 256){ return false;}

		boolean[] a = new boolean[256];  // 方括号别忘

			for(int i = 0 ; i < stelen ; i++){

				int val = s.charAt(i); //s.别忘

				if( a[val] == true){ return false;}  // 等于号要双等于 不然结果不对
				a[val] = true;
			}

		return true;

	}

}





//