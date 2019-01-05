package data_structure;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		int a[]= {12, 23,29,32,36,45,56,69};
		int num, beg, end, mid;
		boolean found=false;
		beg=0;
		end=a.length-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt();
		while(beg<=end)
		{
			mid=(beg+end)/2;
			if(a[mid]==num)
			{
				System.out.println("Found at position "+(mid+1));
				found=true;
				break;
			}
			else if(num>a[mid])
				beg=mid+1;
			else if(num<a[mid])
				end=mid-1;
		}
		if(found==false)
			System.out.println("No. not found ");
		

	}

}
