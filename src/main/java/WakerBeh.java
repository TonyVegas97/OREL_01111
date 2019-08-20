import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import java.util.Date;

public class WakerBeh extends WakerBehaviour {

    public WakerBeh(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        super.onWake();
        System.out.println("OK here we go againCC    "+ getBehaviourName());
    }
}
