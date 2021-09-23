package homeWork.three;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    private Integer number;
    private String name;
    private List<Project> pList=new ArrayList();

    public void selectProject(Project project){
        if(project.isOpen()==false){
            System.out.println(project.getName()+"课程未开放");
        }else{
            pList.add(project);
        }
    }
    public void showProject(){
        for(Project p:pList){
            System.out.println(this.name+"选择了"+p.getName());
        }
    }
}
