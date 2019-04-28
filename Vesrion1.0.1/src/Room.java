import java.util.Vector;

public class Room {
    private Vector<Door> doors = new Vector<Door>();
    private Vector<Person> peopleInRoom = new Vector<>();
    private double [] [] coordinates;
    public Room(double [] [] array)
    {
        coordinates = new double[3][2];
        for(int i = 0; i < 3; i++)
        {
            coordinates[i][0] = array[i][0];
            coordinates[i][1] = array[i][1];
        }
    }

}
