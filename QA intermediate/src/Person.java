public class Person {

    private String name;
    private String jobTitle;
    private int age;


    public Person(String name, String jobTitle, int age){

        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name: " + this.name + "\n" + "Person jobtitle: " + this.jobTitle + "\n"
                + "Person Age: "  + this.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

}
