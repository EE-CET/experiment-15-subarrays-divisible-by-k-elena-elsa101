    import java.util.*;
public class SubarraysDivByK {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),k=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) arr[i]=sc.nextInt();
int[] freq=new int[k];
freq[0]=1;
int sum=0,count=0;
for(int i=0;i<n;i++){
sum+=arr[i];
int rem=((sum%k)+k)%k;
count+=freq[rem];
freq[rem]++;
}
System.out.print(count);
}
}
