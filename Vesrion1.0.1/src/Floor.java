import java.util.Vector;

public class Floor {
    protected Vector<Node> nodes= new Vector<>();
    private Vector<Floor> ConnectedTo= new Vector<>();

    public Floor(String n) {
    }

    public int getNumPeople()
    {
        return 1;
    }

    public Vector<Person> ListPeople()
    {
        return null;
    }

    public Node getNode(int id)
    {
        for (Node n :nodes) {
            if(n.nodeId == id)
                return n;
        }
        return null;
    }
    public void addNode(Node n){
        nodes.add(n);
    }
}
