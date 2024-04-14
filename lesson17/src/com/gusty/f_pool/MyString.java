package com.gusty.f_pool;

import java.util.concurrent.Callable;

public class MyString implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "今天天氣好。";
    }
}
