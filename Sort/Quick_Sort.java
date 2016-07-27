public class Quick_Sort {
    public static int[] Aux_array= new int[SearchIo.num.length];
    public Quick_Sort(){
        System.arraycopy(SearchIo.num,0,Aux_array,0,SearchIo.num.length);
    }
    public int getMiddle(int[] list, int low, int high) {   
        int tmp = list[low];    //����ĵ�һ����Ϊ����   
        while (low < high) {   
            while (low < high && list[high] >= tmp) {   
                high--;   
            }   
            list[low] = list[high];   //������С�ļ�¼�Ƶ��Ͷ�   
            SearchIo.drawPanel.repaint();
            try{
                Thread.sleep(100);
            } catch(Exception ex){
                ex.printStackTrace();
            }
            while (low < high && list[low] <= tmp) {   
                low++;   
            }   
            list[high] = list[low];   //�������ļ�¼�Ƶ��߶�   
            SearchIo.drawPanel.repaint();
            try{
                Thread.sleep(100);
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }   
        list[low] = tmp;              //�����¼��β   
        SearchIo.drawPanel.repaint();
        try{
            Thread.sleep(100);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return low;                   //���������λ��   
    }  
    public void _quickSort(int[] list, int low, int high) {   
        if (low < high) {   
            int middle = getMiddle(list, low, high);  //��list�������һ��Ϊ��   
            _quickSort(list, low, middle - 1);        //�Ե��ֱ���еݹ�����   
            _quickSort(list, middle + 1, high);       //�Ը��ֱ���еݹ�����   
        }   
    } 
    public void quick_sort() {   
        if (Aux_array.length > 0) {    //�鿴�����Ƿ�Ϊ��   
            _quickSort(Aux_array, 0, Aux_array.length - 1);   
        }   
    } 
}
