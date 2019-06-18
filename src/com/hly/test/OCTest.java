package com.hly.test;

import java.util.ArrayList;
import java.util.List;


public class OCTest {
	
	void OOM() {
		int n =100;
		//空间复杂度 表示的是占用内存
		int a[] = new int[n];		//O(n) 字典树
		//Map<String, String> 
		
		//List<Integer> list = new ArrayList<>();		//
		//缓存
	}

	public static void main(String[] args) {
		
		//常数性时间复杂度
		int n = 0;//O(1)
		int a = n + 1;//O(1)
		for(int i = 0 ; i < 100;i++) {	//O(100) => O(1)
			//这里确实要运行100次即O(100)，但是我们在计算时间复杂度的时候不需要常数。O(1)
		}
		
		//线性性
		int m =100;
		for(int j = 0 ; j < m ; j ++) {	// O(m)
			
		}
		
		//对数性 nlog(n) 快速排序
	
		for(int i = 0 ; i < n;i++) {
			n = 16;
			//O(n)
			int c = 1;
			while(c < n) {
				//Olog(n)
				c = c * 2;		//认为有多少个2乘以大于n就退出 O(n)*O(logn)=?O(nlogn)
				//c=2
				//c=4
				//c=8
				//递归的时候用的最多
				//2 4 8 13 32
			}
			//2 * 2 * 2 * 2 *2 >= 16
		}
		// 2^c=n => c = log2^n; 2 => log2(n)
		
		//平方性
		for(int i = 0 ; i < n;i++) {		//O(n^2)
			//O(n)
			for(int j = 0 ;j < n;j++) {
				//O(n)
			}
		}
		
		for(int i = 1 ; i <=n; i ++) {
			for(int j = i ; j <= n;j++) {
				
			}
		}
		/**
		 * 
		 * 如果i=n 1
		 * i=n-1 2
		 * i=n-2 3
		 * i=1	n
		 * n+(n-1)+(n-2)+……+1=>(1+n)*n/2=> n^2/2+n/2 =>O(n^2) 去掉吃常数 保留最高阶
		 */
	}
}
