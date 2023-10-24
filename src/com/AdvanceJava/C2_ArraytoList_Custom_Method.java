package com.AdvanceJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArraytoList_Custom_Method {

	public static List arrToList(Object[] array ) {
		List<Object> list = new ArrayList<Object>();
		for (Object object : array) {
			list.add(object);
		}
		return list;
	}
	
	public static <T> List<T> arrToListusingType(T[] array, List<T> list ) {

		for (T object : array) {
			list.add(object);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Character[] charArr= {'d','e','e','p','a','k'};
		
		List<Character> charList= arrToList(charArr);		 //arrToList(charArr);
		//List<String> charList= arrToList(charArr);		 //can't use becuase return will Character Type
		
		List<Character> arrToListusingType= arrToListusingType(charArr, new ArrayList<>());		 //arrToList(charArr);
		
		System.out.println(charList.get(0));

	}

}
