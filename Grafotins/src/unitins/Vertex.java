package unitins;

public class Vertex {

    private Node nodeA = null;
    private Node nodeB = null;


    public Vertex(Node nodeA, Node nodeB) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public String toString() {
        return nodeA.getInfo() + " <--" + "--> " + nodeB.getInfo();
    }

    public Node getNodeA() {
        return nodeA;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

}
