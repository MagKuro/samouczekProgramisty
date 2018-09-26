package equalsAndHashCode;

public class Human {

    public static void main(String[] args) {
        Human human = new Human("Basia","Kloc", 1234);
        Human human2 = new Human("Basia","Kloc", 1234);
        Human human3 = new Human("Basia","Kloc", 1294);

        System.out.println(human.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());
    }

    String firstname;
    String lastname;
    int pesel;

    public Human(String firstname, String lastname, int pesel){
        this.firstname = firstname;
        this.lastname = lastname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Human){
            Human otherHuman = (Human) obj;
            return pesel == otherHuman.pesel;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 13*firstname.hashCode()+5*lastname.hashCode()+pesel;
    }
}
