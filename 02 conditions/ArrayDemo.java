public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];//default value 0 will be initialized for all index
        int[] values = new int[]{5,4,3,6};
 
        System.out.println(arr);//hash code of array object
        System.out.println(values.length);//length of array
 
        arr[2] = 78;
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        System.out.println(arr[5]);
 
    }
}