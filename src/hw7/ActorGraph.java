/**
* Janiel Reyes
* 111307845
* HW # 7 
* Section 12
* Charles Chen
* Tim Zhang
*/
package hw7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ActorGraph {
    private static Queue<Actor> queue; 
    private static HashMap<String, Actor> actorsByName;
    private static HashMap<String, Movie> moviesByTitle;
    public ActorGraph(){
        actorsByName = new HashMap<String, Actor>();
        moviesByTitle = new HashMap<String, Movie>();
    }
    public LinkedList<String> bfs(String name){
        for(Actor a : actorsByName.values()){
            a.setVisited(false);
            a.setPath(new LinkedList<String>());
        }
        queue =  new LinkedList<Actor>();
        LinkedList<String> bigPath = new LinkedList<String>();
        Actor root = actorsByName.get(name);
        queue.add(root);
        root.setVisited(true);
         while(!queue.isEmpty()){
             
             Actor element = queue.remove();
             bigPath.add(element.getName());
             for(int i = 0; i< element.getFriends().size(); i++){
                 
                 if(element.isVisited() == false){
                    element.setPath((LinkedList<String>) element.getPath().clone());
                    element.getFriends().get(i).setVisited(true);
                    queue.add(element.getFriends().get(i));
                 }               
             }
             
         }
    return bigPath;
    }

    public  HashMap<String, Actor> getActorsByName() {
        return actorsByName;
    }
    public void lookUpActor(String name){
        Actor temp = actorsByName.get(name);
        System.out.println("Actor: "+temp.getName()+"Friends: ");
        temp.printFriends();
    }
    public  void addActorsByName(Actor name) {
        actorsByName.put(name.getName(), name);
    }

    public  HashMap<String, Movie> getMoviesByTitle() {
        return moviesByTitle;
    }

    public  void addMoviesByTitle(Movie movie) {
        moviesByTitle.put(movie.getTitle(), movie);
    }
    public void printActors(){
        for(String actor: actorsByName.keySet()){
            System.out.println(actor);
        }
    }
    public void printMovies(){
        for(String movie: moviesByTitle.keySet()){
            System.out.println(movie);
        }
    }
}
