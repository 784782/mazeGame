public class Map {
   private int heroRow = 8;
   private int heroCol = 1;
   private String[][] maze =
      {
        {"X","X","X","X","X","X","X","X","X","X"},
        {"X"," "," "," "," "," "," "," ","F","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X"," "," "," "," "," "," "," "," ","X"},
        {"X","P"," "," "," "," "," "," "," ","X"},
        {"X","X","X","X","X","X","X","X","X","X"}
     };
   public String[][] getMaze() {
      return maze;
   }
   public void movePlayer(String input) {
      if(input.equals("w") && maze[heroRow-1][heroCol].equals(" ")) {
         maze[heroRow][heroCol] = " ";
         maze[heroRow-1][heroCol] = "P";
         
      }
      else if(input.equals("a") && maze[heroRow][heroCol-1].equals(" ")) {
         maze[heroRow][heroCol] = " ";
         maze[heroRow][heroCol-1] = "P";
      }
      else if(input.equals("s") && maze[heroRow+1][heroCol].equals(" ")) {
         maze[heroRow][heroCol] = " ";
         maze[heroRow+1][heroCol] = "P";
      }
      else if(input.equals("d") && maze[heroRow][heroCol+1].equals(" ")) {
         maze[heroRow][heroCol] = " ";
         maze[heroRow][heroCol+1] = "P";
      }
      else if((input.equals("w") && maze[heroRow-1][heroCol].equals("F"))||
              (input.equals("a") && maze[heroRow][heroCol-1].equals("F"))||
              (input.equals("s") && maze[heroRow+1][heroCol].equals("F"))||
              (input.equals("d") && maze[heroRow][heroCol+1].equals("F"))) {
         System.out.println("You win");
      }
      else if((input.equals("w") && maze[heroRow-1][heroCol].equals("X"))||
              (input.equals("a") && maze[heroRow][heroCol-1].equals("X"))||
              (input.equals("s") && maze[heroRow+1][heroCol].equals("X"))||
              (input.equals("d") && maze[heroRow][heroCol+1].equals("X"))) {
         System.out.println("you try to run into the solid wall but it doesnt work");
      }
      else {
         System.out.println("thats not a valid input");
      }
   }
}