import java.util.Comparator;
import java.util.*;

//Given an array of strings, return all groups of strings that are anagrams.
class anagrams{
    static class Letters{
        String words;
        int index;
    
    Letters(String words ,int index)
    {
        this.words=words;
        this.index=index;

    }
}
static class Darray{
    Letters[]array;
    int size;

    Darray(String str[],int size)
 {this.size=size;
    array=new Letters[size];
    int i;
    for(i=0;i<size;i++)
    {
        array[i]=new Letters(str[i],i);
    }

 }
}
static class compStr implements Comparator<Letters>
{
    public int compare(Letters a ,Letters b)
    {
        return a.words.compareTo(b.words);

    }
}
 static void printAnagrams(String wordarray[] , int size)
  {
      Darray d = new Darray(wordarray, size);
      int i ;
      for(i=0;i<size;i++)
      {
    char[] chararray = d.array[i].words.toCharArray();
          Arrays.sort(chararray);
          d.array[i].words=new String(chararray);
      

          
      }
Arrays.sort(d.array,new compStr());
for(i=0;i<size;++i)

    System.out.print(wordarray[d.array[i].index]+" ");

}
public static void main(String args[])
{
    String wordarray[]={"keep","cat","peek","dog","tac","god"};
    int size =wordarray.length;
    printAnagrams(wordarray, size);

}
}