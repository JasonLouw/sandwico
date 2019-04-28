public class RTFEServer extends Server {
    public RTFEServer(){};

    @Override
    void  start(){

        System.out.println("--------------------------");
        System.out.println("RTFE Server");
        System.out.println("--------------------------");


    }

    public void run(){
        System.out.println("--------------------------");
        System.out.println("RTFE Server2");
        System.out.println("--------------------------");
        try {
            Building Demo1 = new Building("CS_Department");

            Demo1.addFloor(new Floor("groundLevel"));

            Floor groundLevel = Demo1.getFloor(0);
            Node start = new Node("normal", 1);
            start.addPerson(new Person("JohnDoe"));

            Node orangePathPoint = new Node("normal", 1);
            Node orangeGoal = new Node("goal", 1);

            Node BluePathPoint = new Node("normal", 1);
            Node BlueGoal = new Node("goal", 1);

            //This will add all the nodes to the building but we have no way of moving between them yet so dont forget to connect them to each other

            groundLevel.addNode(start);
            groundLevel.addNode(orangePathPoint);
            groundLevel.addNode(orangeGoal);
            groundLevel.addNode(BluePathPoint);
            groundLevel.addNode(BlueGoal);

            //OOH!!! we should be able to get the num people now!
            System.out.println("# People in Building: " + Demo1.GetNumPeople());

            //This current way of connecting means it is only one way thus when the AI program does comparisons it will decrease the change of cycles occuring
            start.connect(orangePathPoint, 3);
            start.connect(BluePathPoint, 4);

            orangePathPoint.connect(orangeGoal, 4);
            BluePathPoint.connect(BlueGoal, 4);

            //We have to add it to the route cant just have descriptive names XD
            Routes blue = new Routes("Blue");
            Routes orange = new Routes("Orange");
            blue.addNode(BluePathPoint);
            blue.addNode(BlueGoal);
            orange.addNode(orangePathPoint);
            orange.addNode(orangeGoal);

            Demo1.AssignRoutes();


            //Some testing
            System.out.println("People and assigned Routes");
            System.out.println("--------------------------");
            for (Person person : Demo1.ListPeople()) {
                System.out.print(person.name + " - " + person.getAssignedRoute().RouteName);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
