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

public class NameComparator implements Comparator<Actor> {
    public int compare(Actor actor1, Actor actor2){
        String name1 = actor1.getName();
        String name2 = actor2.getName();
        return name1.compareTo(name2);
    }
}
