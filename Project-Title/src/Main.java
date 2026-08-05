public class Main {
    public static void main(String[] args) {
        // --- 1. HARD-CODED STUDENT DETAILS & ATTENDANCE DATA ---
        // Attendance records for 10 working days: 1 = Present, 0 = Absent, any other
        // number = Invalid
        String learnerName = "akshata";

        int day1 = 1;
        int day2 = 1;
        int day3 = 0;
        int day4 = 1;
        int day5 = 1;
        int day6 = 2; // Invalid entry example (e.g., mistyped value)
        int day7 = 1;
        int day8 = 1;
        int day9 = 0;
        int day10 = 1;

        // --- 2. REQUIRED VARIABLES FOR TRACKING ---
        int totalDaysEvaluated = 10;
        int countPresent = 0;
        int countAbsent = 0;
        int countInvalid = 0;

        int currentDay = 1;

        // Target percentage rule
        double requiredPercentage = 75.0;

        // --- 3. PROCESSING ATTENDANCE USING A WHILE LOOP ---
        while (currentDay <= totalDaysEvaluated) {
            int attendanceStatus;

            // Select day's status based on current loop iteration
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

            // Validate attendance record
            if (attendanceStatus == 1) {
                countPresent++; // Unary increment operator
            } else if (attendanceStatus == 0) {
                countAbsent++; // Unary increment operator
            } else {
                countInvalid++; // Unary increment operator
            }

            currentDay++; // Unary increment to move to the next day
        }

        // --- 4. CALCULATIONS & DECIMAL DIVISION ---
        int validDays = countPresent + countAbsent;

        // Explicit type casting to double for precise decimal division
        double calculatedPercentage = (validDays > 0)
                ? ((double) countPresent / validDays) * 100
                : 0.0;

        // --- 5. EVALUATION USING TERNARY OPERATOR & CONDITIONAL LOGIC ---
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

        // --- 6. OUTPUT REPORT GENERATION ---
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