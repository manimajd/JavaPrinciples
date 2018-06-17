/*
									read file 

Created by:		Mani Majd
Date:			August 8th 2017
Purpose:		Training

*/
import java.io.*; 
import java.util.*;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
	
		/*
		int [] list1 = {5,7,7,7,8,22,22,31,35,35,40,40,40,41};			arrayTest(list1);
		int [] list2 = {1,2,11,17,19,23,24,25,31,34,40,41};				arrayTest(list2);
		int [] list3 = {1,1,1,1,2,2,2,2,3,3,3};							arrayTest(list3);
		int [] list4 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};					arrayTest(list4);
		int [] list5 = {84};											arrayTest(list5);
		int [] list6 = {42,42,42,42,42,42,42,42,42};					arrayTest(list6);
		int [] list7 = {};												arrayTest(list7);
		*/
		
		
		int [] list1 = {1,3,8,0,19,24,0,7,2,0};							arrayTest(list1);
		int [] list2 = {7,3,0,4,6,0,0,13,0,78,0,0,19};					arrayTest(list2);/*
		int [] list3 = {1,2,3,4,5};										arrayTest(list3);
		int [] list4 = {1,0,2,0,0,3,0,0,0,4,0,0,0,0};					arrayTest(list4);
		int [] list5 = {0,0,8,3,0,0,4,0,0,7,2,0,0,18};					arrayTest(list5);
		int [] list6 = {0,0,0,0};										arrayTest(list6);
		int [] list7 = {0};												arrayTest(list7);
		int [] list8 = {};												arrayTest(list8);
		*/
		
//		int [] list1 = {7,8,3,4,9,2,5,8,13,7};							arrayTest(list1);
//		int [] list2 = {3,5,2,9,8,-4,7,6,2,8,3,1,0,42,12};				arrayTest(list2);
//		int [] list3 = {1,3,8,9,5,7,2};									arrayTest(list3);
//		int [] list4 = {3,8};											arrayTest(list4);
		
	}//end of Main
	
	public static void arrayTest(int[] list){
		System.out.println("Before: "+Arrays.toString(list));
		System.out.print("After : ");
		//System.out.println(uniqueNum (list));
		
//		shiftZeros (list);
//		System.out.println(Arrays.toString(list));
		
		System.out.println(Arrays.toString(fiveSum (list)));
		System.out.println("_____________________________________________________");

		
	}





	public static int uniqueNum(int[] list) {
		
		if(list.length == 0){
			return 0;
		}else{
			int count = 1;
			for(int i =1; i<list.length; i++){
				if(list[i] != list[i-1]){
					count++;
				}
			}//end for loop
			return count;
		}//end of if-lock
	}// end of uniqueNum method
	
	
	
	public static void shiftZeros(int[] list) {
		int[] temp = new int [list.length];
		int count = 0;			//number of non-zero value
		for (int i = 0; i< list.length; i++){
			if(list[i] != 0){
				temp[count] = list[i];
				count++;
			}// end of if-block
		}//end of for loop
		
		//list = temp;
		for(int i = 0; i < temp.length; i++){
			list[i] = temp[i];
		}
	}//end of removeZeros method
	
	public static void shiftZeros2(int[] list){
		int count = 0;			//number of non-zero value
		for (int i = 0; i< list.length; i++){
			if(list[i] != 0){
				list[count] = list[i];
				count++;
			}// end of if-block
		}//end of for loop
		
		for(int i = count; i < list.length; i++){
			list[i] = 0;
		}
	}//end of shiftZeros2 method
	
	
	public static int [] fiveSum(int[] list) {
		int[] sum = new int[5];
		
		for(int i=0; i< list.length; i++){
			sum[i % 5] +=list[i];
		}
		
		return sum;
	}// end of fiveSum method

}