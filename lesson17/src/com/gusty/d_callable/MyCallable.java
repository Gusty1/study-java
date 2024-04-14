package com.gusty.d_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "我我我我我我我";
    }
}
