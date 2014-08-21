package com.github.dreamhead.moco.dumper;

import com.github.dreamhead.moco.Request;

public class SocketRequestDumper implements Dumper<Request> {
    @Override
    public String dump(Request message) {
        return message.getContent();
    }
}
