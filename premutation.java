public class premutation{


/*

	public static boolean isPermutation(String s, String t){
		if(s == null || t == null) return false;
		return sortString(s).equals(sortString(t));
	}
	public static String sortString(String s){
		char[] s_array = s.toCharArray(); //用 toCharArrary 将string 转换成数组，用sort将其排序 用equals比较
		java.util.Arrays.sort(s_array);
		return new String(s_array);
	}
*/





	public static void main(String[] args){
		
		String s1 = "woooi", s2 = "ooowni";
		

		if(isPermutation(s1, s2)){
			System.out.println("str2 is permutation of st1");
		}else{
			System.out.println("str2 is not permutation of st1");
		}

	}


	public static boolean isPermutation(String s1, String s2){    //记数每一位上的加减 若是permutation 最后应为零
		if(s1.length() != s2.length()){return false;}

		int[] arr = new int[256];
		for(int i =0; i<s1.length(); i++){
			int a = s1.charAt(i);
			int b = s2.charAt(i);
			arr[a]++;
			arr[b]--;
		}

		for(int i = 0; i<256; i++){
			if(arr[i] != 0){return false;}
		}

		return true;

	}


public static boolean permutation2(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] counts = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			int val = str1.charAt(i);
			counts[val] += 1;
		}

		for (int i = 0; i < str2.length(); i++) {
			int val = str2.charAt(i);
			counts[val] -= 1;

			if (counts[val] < 0) {
				return false;
			}
		}
		return true;
	}
}


}