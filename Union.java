//this program is to find union of two arrays.
import java.io.*;
import java.util.*;
class Union
{
public static void main(String args[])
{
//-------------INITIALIZING THE ARRAY'S ---------
Integer a[] = {10,20,30,50};
Integer b[] = {30,50,60};
HashSet<Integer> set = new HashSet<>();
//-----------ADDING THE ARRAY INTO HASHSET OBJECT-----
set.addAll(Arrays.asList(a));
set.addAll(Arrays.asList(b));
//----------------DISPLAYING THE HASHSET------
System.out.println(set);

//--------------INTERSECTION---------------
System.out.println("Intersection of two arrays : ");
for(int i=0;i<a.length;i++)
{
  for(int j=0;j<b.length;j++)
{
  if(a[i]==b[j]){
System.out.println(a[i]);
}
}
}

}
}