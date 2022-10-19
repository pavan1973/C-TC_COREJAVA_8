package com.array;
import Collection_Framework.Student;

public class ArrayOfStudent {

	public static void main(String[] args) {
		Student arr[];
		arr=new Student[5];
		arr[0]=new Student(101,"jon","cs");
		arr[1]=new Student(102,"bob","ec");
		arr[2]=new Student(103,"tom","cs");
		arr[3]=new Student(104,"json","ec");
		arr[4]=new Student(105,"tomson","cs");
		
		for(int i=0;i<arr.length;i++) {
		System.out.print("the element at the index: "+i+" is");
		System.out.println(arr[i]);
		}
	}

}
