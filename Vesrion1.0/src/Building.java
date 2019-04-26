public class Building {
      private Floor [] levels;
      private Routes [] escapeRoutes;

      public int getNumPeople()
      {
          return 1;
      }

      public void AssignRoutes()
      {
            for (Floor f: levels) {
                  People [] peopleOnFloor = f.ListPeople();
                  for (Person p:People) {
                        //Assign a RANDOM route for now
                  }
            }
      }

      public Person [] ListPeople()
      {
          
            return null;
            
      }

}
