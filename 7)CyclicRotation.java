//---------Write a program to  CYCLICALLY rotate an array by one.

class CyclicRotation
{
public static void main(String args[])
{
int a[] = {1,2,3,4,5};
int temp,len;
len = a.length;
temp = a[len-1];

for(int i= len-1;i>=1;i--)
{
a[i] = a[i-1];
}




/*for(int i=len-2;i>=0;i--)
{
	a[i+1] = a[i];
	
}*/
a[0] = temp;
for(int i=0;i<len;i++)
{
System.out.print(a[i]+" " );
}
}
}