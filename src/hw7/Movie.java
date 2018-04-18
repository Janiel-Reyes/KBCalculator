
package hw7;

import java.util.ArrayList;

/**
* Janiel Reyes
* 111307845
* HW # 7
* Section 12
* Charles Chen
* Tim Zhang
*/
import big.data.DataSource;
public class Movie {
    private String title;
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private int year;
    public Movie(String name){
        do{
                        //generate the webaddress for the movie
                        String prefix= "http://www.omdbapi.com/?t=";

                       title=name;

                        String postfix="&y=&plot=short&r=xml";

                        if(title.length()>0){

                                DataSource ds = DataSource.connectXML(prefix+title.replace(' ','+')+postfix);

                                ds.load();

                                this.title = ds.fetchString("movie/title");
                                String[] splitArray = ds.fetchString("movie/actors").split(",");
                                for(int i = 0; i<splitArray.length;i++){
                                    actors.add(new Actor(splitArray[i]));
                                }
                               this.year = ds.fetchInt("movie/year");
                               title= "";
                        }

            } while(title.length()>0);
                System.out.println("done.");
        }
    /**
     * Returns title of movie
     * @return 
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the title of the movie
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Returns actors in the movie/ actors arraylist
     * @return 
     */
    public ArrayList<Actor> getActors() {
        return actors;
    }
    /**
     * 
     * @param actors 
     */
    public void addActors(Actor actor){
        if(actors.contains(actor)==false ){
            actors.add(actor);
        }
        else{
            System.out.println("Actor already added");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printActors(){
        for(int i = 0; i<actors.size();i++){
            System.out.println(actors.get(i).getName());
        }
    }
    public void printMovie(){
        System.out.println(title+" "+year+" Starring: ");
        for(int i = 0; i<actors.size();i++)
            System.out.println(actors.get(i));
    }
}
