public class Main {
    public static void main(String[] args) {
        int i = 0;
        for (String argument : args) {
            if (argument.equals("exit")) {
                break;
            } else if (argument.equals("skip")) {
                continue;
            } else if (argument.equals("echo")) {
                while (i < 2) {
                    System.out.println("echo");
                    i++;
                }
            } else {
                System.out.println(argument);
            }
        }
    }
}
