package enumerationType;

public class Human {
    String firstname;
    String lastname;
    Color hairColor;
    Color eyeColor;

    public Human(String firstname, String lastname, Color hairColor, Color eyeColor) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public static void main(String[] args) {
        Human human = new Human("Basia", "Finn", Color.BLACK, Color.BLUE);
    }
}
