import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class TickerBeh extends TickerBehaviour {

    public TickerBeh(Agent a, long period) {
        super(a, period);
    }

    protected void onTick() {
        System.out.println("qwertyuiop[[poiuytrewq "+getBehaviourName());
    }
   public void stop(){
       System.out.println("tyqweqweiqwioiosdl;as;s;");
   }
}
