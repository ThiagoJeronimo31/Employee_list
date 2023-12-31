package entities;

public class Emplo {

private Integer id;
private String name;
private Double sal;

    public Emplo() {
    }


    public Emplo(Integer id, String name, Double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public void increaseSalary(double percentage){
        sal = sal + sal *(percentage/100);
    }

public String toString(){
    return id+", "+name+", "+sal;
}
}
