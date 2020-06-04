package com.chiru.camunda.procescomunication;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class StartSubprocessMessageTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String processName = (String)execution.getVariable("processName");

        if(null!= processName && !processName.isBlank()){
            execution.getProcessEngineServices().getRuntimeService()
            .createMessageCorrelation(processName).processInstanceBusinessKey(execution.getBusinessKey()).correlate();
        }else{
            throw new BpmnError("SubProcessError");
        }
    }
    
}