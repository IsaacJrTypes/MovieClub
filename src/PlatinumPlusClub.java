/**
 * Description: inherits MovieClub and adds class specific yearly fee,
 * benefits and discount
 * */
class PlatinumPlusClub extends PlatinumClub {
    private double additionalClubFee = 10.00;
    private int additionalFreePassCount = 2;
    public PlatinumPlusClub(double ticketPrice) {
        super(ticketPrice);
    }
    @Override
    public double getClubYearlyFee() {
        return super.getClubYearlyFee() + this.additionalClubFee;
    }
    @Override
    public int getFreePassCount() {
        return super.getFreePassCount() + additionalFreePassCount;
    }
    @Override
    public String toString() {
        return this.getClass() + ", Ticket Price: " + super.getTicketPrice() + ", Club Benefits: " + super.getBenefits() + String.format(", Yearly Fee: $%.2f", (this.getClubYearlyFee() )) + String.format(", Discount: %.2f%%", (super.getDiscount() * 100 )) + ", Free passes/month: " + this.getFreePassCount() ;
    }
}