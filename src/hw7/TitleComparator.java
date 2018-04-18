/**
* Janiel Reyes
* 111307845
* HW # 7 
* Section 12
* Charles Chen
* Tim Zhang
*/
package hw7;

import java.util.Comparator;

public class TitleComparator implements Comparator<Movie> {
        public int compare(Movie movie1, Movie movie2){
        String name1 = movie1.getTitle();
        String name2 = movie2.getTitle();
        return name1.compareTo(name2);
    }
}
