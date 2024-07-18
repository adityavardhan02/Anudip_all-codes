package anudip;

public class MinMaxArray {

	public static void main(String[] args) {
		int arr[]= {12,24,26,30, 41};
		int maxNo=arr[0];
		int minNo=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(minNo>arr[i]) {
				minNo=arr[i];
			}
			if(maxNo<arr[i]) {
				maxNo=arr[i];
			}
			
			System.out.println("maximum number:"+maxNo);
			
			
			
			System.out.println("minimum number:"+minNo);
		}
		
	}

	}
	
