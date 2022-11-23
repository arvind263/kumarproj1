package Java;

public class MaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 41,20,61,85,38};
		int min=arr[0];
		int max=arr[1];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		System.out.println(" "+min);
		System.out.println(" "+max);

	}

}
