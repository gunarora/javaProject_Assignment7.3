//Package declaration is mandatory
package javaProject_Assignment7;

public class StringBufferCapacity {

	//Main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default capacity 16  
		//appending string into string buffer to increasing capacity
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("Capacity will increase");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.append("Capacity will increase again");  
		System.out.println(sb.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2
		}  

	}


