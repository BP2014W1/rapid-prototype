package de.uni_potsdam.hpi.bpt.bp2014.jengine;

import java.util.LinkedList;

/**
 * Created by jaspar.mang on 08.12.14.
 */
public class RunningService {
    ScenarioInstance scenarioInstance;

    public RunningService(ScenarioInstance scenarioInstance){
        this.scenarioInstance=scenarioInstance;
    }
    public LinkedList<Integer> getEnabledActivitiesIDs(){
        LinkedList<Integer> ids = new LinkedList<Integer>();
        for(ControlNodeInstance nodeInstance: scenarioInstance.enabledControlNodeInstances){
            if(nodeInstance instanceof ActivityInstance){
                ids.add(((ActivityInstance) nodeInstance).controlNode_id);
            }
        }

        return ids;
    }

    public void startActivity(int id){
        for(ControlNodeInstance nodeInstance: scenarioInstance.enabledControlNodeInstances) {
            if (((ActivityInstance) nodeInstance).controlNode_id == id) {
                ((ActivityInstance) nodeInstance).begin();
            }
        }
    }
}
