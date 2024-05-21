import java.util.*;
class DeleteElementFromArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no_of_elements=scan.nextInt();
        int[] array=new int[no_of_elements];
        for(int i=0;i<array.length;i++)
        {
            array[i]=scan.nextInt();   
        }
        int position=scan.nextInt();
        array=deleteElement(array,position);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static int[] deleteElement(int[] array,int position)
    {
        int index=0;
        int[] newarray=new int[array.length-1];
        for(int i=0;i<array.length;i++)
        {
            if(i==position)
            {
                continue;
            }
            else
            {
                newarray[index]=array[i];
                index++;
            }
        }
        return newarray;
    }
}