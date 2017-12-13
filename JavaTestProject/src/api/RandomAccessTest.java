package api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class RandomAccessTest {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("ONE");
		arrList.add("TWO");
		arrList.add("THREE");
		long start = System.currentTimeMillis();
		for(int i=0;i<arrList.size();i++){
			arrList.get(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken for arrlist iteration :: "+(end-start)+"ms");
		
		
		LinkedList<String> linkList=new LinkedList<String>();
		linkList.add("ONE");
		linkList.add("TWO");
		linkList.add("THREE");
		
        start=System.currentTimeMillis();
        for(Iterator itr=linkList.iterator();itr.hasNext();)
        {
        	itr.next();
        }
		end=System.currentTimeMillis();
		System.out.println("Time taken for linklist iteration :: "+(end-start)+"ms");	
	}

}
