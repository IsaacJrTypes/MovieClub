/**
 * Description: inherits MovieClub and adds class specific yearly fee,
 * benefits and discount
 * */
class GoldClub extends MovieClub {
    private double clubYearlyFee = 15.00;
    private String additionalBenefits = "Free soda refill";
    private double discount = 0.90;
    private int FreePassCount = -1;

    public GoldClub(double ticketPrice){
        super(ticketPrice);
    }

    public double getClubYearlyFee() {
        return this.clubYearlyFee;
    }

    public String getBenefits() {
        return super.getBenefits() + ", " + this.additionalBenefits;
    }

    public double getTicketPrice() {
        return super.getTicketPrice() * this.getDiscount();
    }

    public double getDiscount() {
        return this.discount;
    }

    public int getFreePassCount() {
        return this.FreePassCount;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(", Yearly Fee: $%.2f", (this.getClubYearlyFee() )) + String.format(", Discount: %.2f%%", (this.getDiscount() * 100 )) + ", Free passes/month: " + this.getFreePassCount();
    }

}