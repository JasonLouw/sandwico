public class Main {

    public static void main(String[] args) {
        try
        {
            //Try pseudo code
            //Create Building
            //Building->addFloor
            //Node(String Type,int Weight,int Distance)
            Building Demo1 = new Building("CS_Department");

            Demo1.addFloor(new Floor("groundLevel"));

            Floor groundLevel = Demo1.getFloor(0);
            Node start = new Node("normal",1,0);
            start.addPerson(new Person("JohnDoe"));

            Node orangePathPoint = new Node("normal",1,4);
            Node orangeGoal = new Node("goal",1,0);

            Node BluePathPoint = new Node("normal",1,4);
            Node BlueGoal = new Node("goal",1,0);

          //This will add all the nodes to the building but we have no way of moving between them yet so dont forget to connect them to each other
            groundLevel.nodes.add( start);
            groundLevel.nodes.add( orangePathPoint);
            groundLevel.nodes.add( orangeGoal);
            groundLevel.nodes.add( BluePathPoint);
            groundLevel.nodes.add( BlueGoal);

            //OOH!!! we should be able to get the num people now!
                    System.out.println("# People in Building: "+Demo1.GetNumPeople());

          //This current way of connecting means it is only one way thus when the AI program does comparisons it will decrease the change of cycles occuring
            start.connect(orangePathPoint);
            start.connect(BluePathPoint);

            orangePathPoint.connect(orangeGoal);
            BluePathPoint.connect(BlueGoal);

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
            for(Person person :  Demo1.ListPeople()){
                System.out.print(person.name+" - "+ person.getAssignedRoute().RouteName);
            }




        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.exit(0);
    }

}
/*
*               Mini representation of how it looks in my head
*               KEY:
*                   'o' means it is a node in the Orange Route
*                   'b' means it is a node in the Blue Route
*                   'S' is our start location
*
*
*
*                       O (Goal)
*                       *
*                       * 4
*                       *
*               ####### O########
*               #       | 3     #
*               #       |       #  4
*               #       S-------B****B
*               #           4   #  (goal)
*               #               #
*               #               #
*               #################
*
*
*
*
*
* */