package autolab.assignment3;

import rutgers.cs.IO;

public class DonateToPaws {

    public static double donationFee (double donationAmount){

        //NOTE: two and three percent is NOT included because donation amount changes before such values would be used
        double onePercentDonation = 0.01 * donationAmount;
        double fourPercentDonation = 0.04 * donationAmount;

        //Static Values for donations above 15000
        double feeFirst15K = 150;
        double feeNext4K = 80;

        if ( donationAmount <= 150){
            return 3;
        } else if ( donationAmount < 1500 ){
            if ( fourPercentDonation > 8 ){
                return fourPercentDonation;
            } else {
                return 8;
            }
        } else if ( donationAmount <= 15000 ) {
            if ( onePercentDonation > 20 ){
                return onePercentDonation;
            } else {
                return 20;
            }
        } else {
            donationAmount -= 15000;
            if ( donationAmount <= 4000 ){
                return feeFirst15K + 0.02 * donationAmount;
            } else {
                donationAmount -= 4000;
                return feeFirst15K + feeNext4K + 0.03 * donationAmount;
            }
        }

    }

}
