public class Lab2Q3 {
    public static void main(String[] args) { 
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        System.out.print("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
