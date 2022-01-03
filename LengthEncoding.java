// public class LengthEncoding
//  {
//     public static void PrintRunLength(String s)
//     {
//         int size = s.length();
//         int count =1;
//         for(int i=1;i<size;i++)
//         {
//             if(s.charAt(i) == s.charAt(i-1))

//             {
//                 count=count+1;
//             }
//             else{
//                 System.out.print(s.charAt(i));
//                 System.out.print(count);
//                  //count=1;
//             }
        
//         //  System.out.print(s.charAt(i));
//         //  System.out.print(count); 
//     }
//     }
//     public static void main(String[] args)
//      {
//         String s="wwwwaaadexxxxxxywww";
//         PrintRunLength(s);
//     }
// }
// //output - w4a3d1e1x6y1w3


class LengthEncoding{
    public static void main(String[] args) {
        String s="wwwwaaadexxxxxxy";
        char ch[]=s.toCharArray();
        int size=ch.length;
        for(int i=0;i<size;i++)
        {
            int count=1;
            for(int j=i+1;j<size;j++)
            {
                if(ch[i]==ch[j] )
                {
                  
                    count=count+1;
                    
                    for(int k=j;k<size-1;k++)
                    {
                        ch[k]=ch[k+1];
                        
                    }
                    j--;
                    size--;
                }
            }
            System.out.print(ch[i]+""+count);
        }
    }
}