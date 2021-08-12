public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (Secret str : Secret.values()) {
            if (str.toString().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

