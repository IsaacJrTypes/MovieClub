/**
 * Description: inherits MovieClub and adds class specific yearly fee,
 * benefits and discount
 * */
class SeniorClub extends MovieClub {
    private double clubYearlyFee = 5.00;
    private String additionalBenefits = "Free child-sized popcorn & soda";
    private double discount = 0.50;
    private int freePassCount = -1;

    public SeniorClub(double ticketPrice) {
        super(ticketPrice);
    }

    public double getClubYearlyFee() {
        return this.clubYearlyFee;
    }
    @Override
    public String getBenefits() {
        return super.getBenefits() + ", " + this.additionalBenefits ;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getTicketPrice() {
        return super.getTicketPrice() * this.getDiscount();
    }

    public int getFreePassCount() {
        return this.freePassCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Yearly Fee: $" + this.getClubYearlyFee() + String.format(", Discount: %.2f%%", (this.getDiscount() * 100 )) + ", Free passes/month: " + this.getFreePassCount();
    }
}