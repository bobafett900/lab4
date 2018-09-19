import java.util.Arrays;
public class Lab4
{
    public static void main(String[] args)
    {

        Integer[] a1 = new Integer[5];
        a1[0] = 36;
        a1[1] = 12;
        a1[2] = 17;
        a1[3] = 59;
        a1[4] = 64;

        sort(a1);
        System.out.print(Arrays.toString(a1));
    }//end of main method

    public static Integer[] sort(Integer[] a)
    {


        for (int i = 0; i < a.length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < a.length; j++)

               if(a[j] < a[min])
                   min = j;
               int temp = a[i];
               a[i] = a[min];
               a[min] = temp;
            //end of 2nd for loop
        }//end of for loop


        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }

}//end of Lab4
