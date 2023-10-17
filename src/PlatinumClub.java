/**
 * Description: inherits MovieClub and adds class specific yearly fee,
 * benefits and discount
 * */
class PlatinumClub extends MovieClub {
    private double clubYearlyFee = 30.00;
    private String additionalBenefits = "Free soda and popcorn refill, Buddy passes";
    double discount = 0.80;
    private int FreePassCount = 1;

    public PlatinumClub(double ticketPrice) {
        super(ticketPrice);
    }

    public double getClubYearlyFee() {
        return this.clubYearlyFee;
    }
    @Override
    public String getBenefits() {
        return super.getBenefits() + ", " + this.additionalBenefits ;
    }
    @Override
    public double getTicketPrice() {
        return super.getTicketPrice() * this.discount;
    }

    public double getDiscount() {
        return this.discount;
    }

    public int getFreePassCount() {
        return this.FreePassCount;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(", Yearly Fee: $%.2f", (this.getClubYearlyFee() )) + String.format(", Discount: %.2f%%", (this.getDiscount() * 100 )) + ", Free passes/month: " + this.FreePassCount;
    }
}