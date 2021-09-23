package BCollection.BSet;

public class Person{

    private Integer score;
    private String name;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person( String name,Integer score) {
        this.score = score;
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return name.hashCode()+score.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Person p= (Person) obj;
//        return name.equals(p.name)&&score.equals(p.score);
//    }
}
