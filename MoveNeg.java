//----MOVING ALL THE NEGATIVE ELEMENTS TO ONE SIDE OF ARRAY.....

import java.io.*;
import java.util.*;

class MoveNeg
{
public static void main(String args[])
{
int a[] = {-2,2,1,-4};
int temp,len,low=0,high;
len= a.length;
high= len-1;

while(low<high)
{  
//-------------negative and  negative
 if(a[low] <0  && a[high]<0)
	{
 	 low++;
	}
//----------------negtive and positive
else if(a[low]<0 && a[high]>0)
	{
	 low++;
	}
//-----------positive and negative
else if(a[low]>0 && a[high]<0)
	{
	  temp = a[low];
	a[low] = a[high];
	a[high] = temp;
	low++;
	high--;
	}
//---------------positive and positive
else if (a[low]> 0 && a[high]>0)
	{
	  high--;
	}

}
//--------------Displaying the array------------
System.out.println("The array elements are: ");
for(int i=0;i<len;i++)
{
System.out.print(a[i]+" ");
}
}
}