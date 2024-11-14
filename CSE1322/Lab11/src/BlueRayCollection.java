public class BlueRayCollection {
    private Node head = null;

    public void add(String title, String director, int year, double cost){

        Node newNode = new Node();
        newNode.data = new BlueRayDisk(title, director, year, cost);

        if (head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void showAll(){
        while(head.next != null){
            System.out.println(head.data.toString());
            head = head.next;
        }
        System.out.println(head.data.toString());
    }
}
