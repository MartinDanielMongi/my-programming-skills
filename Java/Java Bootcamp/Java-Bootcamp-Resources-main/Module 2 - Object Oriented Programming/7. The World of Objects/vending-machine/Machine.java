import java.util.Arrays;

public class Machine {
    private Item[][] items= new Item[3][3] ;


    public Machine(Item[][] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[0].length; j++) {
                this.items[i][j] = new Item (items[i][j]);
            }
        }  
    }
    

    public Item getMachine(int row, int spot) {
        return new Item (this.items[row][spot]); 
    }

    public void setMachine(Item[][] machine, int row, int spot) {
        this.items[row][spot] = items[row][spot];
    }
    
    public boolean dispense(int row, int spot){
    int l=0;
        if(items[row][spot].getQuantity()==0){
            return l==1;
        }else{
            items[row][spot].setQuantity(items[row][spot].getQuantity()-1);
            return l==0;
        }

     }
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

     public String toString(){
        String temp= "";
        for (int i = 0; i < items.length; i++) {
            if(i!=0){
            temp=temp + "          \n\n          ";
            }else{
            temp=temp + "          ";}
            for (int j = 0; j < items[0].length; j++) {
                temp= temp + items[i][j] + "   ";   
            }
        }
        temp += "\n\t************************************************\n\n";
        return temp;
     }

}
