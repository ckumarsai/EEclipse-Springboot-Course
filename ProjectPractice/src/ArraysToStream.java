import java.util.Arrays;

public class ArraysToStream {
	
	public static  void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println("average using iteration:" + (sum/arr.length));
			sum=Arrays.stream(arr).sum();
			System.out.println("average using Stream:" + (sum/arr.length));
			System.out.println("printing array elements:");
					Arrays.stream(arr)
					   .forEach(e->System.out.print(e + " "));
		}
	}

}
