import netscape.javascript.JSObject;

import java.util.Vector;

public class Main implements Runnable {

    Server myserver;
    @Override
    public void run() {
        myserver.start();
    }
    public Main(Server s) {
        myserver = s;
    }

    public static void main(String[] args){
        try
        {

            //##############################
            //#         HTTP Server        #
            //##############################
            Thread thread = new Thread(new HTTPServer());
            thread.start();



            //##############################
            //#            RTFE            #
            //##############################
            Thread thread1 = new Thread( new RTFEServer());
            thread1.start();

            Node start1 = new Node(1);
            Node start2 = new Node(1);
            Node share = new Node(1);
            Node end1 = new Node(1);
            Node end2 = new Node(1);
            start1.connect(share, 1);
            start2.connect(share, 2);
            share.connect(end1, 3);
            share.connect(end2, 4);

            Routes route1 = new Routes("route1");
            route1.addNode(start1);
            route1.addNode(share);
            route1.addNode(end1);
            Routes route2 = new Routes("route2");
            route2.addNode(start2);
            route2.addNode(share);
            route2.addNode(end2);

            System.out.println(route1. distanceToGoal(start1));
            System.out.println(route2. distanceToGoal(start2));

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
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