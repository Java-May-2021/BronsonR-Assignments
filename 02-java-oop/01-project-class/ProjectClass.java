import java.util.ArrayList;

public class ProjectClass {
    private String projName;
    private String descript;
    private int projNum;

    public void project(){
        System.out.println("Lets look at some projects");
    }

    public void project(String name){
        projName = name;
        System.out.println(name);
    }

    public void project(String name, String description){
        projName = name;
        descript = description;
        System.out.println(name + " : " + description);
    }

    public void initialCost(double money){
        System.out.println(projName + " " + money + " million " + " : " + descript);
    }

}