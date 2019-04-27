public class Routes {
    public String RouteName;
    private String routeName;
    private int routeId;
    private Nodes[] nodes;

    public Routes(String s) {
        RouteName = s;
    }

    public int getNumPeople()
    {
        return 1;
    }
    public Person [] listPeople()
    {
        return null;
    }
    public int calculateHeuristic(Person p)
    {
        return 0;
    }
    public void addNode(Nodes n)
    {

    }
}
