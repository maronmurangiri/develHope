package co.develhope.introduction;

public class WhileLoopExercise {
    public static void main(String[] args) {
        double exchangeRateEuroToPounds;
        int numberOfDays = 0;
        int poundsSoldPerDay = 1000;
        int totalPounds = 10000;


        while (totalPounds > 0) {

            //Random exchange rate
            exchangeRateEuroToPounds = 1 + (Math.random() * 0.2);

            if (exchangeRateEuroToPounds > 1.15) {

                //euros obtained
                double euros = exchangeRateEuroToPounds * totalPounds;

                //Deduct the sold pounds from the total pounds
                totalPounds -= poundsSoldPerDay;

            }
            // Increment the number of days
           numberOfDays++;
        }

        System.out.println("The trading bot took " + numberOfDays + " days to sell all its pounds");

    }
}
