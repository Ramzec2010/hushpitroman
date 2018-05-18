public class Ex13_Time_in_days {
    public static void main(String[] args) {
        int days = 1;
        TimeInDays(days);
    }
    static void TimeInDays (int days) {
        System.out.println("Number of hours in days: " + days*24);
        System.out.println("Number of minutes in days: " + days*24*60);
        System.out.println("Number of seconds in days: " + days*24*60*60);
    }
}
