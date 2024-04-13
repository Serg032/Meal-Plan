package BasalMetabolismMultipliedByActivity;

import BasalMetabolism.ActivityIndex.ActivityIndex;
import BasalMetabolism.BasalMetabolism;

public class BasalMetabolismMultipliedByActivity {
    private float basalMetabolismMultipliedByActivity;
    private ActivityIndex activityIndex;

    public BasalMetabolismMultipliedByActivity(BasalMetabolism basalMetabolism){
        this.activityIndex = new ActivityIndex();
        this.calculateValue(basalMetabolism, activityIndex);
    }

    public float getBasalMetabolismMultipliedByActivity() {
        return basalMetabolismMultipliedByActivity;
    }

    public void setBasalMetabolismMultipliedByActivity(float basalMetabolismMultipliedByActivity) {
        this.basalMetabolismMultipliedByActivity = basalMetabolismMultipliedByActivity;
    }

    private void calculateValue(BasalMetabolism basalMetabolism, ActivityIndex activityIndex){

        this.setBasalMetabolismMultipliedByActivity(basalMetabolism.getBasalMetabolism() * activityIndex.getIndex());
    }
}
