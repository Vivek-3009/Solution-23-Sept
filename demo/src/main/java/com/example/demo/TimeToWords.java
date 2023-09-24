package com.example.demo;

public class TimeToWords {

    // array for fetching words
    private static final String[] numbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty"
    };


    // to chcek wether the time is correct or not
    // if correct continue

    public String checkTime(String time){
        try {

            // chceking for format
            
            if (!time.matches("\\d{2}:\\d{2}")) {
                return "Invalid time format. Please enter time in HH:MM format.";
            }

            //split the String from : int parts

            String[] part = time.split(":");
            int hours = Integer.parseInt(part[0]);
            int minutes = Integer.parseInt(part[1]);

            //check valid time

            if (hours > 24 || hours < 0 || minutes > 59 || minutes < 0) {
                return "Invalid time";
            }
            return convertTimeToWords(hours, minutes);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return "Invalid time format. Please enter time in HH:mm format.";
        }
    }

    // conver time to words 

    public  String convertTimeToWords(int hours,int minutes) {
                if(hours==12 && minutes==00)
            return "It's Midday";
        else if(hours==00 && minutes==00)
            return "It's Midnight";
        
        String hourWords = convertNumberToWords(hours);
        String minuteWords = convertNumberToWords(minutes);
        

        return "It's " + hourWords + " " + (minutes != 0 ? minuteWords : "");
    }

    // conver time in number to words

    public static String convertNumberToWords(int number) {
        if (number < 20) {
            return numbers[number];
        } else {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            return tens[tensDigit] + (onesDigit != 0 ? " " + numbers[onesDigit] : "");
        }
    }

}
