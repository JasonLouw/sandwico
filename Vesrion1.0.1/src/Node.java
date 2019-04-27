import java.util.Vector;

public class Node {

    static int numNodes = 0;

    String type;
    int nodeId;
    int weight;
    int distanceToGoal;
    Vector<Node> connectedTo = new Vector();
    Vector<Person> assignedPersons = new Vector();

    Node(String Type, int Weight, int Distance){
        nodeId = numNodes++;
        type= Type;
        weight = Weight;
        distanceToGoal = Distance;
    }

    public Vector<Person> listPeople()//Done
    {
        return assignedPersons;
    }
    public int getNumPeople()//Done
    {
        return assignedPersons.size();
    }
    void connect(Node n){// Done
        connectedTo.add(n);

    }

    public void addPerson(Person p) {//Done
        assignedPersons.add(p);
    }
    public Person removePerson(Person p) { //Done
        Person temp= null;
        for (int i=0;i<assignedPersons.size();i++){
            if(assignedPersons.get(i) == p){
                temp= assignedPersons.remove(i);
                break;
            }
        }
        return temp;
    }

    public int getNodeId() {
        return nodeId;
    }

    public String getType() {
        return type;
    }

    public int getDistanceToGoal() {
        return distanceToGoal;
    }
}
