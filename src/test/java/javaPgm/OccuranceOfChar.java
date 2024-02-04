package javaPgm;

import java.util.Arrays;

public class OccuranceOfChar {


	public static void main(String[] args) {

		//***********Occurance of char
		//		String str="excellence";
		////		char c='e';
		//		int count=0;
		//		//	o/p=4
		//		for(int i=0; i<str.length();i++)
		//		{
		//			if(str.charAt(i)=='e')
		//			{
		//				count++;
		//			}
		//		}
		//		System.out.println(count);


		//*******************max 1 and MAX2
		//		int a[]= {1,3,4,2,6};
		//		int max1=0;//1
		//		int max2=0;//0,1

		//		for(int i=1; i<=a.length-1;i++)
		//		{
		//			if(a[i]>max1)//1>0, 3>1,4>
		//			{
		//				max2=max1;//0<--0.:1:
		//				max1=a[i];//max1=1:3:
		//			}
		//			else if(a[i]>max2)
		//			{
		//				max2=a[i];
		//			}
		//		}
		//
		//		System.out.println(max1 +" "+max2);

		//****************** equality of array	
		//		int aa[]= {1,3,4,2,6};
		//		int bb[]= {1,3,4,2,6,9};
		//		boolean status=false;
		//		
		//		//using inbuilt methods
		//		boolean arrayEquality = Arrays.equals(aa, bb);
		//		System.out.println(arrayEquality);
		//		
		//		
		//		if(aa.length==bb.length)
		//		{
		//			for(int i=0;i<aa.length;i++)
		//			{
		//				if(aa[i]==bb[i])
		//				{
		//					status=true;
		//					
		//				}
		//				
		//			}
		//			System.out.println(status);
		//		}
		//		else{
		//			System.out.println("length is not equal");
		//		}

		//length of string without using length method

		String s1="Excellence";
		int countt=0;
		char[]a=s1.toCharArray();
		
		System.out.println(a);
//		char[]a= {'e','x','c','e','l','l','e','n','c','e'};
		for(char c:a)
		{
			countt++;
		}
		System.out.println(countt);

	}
}
