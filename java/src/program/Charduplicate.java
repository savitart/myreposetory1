package program;

public class Charduplicate {

	public static void main(String[] args) {
		String str="Archana Chandrakant";
		char[] cvt=str.toCharArray();              //lifeis_unpredictable
		System.out.println(str);
		System.out.println("duplicate in adove string");
		for(int i=0; i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if (cvt[i]==cvt[j])
						{
					System.out.println(cvt[j]);
					break;
				}
			}
			
		}
	}

}  
