/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("hello, singly linked list");
		SinglyLinkedList list = new SinglyLinkedList();
		list.Append(17);
		list.Prepend(9);
		list.Append(5);
		
		list.Sort(true);
		list.Print();
	}
}
