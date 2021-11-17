// ------------SORTING 0'S 1'S & 2'S WITHOUT USING ANY SORTING ALGORITHM.....


import java.io.*;
import java.util.*;


class Sort012
{
public static void main(String args[])
{ 
  int low =0, mid = 0, high,temp,len;
//   ARRAY INITIALIZATION...............
int a[] = {0,1, 1, 0,1,2,2,2,2,1,2,2,1,0,1,0,0,0,1};
len = a.length;
high = len-1;
//CONDITION CHECKING...................
while(mid<=high)
{
 switch(a[mid])
{
case 0 : temp= a[mid];
	a[mid] = a[low];
	a[low] = temp;
	low++;
	mid++;
	break;
case 1 :  mid++;
	break;
case 2 :  temp = a[mid];
	a[mid] = a[high];
	a[high] = temp;
	high--;
	break;
default: System.out.println("lol...");
	break;
}

}
//      DISPLAYING THE SORTED ARRAY.......
System.out.print("The sorted array is : ");
for(int i=0;i<len;i++)
{
System.out.print(a[i]+" " );
}


}
}
