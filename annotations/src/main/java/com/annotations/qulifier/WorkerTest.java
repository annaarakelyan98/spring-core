package com.annotations.qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WorkerTest {
    @Autowired
    @Qualifier("programmer")
    private Worker worker;

    private Worker worker1;
    private Worker worker2;

    @Autowired
    public WorkerTest(@Qualifier("farmer") Worker worker1,
                      @Qualifier("programmer") Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
    }

    public void showWork1() {
        System.out.println("Work is: " + worker.getWork());
    }

    public void showWork() {
        System.out.println("Work is: " + worker1.getWork() + " or " + worker2.getWork());
    }
}
