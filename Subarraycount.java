//Count the subarrays having product less than k
public class Subarraycount
{
    static int Subarya(int a[], int n, int k) 
    {
        // Counter for single element
        int count = 0;
        int i, j, mul;
        for (i = 0; i < n; i++) 
        {

            if (a[i] < k)

                count++;
            mul = a[i];
        
        for (j = i + 1; j < n; j++) 
            {
                 // Multiple subarray
            mul = mul * a[j];
               // If this multiple is less
                // than k, then increment
            if (mul < k)
                count++;
            else
                break;
            }
        }
    return count;

}

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int k=10;
        int size=a.length;
        int count=Subarya(a,size,k);
        System.out.print(count);

    }
}
