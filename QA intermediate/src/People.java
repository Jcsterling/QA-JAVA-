import java.util.ArrayList;

public class People {

    public static void main(String[] args) {


// 'a' is an object of person
        Person a = new Person("jim", "banker", 7);
        Person b = new Person("jimBob", "accountant", 13);
        Person c = new Person("jimBobMurphy", "circusGuy", 47);

        ArrayList<Person> people = new ArrayList<>();

        people.add(a);
        people.add(b);
        people.add(c);

 //************************************************************************************************************************


//this is the search function in which you can search for a person by their name
        System.out.println(searchPerson("jimBob",people).toString()); // "jimBob" and people correspond to values that need to be compared to each other. if they match,the program will return the person along with their details

//this will print out everyone on file, uncomment the system.out.println to make work
        for (Person p : people) {
            //System.out.println(p.toString());

//*********************************************************************************************************************************
        }
    }





        public static Person searchPerson(String name, ArrayList<Person> people){

        // look at a list of person

            //iterate through
        for (Person p: people) {

            // when name matches list.name.name
            if (p.getName().equals(name)) { // because string is not primative, have to use .equals() as opposed to ==

                return p;// return person
            }
        }return null;



    }


}
