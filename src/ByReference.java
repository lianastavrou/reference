
public class ByReference {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		for (int element:array)
		System.out.print(element+" ");
		System.out.print("\n");
	
		boo (array);{
		
		System.out.println("after calling boo: " );
		for (int element:array)
		System.out.print(element+" ");
		System.out.print("\n");}
		}
		public static void boo(int[] arr) {
			for (int i=0; i<arr.length; i++)
				arr[i]= 2*i;
		}
	
	
}
