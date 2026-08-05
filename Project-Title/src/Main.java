public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
        String learnerName = "akshata";

        int day1 = 1;
        int day2 = 1;
        int day3 = 0;
        int day4 = 1;
        int day5 = 1;
<<<<<<< HEAD
        int day6 = 2;
=======
        int day6 = 2; 
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
        int day7 = 1;
        int day8 = 1;
        int day9 = 0;
        int day10 = 1;

<<<<<<< HEAD
=======
        
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
        int totalDaysEvaluated = 10;
        int countPresent = 0;
        int countAbsent = 0;
        int countInvalid = 0;

        int currentDay = 1;

<<<<<<< HEAD
        double requiredPercentage = 75.0;

        while (currentDay <= totalDaysEvaluated) {
            int attendanceStatus;

=======
    
        double requiredPercentage = 75.0;

        
        while (currentDay <= totalDaysEvaluated) {
            int attendanceStatus;

            
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
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

<<<<<<< HEAD
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

=======
    
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

        
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
        double calculatedPercentage = (validDays > 0)
                ? ((double) countPresent / validDays) * 100
                : 0.0;

<<<<<<< HEAD
=======
        
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
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

<<<<<<< HEAD
        System.out.println("==================================================");
        System.out.println("               ATTENDANCE REPORT                  ");
        System.out.println("==================================================");
=======
        
        
>>>>>>> f014ebd7ca51ca685a4212186e186502d0c70e15
        System.out.println("Learner Name             : " + learnerName);
        System.out.println("Total Working Days       : " + totalDaysEvaluated);
        System.out.println("Valid Days Processed     : " + validDays);
        System.out.println("Present Days             : " + countPresent);
        System.out.println("Absent Days              : " + countAbsent);
        System.out.println("Invalid Entries Ignored  : " + countInvalid);

        System.out.printf("Attendance Percentage    : %.2f%%\n", calculatedPercentage);
        System.out.printf("Required Attendance      : %.1f%%\n", requiredPercentage);
    
        System.out.println("Eligibility Status       : " + eligibilityStatus);
        System.out.println("Consistency Status       : " + consistencyMessage);
        
    }
}
