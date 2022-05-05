import java.util.*;
import java.io.*;
class linkedlist
{
	static node head;
	static class node
	{
		int data;
		node next;
		node (int d);
		
		{
			data =d;
			next=null;
			
		}
	}
	node reverse (node node){
		node prev =null;
		node current=node;
		node next=null;
		while (current !=null)
		{
			next=current.next;
			current.next=prev;
			current=next;
		}
		node=prev;
	return node;
	
	}
	void linkedlist(node node)
	{
		while node !=null)
		System.out.println(node node+" ");
		node=node.next;
		
		public static void main (String [] args
		{
			linked list=new linkedlist();
			list.head=new node(1);
			list.head.next=new node(5);
			list.head.next.next=new node(1);
			list.head.next.next.next=new node(2);
			list.head.next.next.next.next=new node(3);
			list.headnext.next.next.next.next=new node(4);
			list.head.next.next.next.next.next=new node(5);
			System.out.println("given")
			
		}
		
	}
	
}