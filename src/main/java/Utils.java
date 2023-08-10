public class Utils {

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
