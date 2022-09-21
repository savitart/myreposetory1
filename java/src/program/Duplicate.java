package program;

public class Duplicate {

	public static void main(String[] args) {
		int count=0;
		int arr[]={30,40,50,40,50,30};
		//int sum=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j]){
						count++;
					//sum=sum+arr[i];
						//System.out.println(sum);
				}
				//System.out.println(sum);
			}
			
		}
		System.out.println(count);
 
	}

}
