
public class problem8 {
//    һ�����������ྭ���㷨�����������ϣ������ȡ� ��ʵ��Ӧ��ʱ���������������һЩ�����Ҫ������û��Ҫ������Щ�����㷨�����Ը���ʵ���������
//    �õĽⷨ�� 
//    ���磬��һ�����������е����ֽ��з������� 
//    ʹ�ø���������ˣ����������Ҷˣ�0���в���ע��������ص��ǣ�������������������ڲ���Ҫ�����򡣿�����������ص�ͨ��1������ɨ��ͽ���ս��!! 
//    ���µĳ���ʵ���˸�Ŀ�ꡣ 
//    ����xָ���������������飬len������ĳ��ȡ�
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
                p++;  /*���*/
        }
        
        
    }

    
}
