public class Select_sort {
    public static int[] Aux_array= new int[SearchIo.num.length];
    public Select_sort(){
        System.arraycopy(SearchIo.num,0,Aux_array,0,SearchIo.num.length);
    }
    public void Select(){
        for(int i=0;i<Aux_array.length;i++){
            for(int j=i+1; j<Aux_array.length;j++){
                if(Aux_array[i] > Aux_array[j]){
                    int swp = Aux_array[i];
                    Aux_array[i] = Aux_array[j];
                    Aux_array[j] = swp;
                }
                SearchIo.drawPanel.repaint();
                try{
                    Thread.sleep(20);
                } catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        SearchIo.drawPanel.repaint();
    }
}
