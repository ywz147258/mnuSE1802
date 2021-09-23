package homeWork.three;

public class Main {
    public static void main(String[] args) {
        //创建课程
        Project math= new Project(1,"math",false);
        Project english= new Project(2,"english",false);
        Project nature= new Project(3,"nature",false);
        //管理员设置课程是否开放
        Admin admin = new Admin();
        admin.setProject(math,true);
        admin.setProject(english,true);
        //学生选择多门课程
        Student ywz= new Student(1,"游文智");
        ywz.selectProject(math);
        ywz.selectProject(english);
        ywz.showProject();
    }
}
