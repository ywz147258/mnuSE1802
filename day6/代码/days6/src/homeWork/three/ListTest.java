package homeWork.three;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Project> list = new ArrayList<>();
        list.add(new Project(1,"math",false));
        list.add(new Project(2,"english",true));
        for(Project p:list){
            System.out.println(p.getName());
        }
    }
}
