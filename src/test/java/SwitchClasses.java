public class SwitchClasses {
    public static void main(String[] args) {
        String env = "qa";

        switch (env){
            case "qa":
                System.out.println("Run in QA env");
                break;
            case "dev":
                System.out.println("Run in Dev env");
                break;
            case "stage":
                System.out.println("Run in stage env");
                break;
            case "uat":
                System.out.println("Run in uat");
                break;
            default:
                System.out.println("Please enter valid env name");
        }

        String carType = "abc";

        switch (carType){
            case "mini":
                System.out.println("mini booked");
                break;
            case "Sedan":
                System.out.println("Sedan booked");
                break;
            case "SUV":
                System.out.println("SUV booked");
                break;
            case "Premium":
                System.out.println("Premium booked");
                break;
            default:
                System.out.println("please select the right car type");
        }

        String browser = "firefox";

        switch (browser){
            case "chrome":
                System.out.println("Run in chrome browser");
                break;
            case "edge":
                System.out.println("Run in edge browser");
                break;
            case "safari":
                System.out.println("Run in safari browser");
                break;
            case "firefox":
                System.out.println("Run firefox uat");
                break;
            default:
                System.out.println("Please enter valid browser name");
        }


        String loan = "Housing";
        int salary = 5000;

        switch (loan){
            case "Car":
            if (salary < 35000){
                System.out.println("NOT APPLICABLE FOR Housing Loan");
            }
                System.out.println("Car loan approved");
                break;
            case "Housing":
                System.out.println("housing loan approved");
                break;
            case "Personal":
                System.out.println("personal loan approved");
                break;
            case "Education":
                System.out.println("educational loan approved");
                break;
            default:
                System.out.println("User not eligible for loan");
        }
        char vowels = 'a';

        switch (vowels){
            case 'a':
                System.out.println("The given char is a vowel");
                break;
            case 'e':
                System.out.println("The given char is e vowel");
                break;
            case 'i':
                System.out.println("The given char is i vowel");
                break;
            case 'o':
                System.out.println("The given char is o vowel");
                break;
            case 'u':
                System.out.println("The given char is u vowel");
                break;
            default:
                System.out.println("The given char is not a vowel");
        }

        String week = "monday";

        switch (week){
            case "monday":
                System.out.println("First day in week ");
                break;
            case "tuesday":
                System.out.println("second day in a week");
                break;
            case "wednesday":
                System.out.println("Third day in a week");
                break;
            case "thursday":
                System.out.println("fourth day in a week");
                break;
            case "friday":
                System.out.println("fifth day in a week");
                break;
            case "saturday":
                System.out.println("six day in a week");
        }
    }
}
