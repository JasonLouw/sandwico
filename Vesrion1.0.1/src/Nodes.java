import java.util.Vector;

public class Nodes {

    static int numNodes = 0;

    String type;
    int nodeId;
    int weight;
    int distanceToGoal;
//    Person[] assignedPersons;
//    Nodes[] connectedTo;
    Vector<Nodes> connectedTo = new Vector();
    Vector<Person> assignedPersons = new Vector();

    Nodes(String Type,int Weight,int Distance){
        nodeId = numNodes++;
    }

    public Person [] listPeople()
    {
        return null;
    }
    public int getNumPeople()
    {
        return 1;
    }
    void connect(Nodes n){
        connectedTo.add(n);

    }

    public void addPerson(Person p) {
    }
}
