package de.uni_potsdam.hpi.bpt.bp2014.jengine;

/**
 * Created by jaspar.mang on 24.11.14.
 */
public class TaskOutgoingControlFlowBehavior extends OutgoingBehavior{

    public TaskOutgoingControlFlowBehavior(int activity_id, ScenarioInstance scenarioInstance){
        this.controlNode_id = activity_id;
        this.scenarioInstance = scenarioInstance;
    }
}
