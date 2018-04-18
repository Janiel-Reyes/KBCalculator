package hw7;
/**
* Janiel Reyes
* 111307845
* HW # 7 
* Section 12
* Charles Chen
* Tim Zhang
*/
import java.util.LinkedList;
import java.util.Scanner;
public class KBCalculator {
    
    public static void main(String[] args) {
        // TODO code application logic here
         boolean run = true;
         Movie movie = null;
         ActorGraph graph = new ActorGraph();
         Scanner sc = new Scanner(System.in);
         String input;
         while(run){
           System.out.println("Welcome to the Kevin Bacon Calculator \n" +
               "I)Import a Movie\n" + 
               "A)Print all actors\n" +
               "M)Print all movies\n"+
               "P)Print the shortest path between two actors\n"+
               "B)Print the BFS from a given actor\n"+
               "L) Lookup Actor By Name \n"
                   + "Q) Quit.\n");
           input=sc.nextLine();
           
           if(input.equalsIgnoreCase("I")){
                       System.out.println("Enter the movie title: ");
                       input= sc.nextLine();
                       try{
                       movie = new Movie(input);
                       }
                       catch(Exception e){
                           System.out.println(e.getMessage());
                       }
                       graph.addMoviesByTitle(movie);
                       for(int i = 0; i< movie.getActors().size();i++)
                           graph.addActorsByName(movie.getActors().get(i));
                       
           }             
           else if(input.equalsIgnoreCase("A")){           
                   graph.printActors();
           }
           

           else if(input.equalsIgnoreCase("M")){
                    graph.printMovies();
               }
               
            
           else if(input.equalsIgnoreCase("P")){
                    System.out.println("Enter a Starting Actor: ");
                   input = sc.nextLine();
                   System.out.println("Enter Second Actor: ");
                   String input2 =sc.nextLine();
                   
            
           }
               
           
           else if(input.equalsIgnoreCase("B")){
                   System.out.println("Enter a Starting Actor: ");
                   input = sc.nextLine();
                   LinkedList<String> temp =graph.bfs(input);
                   System.out.println(temp.toString());
           }
           
           
           else if(input.equalsIgnoreCase("L")){     
               System.out.println("Enter a  Actor: ");
               input= sc.nextLine();
               graph.lookUpActor(input);
               
           }
           
          
           else if(input.equalsIgnoreCase("Q")){
               System.out.println("Goodbye");  
               run =false;
               System.exit(0);
           
    }
    
}
    
    
    }
}
