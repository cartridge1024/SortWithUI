public class Quick_Sort {
    public static int[] Aux_array= new int[SearchIo.num.length];
    public Quick_Sort(){
        System.arraycopy(SearchIo.num,0,Aux_array,0,SearchIo.num.length);
    }
    public int getMiddle(int[] list, int low, int high) {   
        int tmp = list[low];    //数组的第一个作为中轴   
        while (low < high) {   
            while (low < high && list[high] >= tmp) {   
                high--;   
            }   
            list[low] = list[high];   //比中轴小的记录移到低端   
            SearchIo.drawPanel.repaint();
            try{
                Thread.sleep(100);
            } catch(Exception ex){
                ex.printStackTrace();
            }
            while (low < high && list[low] <= tmp) {   
                low++;   
            }   
            list[high] = list[low];   //比中轴大的记录移到高端   
            SearchIo.drawPanel.repaint();
            try{
                Thread.sleep(100);
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }   
        list[low] = tmp;              //中轴记录到尾   
        SearchIo.drawPanel.repaint();
        try{
            Thread.sleep(100);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return low;                   //返回中轴的位置   
    }  
    public void _quickSort(int[] list, int low, int high) {   
        if (low < high) {   
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二   
            _quickSort(list, low, middle - 1);        //对低字表进行递归排序   
            _quickSort(list, middle + 1, high);       //对高字表进行递归排序   
        }   
    } 
    public void quick_sort() {   
        if (Aux_array.length > 0) {    //查看数组是否为空   
            _quickSort(Aux_array, 0, Aux_array.length - 1);   
        }   
    } 
}
