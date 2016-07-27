public class Shell_Sort {  
    public static int[] Aux_array= new int[SearchIo.num.length];
    public Shell_Sort(){
        System.arraycopy(SearchIo.num,0,Aux_array,0,SearchIo.num.length);
    }
    public void shellSort() {  
        int j = 0;  
        int temp = 0;  
        for (int increment = Aux_array.length / 2; increment > 0; increment /= 2) {  
            //控制哪一组开始排序
            for (int i = increment; i < Aux_array.length; i++) {  
                temp = Aux_array[i];  
                //控制组内的排序
                for (j = i; j >= increment; j -= increment) {  
                    if(temp < Aux_array[j - increment]){  
                        Aux_array[j] = Aux_array[j - increment];  
                    }else{  
                        break;  
                    }  
                }   
                Aux_array[j] = temp;  
                SearchIo.drawPanel.repaint();
                try{
                    Thread.sleep(100);
                } catch(Exception ex){
                    ex.printStackTrace();
                }
            }  
        }  
    }  
}
