package BMap;

public class Person implements Comparable<Person>{
    private String name;
    private Integer score;

    public Person(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        if(score<o.score){
            return 1;
        }else if(score==o.score){
            return name.compareTo(o.name);
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
