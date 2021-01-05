package top.lzhseu.pattern.观察者模式.multicaster;

import top.lzhseu.pattern.观察者模式.event.Event;
import top.lzhseu.pattern.观察者模式.listener.Listener;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lzh
 * @date 2021/1/5 10:15
 */
public class SimpEventMulticaster implements EventMulticaster {

    private Set<Listener> listeners;

    public SimpEventMulticaster() {
        listeners = new HashSet<Listener>();
    }

    @Override
    public void registerListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void registerListeners(Collection<Listener> listeners) {
        this.listeners.addAll(listeners);
    }

    @Override
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListener(Event event) {
        for (Listener listener : listeners) {
            listener.actionToEvent(event);
        }
    }

}
