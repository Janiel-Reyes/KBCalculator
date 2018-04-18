
package hw7;

import java.util.ArrayList;
import java.util.LinkedList;

/**
* Janiel Reyes
* 111307845
* HW # 7
* Section 12
* Charles Chen
* Tim Zhang
*/
public class Actor {
    private String name;
    private ArrayList<Movie> movies;
    private ArrayList<Actor> friends;
    private boolean visited = false;
    private LinkedList<String> path;
    public Actor(String name){
        this.name = name;
        movies= new ArrayList<Movie>();
        friends= new ArrayList<Actor>();
    }
    /**
     * Returns the name of Actor
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of actor
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the movies arraylist
     * @return movies
     */
    /**
     * Gets movies arraylist
     * @return 
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    /**
     * Adds movies to the actors movie list
     * @param movie 
     */
    public void addMovies(Movie movie) {
        if(movies.contains(movie)==false){
            movies.add(movie);
        }
        else{
            System.out.println("Movie already added");
        }
    }
    /**
     * Gets friends arraylist
     * @return 
     */
    public ArrayList<Actor> getFriends() {
        return friends;
    }
    /**
     * Adds actors to friends list
     * @param friend 
     */
    public void addFriends(Actor friend) {
        if(friends.contains(friend) == false){
            friends.add(friend);
            System.out.println(friend.getName()+" was added to friends list of actor");
        }
        else 
            System.out.println("Friend already added");
    }
    /**
     * Returns isVisited 
     * @return 
     */
    public boolean isVisited() {
        return visited;
    }
    /**
     * Sets visited to true or false
     * @param visited 
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    /**
     * Returns path 
     * @return 
     */
    public LinkedList<String> getPath() {
        return path;
    }
    /**
     * Sets path 
     * @param path 
     */
    public void setPath(LinkedList<String> path) {
        this.path = path;
    }
   public void printFriends(){
       for(int i =0; i<friends.size();i++){
           System.out.println(friends.get(i).getName());
       }
   }
}
