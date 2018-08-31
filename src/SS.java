/**
 *
 * @Stanley
 * @since 180614
 * 
 * 
 */
/*
Assuming you're qualified, Social Security will evaluate your entire lifetime
earning record to determine your initial monthly benefit. Each year's earnings,
up to the Social Security taxable maximum, is indexed for inflation, and the
35 highest years are considered. If your work history has fewer than 35 years,
the missing years will be counted as zeros.

The top 35 inflation-indexed years are averaged together and divided by 12 to
produce your average indexed monthly earnings, or AIME. This average is then
applied to a formula to determine your primary insurance amount, or PIA, which
is your initial monthly benefit at full retirement age. For 2018, the formula
is:

    90% of the first $896
    32% of the amount greater than $896 but less than $5,399
    15% of the amount in excess of $5,399


*/


public class SS {

    public static void main(String[] args) {
        double[] earnedInPast = {12226,
            30950,
            49627,
            44536,
            36740,
            49417,
            58623,
            65040,
            54000,
            25200,
            77586,
            79082,
            86227,
            90874,
            97826,
            102672,
            110100,
            70620,
            117000,
            114308,
            71807,
            120838, // 2017
        120000, 120000,120000,120000,120000,120000,120000,120000,120000,120000,120000,120000
        
        
        
        };

        double total = 0;

        for (int i = 0; i < earnedInPast.length; i++) {
            total = earnedInPast[i] + total;
        }
        System.out.println("Total: " + total);
        
        double AIME = total/(35.0*12.0);
        System.out.println("AIME: " + AIME);
        // $3726.90
        // $7155.47 (12 * $120000) more
        
        //double PIA = 0.9*896.0 +0.32*(3726.90-896.0);
        double PIA = 0.9*896.0 + 0.32*(5399-896.0)+0.15*(7155.47-5399.0);
        
        System.out.println("PIA: " + PIA);
        // 1712.288
        // 2510.83
    }

}
// https://www.fool.com/retirement/2017/12/03/your-2018-guide-to-social-security-benefits.aspx
