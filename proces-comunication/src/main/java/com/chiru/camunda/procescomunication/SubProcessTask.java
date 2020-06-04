package com.chiru.camunda.procescomunication;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
@Component
public class SubProcessTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String businessKey = execution.getBusinessKey();

        if(null!= businessKey && !businessKey.isBlank()){
            throw new BpmnError("SubProcessError","Just to test");
        }else{
            throw new BpmnError("SubProcessError");
        }
    }
    
}