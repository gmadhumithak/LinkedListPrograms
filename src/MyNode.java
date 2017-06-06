/**
 * Created by mgane2 on 6/6/2017.
 */
public class MyNode {
    MyNode myNode;
    int value;

    public  MyNode(MyNode myNode, int value){
        this.myNode = myNode;
        this.value = value;
    }

    public MyNode getMyNode() {
        return myNode;
    }

    public void setMyNode(MyNode myNode) {
        this.myNode = myNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
