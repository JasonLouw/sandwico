import java.util.Vector;

public class Building {
      private Vector<Floor> levels;
      private Vector<Routes> escapeRoutes;

      public Building(String n) {
      }

      public int getNumPeople()
      {
          return 1;
      }

      public void AssignRoutes()
      {
            for (Floor f: levels) {
                  Person [] peopleOnFloor = f.ListPeople();
                  for (Person p: peopleOnFloor) {
                        //Assign a RANDOM route for now
                  }
            }
      }

      public Vector<Person> ListPeople()
      {
          Vector<Person> temps = new Vector<>();
            return temps;
            
      }
      public void addFloor(Floor f){

      }

      public Floor getFloor(int i) {
            return levels.get(i);
      }

      public int GetNumPeople() {
            int i =0;
            for (Floor f:levels) {
                  i+= f.getNumPeople();
            }
            return i;
      }
}
