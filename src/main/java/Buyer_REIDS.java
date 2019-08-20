import jade.core.Agent;

public class Buyer_REIDS extends Agent {
    private double energy;
    private double price;

    @Override
    protected void setup() {
        super.setup();
        System.out.println("Hello! Buyer-agent   " + getAID().getLocalName()+ "    is ready") ;
        addBehaviour(new TestBeh());
        addBehaviour(new TickerBeh(this,1000));
        addBehaviour(new WakerBeh(this,1500));
    }
}
