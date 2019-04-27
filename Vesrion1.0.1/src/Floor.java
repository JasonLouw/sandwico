import java.util.Vector;

public class Floor {
    protected Vector<Nodes> nodes;
    private Vector<Floor> ConnectedTo;

    public Floor(String n) {
    }

    public int getNumPeople()
    {
        return 1;
    }

    public Person[] ListPeople()
    {
        return null;
    }

    public Nodes getNode(int id)
    {
        return null;
    }
}
