package BuiPhuongNga.com;

import java.util.Random;
import java.util.Scanner;

public class Test {
	static void xuatMang(int []M)
	{
		for(int i=0; i<M.length;i++)
		{
			System.out.println(M[i]+" ");
			
		}
	}
	static void nhapMang(int []M) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập các giá trị của mảng: ");
		for (int i=0;i<M.length;i++) 
		{
			M[i]=sc.nextInt();
		}
	}
	static void soLe(int []M)
	{
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (M[i] % 2 !=0) 
			{
				dem++;
				System.out.print(M[i]+" ");
			}
		}
		System.out.println("tổng số có : "+dem+" số lẻ" );
	
	}
	static void soChan(int []M)
	{
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (M[i] % 2 ==0) 
			{
				dem++;
				System.out.print(M[i]+" ");
			}
		}
		System.out.println("tổng số có : "+dem+" số chẵn" );
	
	}
	
	static boolean kiemTraNguyenTo(int n)
	{
		if (n < 2)
	     {
			return false;
	     }
	    for (int i = 2; i <= Math.sqrt(n); i++)
	    {
	        if (n % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	static void soNguyenTo(int[]M)
	{
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			   if ( kiemTraNguyenTo(i)) 
		           {
				   		dem++;
				   		System.out.print(M[i]+" ");
		           }	   
		}
		System.out.println("tổng số có : "+dem+" số nguyên tố");
	}
	static void soKhongLaNguyenTo(int[]M)
	{
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			   if ( kiemTraNguyenTo(i)) 
		           {
				   		dem++;
		           }
			   else
			   {
				   System.out.print(M[i]+" ");
			   }
		}
		int x = M.length -dem;
		System.out.println("tổng số có : "+x+" không là số nguyên tố");

	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n=sc.nextInt();
		int []M;
		M= new int[n];
		nhapMang(M);
		System.out.print("Số lẻ trong mảng :");soLe(M);
		System.out.print("Số chẵn trong mảng :");soChan(M);
		System.out.print("Số nguyên tố trong mảng :");soNguyenTo(M);
		System.out.print("Số không phải nguyên tố trong mảng :");soNguyenTo(M);
	}

}
