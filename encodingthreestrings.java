import java.io.*;
import java.util.*;
class EncodingThreeStrings{
 public static String changeCase(String str)
 {
  StringBuffer newS = new StringBuffer(str);
  for(int i=0;i<str.length();i++)
  {
   Character c=str.charAt(i);
   if(Character.isLowerCase(c))
   {
    newS.replace(i, i+1, Character.toUpperCase(c)+"");
   }
   else
   {
    newS.replace(i, i+1, Character.toLowerCase(c)+"");
   }
  }
  str=newS.toString();
  return str;
 }