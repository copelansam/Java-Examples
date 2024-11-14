public class MerchandiseStorage {
    Merchandise top = null;

    public void addMerchandise(String merchandise){
        Merchandise newMerch = new Merchandise(merchandise);
        if (top == null){
            top = newMerch;
        }
        else{
            newMerch.next = top;
            top = newMerch;
        }
    }
    public String retrieveMerchandise(){
        if (top == null){
            return "";
        }
        else {
            String retrieve = top.merchandise;
            top = top.next;
            return retrieve;
        }
    }
}
