public class Nodes {
    String type;
    int nodeId;
    int weight;
    int distanceToGoal;
    Person[] assignedPersons;
    Nodes[] connectedTo;

    public Person [] listPeople()
    {
        return null;
    }
    public int getNumPeople()
    {
        return 1;
    }
}
