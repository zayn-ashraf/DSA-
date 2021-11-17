import java.io.*;
import java.util.*;

class Reverse
{
public static void main(String arg[])
{
 String str = "esreveR";
 String rev = "";
 String org = "";
 String wile = "";
 char var;
 int len = str.length();
 for (int i=0;i<len; i++)
   {
     var = str.charAt(i);
     org = org+var;
   }

System.out.println("The Original String is " + org);
 for (int i=len-1;i>=0; i--)
   {
     var = str.charAt(i);
     rev = rev +var;
   }
System.out.println("The Reverse String is " + rev);

while(len-1>=0)
{
var = str.charAt(len-1);
wile= wile + var;
len--;

}

System.out.println("The Reverse String (while): " + wile);









}


}
