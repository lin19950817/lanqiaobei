
public class problem8 {
//    一般的排序有许多经典算法，如快速排序、希尔排序等。 但实际应用时，经常会或多或少有一些特殊的要求。我们没必要套用那些经典算法，可以根据实际情况建立
//    好的解法。 
//    比如，对一个整型数组中的数字进行分类排序： 
//    使得负数都靠左端，正数都靠右端，0在中部。注意问题的特点是：负数区域和正数区域内并不要求有序。可以利用这个特点通过1次线性扫描就结束战斗!! 
//    以下的程序实现了该目标。 
//    其中x指向待排序的整型数组，len是数组的长度。
    public void Problem(){
        pro1();
    }
    private void pro1(){
        int a[]={25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
        int left=0,right=13;
        for(int i=0;i<right;i++){
            if(a[i]<0){
                int _i=a[left];
                a[left++]=a[i];
                a[i]=_i;
            }
            else if(a[i]>0){
                int _i=a[right];
                a[right--]=a[i];
                a[i--]=_i;
            }
        }
        for(int i=0;i<14;i++)
            System.out.print(a[i]+" ");
    }
    public void Answer(){
        int a[]={25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
        sort3p(a,14);
        for(int i=0;i<14;i++)
            System.out.printf("%d ",a[i]);
        System.out.printf("\n");

    }
    private void sort3p(int[] x, int len)
    {
        int p = 0;
        int left = 0;
        int right = len-1;
        
        while(p<=right){
            if(x[p]<0){
                int t = x[left];
                x[left] = x[p];
                x[p] = t;
                left++;
                p++;
            }
            else if(x[p]>0){
                int t = x[right];
                x[right] = x[p];
                x[p] = t;
                right--;            
            }
            else
                p++;  /*填空*/
        }
        
        
    }

    
}
