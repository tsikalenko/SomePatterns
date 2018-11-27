package com.gmail.tsikalenko.nikita.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> list);
}
