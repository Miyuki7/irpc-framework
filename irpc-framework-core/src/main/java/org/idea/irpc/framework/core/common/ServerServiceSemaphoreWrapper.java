package org.idea.irpc.framework.core.common;

import java.util.concurrent.Semaphore;

/**
 */
public class ServerServiceSemaphoreWrapper {

    private Semaphore semaphore;

    private int maxNums;

    public ServerServiceSemaphoreWrapper(int maxNums) {
        this.maxNums = maxNums;
        this.semaphore = new Semaphore(maxNums);
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public int getMaxNums() {
        return maxNums;
    }

    public void setMaxNums(int maxNums) {
        this.maxNums = maxNums;
    }
}
