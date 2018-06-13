import java.util.Scanner;
public class Subarray {
public static void main(String[] args)
{
	int[] arr=new int[10];
	int size,i,count=1,max=1;
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
	for(i=1;i<size;i++)
	{
			if(arr[i]>arr[i-1])
			count++;
			else if(max<count)
			{
				max=count;
				count=1;
			}		
		}
	if(max<count)
		max=count;
	System.out.print("Length="+max);
}
}