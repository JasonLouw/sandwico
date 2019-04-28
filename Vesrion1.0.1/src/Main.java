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