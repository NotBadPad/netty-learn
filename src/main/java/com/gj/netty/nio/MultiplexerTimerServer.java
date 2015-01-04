package com.gj.netty.nio;

import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * Created by guojing on 2015/6/7.
 */
public class MultiplexerTimerServer implements Runnable {

    private Selector selector;
    private ServerSocketChannel servChannel;
    private volatile boolean stop;

    public MultiplexerTimerServer(int port) {


    }

    @Override
    public void run() {

    }
}
