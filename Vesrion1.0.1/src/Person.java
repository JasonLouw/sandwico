public class Person {
    static int numPeople = 0;
    public String name;
    Routes AssignedRoute;
    int [] Position;
    int personID= 0;

    public Person(String n) {
        name = n;
        personID =numPeople++;

    }

    public void setPosition(int[] position) {
        Position = position;
    }

    public void setAssignedRoute(Routes assignedRoute) {
        AssignedRoute = assignedRoute;
    }

    public int getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public int[] getPosition() {
        return Position;
    }

    public Routes getAssignedRoute() {
        return AssignedRoute;
    }
}
