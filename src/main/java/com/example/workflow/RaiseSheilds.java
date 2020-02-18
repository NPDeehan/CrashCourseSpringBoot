package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Random;

@Named
public class RaiseSheilds implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random rando = new Random();

        int shields = rando.nextInt(101);
        System.out.println("Shield are at "+ shields);
        delegateExecution.setVariable("shields", shields);

    }
}
