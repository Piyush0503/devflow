package com.devflow.service;

public class ActivationService {

    public void activate(Activatable item) {
        item.activate();
    }

    public void deactivate(Activatable item) {
        item.deactivate();
    }
}