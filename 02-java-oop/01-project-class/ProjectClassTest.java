public class ProjectClassTest {
    public static void main(String[] args) {
        ProjectClass elevatorPitch = new ProjectClass();

        elevatorPitch.project();
        elevatorPitch.project("Lobby Design");
        elevatorPitch.project("Lobby Deisgn", "Creating an open, natural lighting concept to improve client mood and alleviate stress");
        elevatorPitch.initialCost(15.2);
    }
}
