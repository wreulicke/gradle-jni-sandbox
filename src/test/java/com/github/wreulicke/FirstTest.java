package com.github.wreulicke;

import java.util.Objects;

public class FirstTest {

    private native byte[] copy(String src);
    
    @org.junit.Test
    public void test() throws Exception {
        System.loadLibrary("gradle-native-test");
        throw new RuntimeException("equality: " + Objects.equals(copy("test"), "test".getBytes("UTF-8")));
    }

}