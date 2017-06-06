public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(20);
        System.out.println("Printing List:");
        myLinkedList.printLinkedList();
        myLinkedList.removeLast();
        System.out.println("Printing List after removing Last:");
        myLinkedList.printLinkedList();
        myLinkedList.removeLast();
        System.out.println("Printing List after removing Last:");
        myLinkedList.printLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(20);
        System.out.println("Printing List after Adding:");
        myLinkedList.printLinkedList();
        myLinkedList.removeGreaterThanGiven(30);
        System.out.println("Printing List after removing Given:");
        myLinkedList.printLinkedList();
        myLinkedList.removeGreaterThanGiven(10);
        System.out.println("Printing List after removing Given:");
        myLinkedList.printLinkedList();
    }
}
