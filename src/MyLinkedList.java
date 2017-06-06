import java.util.HashMap;
import java.util.Map;

public class MyLinkedList {

    MyNode headNode;
    int size ;

    public void add(int value){
        if(headNode == null){
            headNode = new MyNode(null,value);
            System.out.println("Added Value:"+headNode.getValue());
        }
        else {
            add(headNode,value);
        }
    }
    public void add(MyNode myNode,int value){
        MyNode mN1 = myNode;
        if(mN1.getMyNode()!=null){
        add(mN1.getMyNode(),value);
        }
        else{
           MyNode newNode = new MyNode(null,value);
            mN1.setMyNode(newNode);
            System.out.println("Added Value:"+value);
        }
    }

    public void printLinkedList(){
        MyNode  node = headNode;
        while(node!=null)
        {
            System.out.println(node.getValue());
            node = node.getMyNode();
        }
    }

    public void removeLast(){
        MyNode  previousNode = headNode;
        MyNode currentNode = headNode;
        while(currentNode.getMyNode()!=null){
            previousNode=currentNode;
            currentNode=currentNode.getMyNode();
        }
        previousNode.setMyNode(null);
    }

    public void removeGiven(int target) {
        MyNode  previousNode = headNode;
        MyNode currentNode = headNode;
        if(currentNode.getValue()==target){
            headNode=currentNode.getMyNode();
        }

        previousNode = currentNode;
        while(currentNode.getMyNode()!=null){
            currentNode = currentNode.getMyNode();
            if(currentNode.getValue()==target && currentNode.getMyNode()!=null){
                previousNode.setMyNode(currentNode.getMyNode());
            }
            else if(currentNode.getValue()==target && currentNode.getMyNode()==null) {
                previousNode.setMyNode(null);
            }
            else {
                previousNode = currentNode;
            }
        }
    }
}
