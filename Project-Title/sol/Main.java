public class Main {
    public static void main(String[] args) {

        String learnerName = "akshata";

        int day1 = 1;
        int day2 = 1;
        int day3 = 0;
        int day4 = 1;
        int day5 = 1;
        int day6 = 2;
        int day7 = 1;
        int day8 = 1;
        int day9 = 0;
        int day10 = 1;

        int totalDaysEvaluated = 10;
        int countPresent = 0;
        int countAbsent = 0;
        int countInvalid = 0;

        int currentDay = 1;

        double requiredPercentage = 75.0;

        while (currentDay <= totalDaysEvaluated) {
            int attendanceStatus;

            if (currentDay == 1)
                attendanceStatus = day1;
            else if (currentDay == 2)
                attendanceStatus = day2;
            else if (currentDay == 3)
                attendanceStatus = day3;
            else if (currentDay == 4)
                attendanceStatus = day4;
            else if (currentDay == 5)
                attendanceStatus = day5;
            else if (currentDay == 6)
                attendanceStatus = day6;
            else if (currentDay == 7)
                attendanceStatus = day7;
            else if (currentDay == 8)
                attendanceStatus = day8;
            else if (currentDay == 9)
                attendanceStatus = day9;
            else
                attendanceStatus = day10;

            if (attendanceStatus == 1) {
                countPresent++;
            } else if (attendanceStatus == 0) {
                countAbsent++;
            } else {
                countInvalid++;
            }

            currentDay++;
        }

        int validDays = countPresent + countAbsent;

        double calculatedPercentage = (validDays > 0)
                ? ((double) countPresent / validDays) * 100
                : 0.0;

        boolean isEligible = calculatedPercentage >= requiredPercentage;
        String eligibilityStatus = isEligible ? "ELIGIBLE" : "NOT ELIGIBLE";

        String consistencyMessage;
        if (calculatedPercentage >= 90.0) {
            consistencyMessage = "Excellent Consistency";
        } else if (calculatedPercentage >= 75.0) {
            consistencyMessage = "Good Attendance";
        } else if (calculatedPercentage >= 60.0) {
            consistencyMessage = "Needs Improvement";
        } else {
            consistencyMessage = "Critical Attendance Warning";
        }

        System.out.println("==================================================");
        System.out.println("               ATTENDANCE REPORT                  ");
        System.out.println("==================================================");
        System.out.println("Learner Name             : " + learnerName);
        System.out.println("Total Working Days       : " + totalDaysEvaluated);
        System.out.println("Valid Days Processed     : " + validDays);
        System.out.println("Present Days             : " + countPresent);
        System.out.println("Absent Days              : " + countAbsent);
        System.out.println("Invalid Entries Ignored  : " + countInvalid);
        System.out.println("--------------------------------------------------");
        System.out.printf("Attendance Percentage    : %.2f%%\n", calculatedPercentage);
        System.out.printf("Required Attendance      : %.1f%%\n", requiredPercentage);
        System.out.println("--------------------------------------------------");
        System.out.println("Eligibility Status       : " + eligibilityStatus);
        System.out.println("Consistency Status       : " + consistencyMessage);
        System.out.println("==================================================");
    }
}
