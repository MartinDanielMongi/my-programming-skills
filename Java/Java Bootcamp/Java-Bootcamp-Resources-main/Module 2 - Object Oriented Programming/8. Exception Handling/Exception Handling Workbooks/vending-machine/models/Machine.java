package models;
public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }
    public boolean getLenth(int index){
        try{
            items[0][index]=items[0][index];
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("INVALID RANGE");
            return false;
        }
    }
    public boolean getRowLenth(int index){
        try{
            items[index][0]=items[index][0];
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("INVALID RANGE");
            return false;
        }
    }
    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }
    
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
        if(items[row][spot].getQuantity()==0){
            System.out.println("EMPTY SLOT");
            return false;
        }else{
        items[row][spot].setQuantity(items[row][spot].getQuantity() - 1);
            return true;
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }

}
