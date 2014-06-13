



public class replacekongge{



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc d ef";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		replace(arr, str.length());	
		System.out.println(String.valueOf(arr));
	}



	
	public static void replace(char[] str, int length){
		int count = 0, newlength = 0;
		for(int i = 0 ;i<str.length;i++){
			if(str[i] == ' '){count++;}


		newlength = length +2*count;
		}
		for(int i = length-1; i > 0; i--){
			int j = newlength-1;
			if(str[i] ==' '){
				str[j--]='0';
				str[j--]='2';
				str[j--]='%';
			}else{
			str[j--] = str[i];

			}
			
		}
		System.out.print(count);

	}
}







