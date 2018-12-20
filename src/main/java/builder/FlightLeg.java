package builder;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed = false;
    private double price;

    public FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;

    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public double getPrice() {
        return price;
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed = false;
        private double price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder delayed(boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder price(double price) {
            this.price = price;
            return this;
        }

        public FlightLeg flightLeg() {

            if(this.price==0){
                throw new IllegalStateException("podaj cene");
            }

            return new FlightLeg(this);
        }

    }

    @Override
    public String toString() {
        return "FlightLeg{" + "from='" + from + '\'' + ", to='" + to + '\'' + ", delayed=" + delayed + ", price=" + price + '}';
    }
}
