import java.util.Scanner;

public class TimeToWords {
    private static final String[] numbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty"
    };


    // to chcek wether the time is correct or not
    // if correct continue

    public static String checkTime(String time){
        try {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            if (hours > 24 || hours < 0 || minutes > 59 || minutes < 0) {
                return "Invalid time";
            }

            return convertTimeToWords(hours, minutes);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return "Invalid time format. Please enter time in HH:mm format.";
        }
    }

    // conver time to words 

    public static String convertTimeToWords(int hours,int minutes) {
                if(hours==12 && minutes==00)
            return "It's Midday";
        else if(hours==00 && minutes==00)
            return "It's Midnight";
        
        String hourWords = convertNumberToWords(hours);
        String minuteWords = convertNumberToWords(minutes);
        

        return "It's " + hourWords + " " + (minutes != 0 ? minuteWords : "") + (minutes != 1 ? "s" : "");
    }

    // conver time in number to words

    private static String convertNumberToWords(int number) {
        if (number < 20) {
            return numbers[number];
        } else {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            return tens[tensDigit] + (onesDigit != 0 ? " " + numbers[onesDigit] : "");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String time = sc.nextLine();
        sc.close();
        String words = checkTime(time);
        System.out.println(words);
    }
}