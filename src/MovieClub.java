/**
 * Description: MovieClub creates ticket prices and benefits that
 * will be inherited by subclasses.
 */
abstract class MovieClub {
    private double ticketPrice;
    private String benefits = "Online ticketing";

    public MovieClub(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public String getBenefits() {
        return this.benefits;
    }

    @Override
    public  String toString(){
        return this.getClass() + ", Ticket Price: " + this.getTicketPrice() + ", Club Benefits: " + this.getBenefits();
    }
}