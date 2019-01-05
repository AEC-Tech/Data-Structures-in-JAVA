package data_structure;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int a[]= {23,78,52,28,60,77};
		int i,num;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be searched ");
		num=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Found at position "+(i+1));
				found=true;
				break;
			}
			
		}
		if(found==false)
			System.out.println("No. not found");
	}

}
