package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Random;

@Named
public class RunSubSpaceScan implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Random rando = new Random();
        boolean isHostile = rando.nextBoolean();

        if(isHostile){
            delegateExecution.setVariable("isHostile", true);
            System.out.println("The Mysterious signal is Hostile!");
        }else{
            delegateExecution.setVariable("isHostile", false);
            System.out.println("The Mysterious signal seems to be just a puppy!");
        }

    }

}
