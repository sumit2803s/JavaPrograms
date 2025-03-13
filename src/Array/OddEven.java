//Rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers
package Array;

public class OddEven {
    public static void main(String[] args) {
        int[] arr= {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int index=0;
        while(index<arr.length && arr[index]%2==0)
        {
            index++;
        }
        for(int i=index+1;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;

                index++;
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
    }
}
