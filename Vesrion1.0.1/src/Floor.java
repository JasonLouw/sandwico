import java.util.Vector;

public class Floor {
    protected Vector<Nodes> nodes= new Vector<>();
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

    public Nodes getNode(int id)
    {
        for (Nodes n :nodes) {
            if(n.nodeId == id)
                return n;
        }
        return null;
    }
}
