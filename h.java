import java.util.*;
class h
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    //finding max
    Arrays.sort(arr);
    int max=arr[n-1];
    //finding count array
    int c[]=new int[max+1];
    for(int i=0;i<n;i++)
    c[arr[i]]++;
    //finding missing values
    System.out.println("code for missing values");
    for(int i=0;i<max+1;i++)
    {
        if(c[i]==0)
        System.out.print(i+" ");
    }
    }
}
