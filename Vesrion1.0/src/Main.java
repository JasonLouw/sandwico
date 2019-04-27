public class Main {

    public static void main(String[] args) {
        try
        {
            Building Demo1 = new Building("CS_Department");

            Demo1.addFloor(new Floor("groundLevel"));

            Floor groundlevel = Demo1.getFloor(0);
            Nodes start = new Nodes("normal",1,null);
            start.add(new Person("JohnDoe");

            Nodes orangePathPoint = new Nodes("normal",1,4)
            Nodes orangeGoal = new Nodes("goal",1,0)

            Nodes BluePathPoint = new Nodes("normal",1,4)
            Nodes BlueGoal = new Nodes("goal",1,0)

          //This will add all the nodes to the building but we have no way of moving between them yet so dont forget to connect them to each other
            groundLevel.nodes.push( start)
            groundLevel.nodes.push( orangePathPoint)
            groundLevel.nodes.push( orangeGoal)
            groundLevel.nodes.push( BluePathPoint)
            groundLevel.nodes.push( BlueGoal)

            //OOH!!! we should be able to get the num people now!
                    System.out.println("# People in Building: "+Demo1.GetNumPeople())

          //This current way of connecting means it is only one way thus when the AI program does comparisons it will decrease the change of cycles occuring
            start.connect(orangePathPoint)
            start.connect(BluePathPoint)

            orangePathPoint.connect(orangeGoal)
            BluePathPoint.connect(BlueGoal)

            //We have to add it to the route cant just have descriptive names XD
            Route blue = new Route("Blue")
            Route orange = new Route("Orange")
            blue.addNode(BluePathPoint)
            blue.addNode(BlueGoal)
            orange.addNode(orangePathPoint)
            orange.addNode(orangeGoal)



            Building.AssignRoutes()



            //Some testing
            System.out.printlm("People and assigned Routes")
            System.out.printlm("--------------------------")
            for(Person Building.ListPeople() : person){
                System.out.print(person.name+" - "+ person.getAssignRoute().RouteName)
            }




        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());;
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