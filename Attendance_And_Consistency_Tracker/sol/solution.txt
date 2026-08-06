public class Main {
    public static void main(String[] args) {

        int day1 = 1;
        int day2 = 1;
        int day3 = 0;
        int day4 = 1;
        int day5 = 1;
        int day6 = 2;
        int day7 = 1;
        int day8 = 0;
        int day9 = 1;
        int day10 = 1;

        int presentDays = 0;
        int absentDays = 0;
        int invalidEntries = 0;

        int currentDay = 1;

        while (currentDay <= 10) {
            int attendanceValue = 0;

            if (currentDay == 1) {
                attendanceValue = day1;
            } else if (currentDay == 2) {
                attendanceValue = day2;
            } else if (currentDay == 3) {
                attendanceValue = day3;
            } else if (currentDay == 4) {
                attendanceValue = day4;
            } else if (currentDay == 5) {
                attendanceValue = day5;
            } else if (currentDay == 6) {
                attendanceValue = day6;
            } else if (currentDay == 7) {
                attendanceValue = day7;
            } else if (currentDay == 8) {
                attendanceValue = day8;
            } else if (currentDay == 9) {
                attendanceValue = day9;
            } else if (currentDay == 10) {
                attendanceValue = day10;
            }

            if (attendanceValue == 1) {
                presentDays++;
            } else if (attendanceValue == 0) {
                absentDays++;
            } else {
                invalidEntries++;
            }

            currentDay++;
        }

        int validWorkingDays = presentDays + absentDays;

        double attendancePercentage = (validWorkingDays > 0)
                ? ((double) presentDays / validWorkingDays) * 100
                : 0.0;

        String eligibilityStatus = (attendancePercentage >= 75.0) ? "ELIGIBLE" : "NOT ELIGIBLE";

        String consistencyStatus = (attendancePercentage >= 85.0)
                ? "Excellent Consistency"
                : (attendancePercentage >= 75.0)
                        ? "Good Attendance"
                        : "Needs Improvement";

        System.out.println("ATTENDANCE REPORT\n");
        System.out.println("Total Working Days: " + validWorkingDays);
        System.out.println("Present Days: " + presentDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.println("Invalid Entries: " + invalidEntries);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println();
        System.out.println("Required Attendance: 75.0%");
        System.out.println("Eligibility Status: " + eligibilityStatus);
        System.out.println("Consistency Status: " + consistencyStatus);
    }
}