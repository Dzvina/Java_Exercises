package ParametersAndReturn;

public class Mystery_10 {

    public static void main(String[] args) {

        String scarlett = "mustard";
        String suspect = "peacock";
        String lounge = "ballroom";
        String pipe = "study";
        String dagger = "pipe";
        String weapon = "dagger";
        clue(weapon, suspect, pipe);
        clue(scarlett, pipe, suspect);
        dagger = clue(dagger, "lounge", scarlett);
        clue(dagger, lounge, "dagger");
    }

    public static String clue(String suspect, String room, String weapon) {
        System.out.println(room + " in the " + weapon + " with the " + suspect);
        return room;
    }
}
