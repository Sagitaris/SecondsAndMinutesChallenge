public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(15, 59));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Seconds (" + seconds +   ") should be >= 0";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Minutes (" + minutes +   ") should be >= 0";
        }

        if (seconds < 0 || seconds > 59){
            return "Seconds (" + seconds +   ") >= 0 and <= 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}
