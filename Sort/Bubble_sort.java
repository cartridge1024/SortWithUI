public class Bubble_sort {
    public static int[] Aux_array= new int[SearchIo.num.length];
    public Bubble_sort(){
        System.arraycopy(SearchIo.num,0,Aux_array,0,SearchIo.num.length);
    }
    public void bull(){
        for(int j=0;j<Aux_array.length;j++){
            for(int i=1; i<Aux_array.length;i++){
                if(Aux_array[i-1]>Aux_array[i]){
                    int swp = Aux_array[i-1];
                    Aux_array[i-1] = Aux_array[i]; 
                    Aux_array[i] = swp;
                }
                SearchIo.drawPanel.repaint();
                try{
                    Thread.sleep(10);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }  
            }
        }
        SearchIo.drawPanel.repaint();
    }
}
