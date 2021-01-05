package top.lzhseu.pattern.观察者模式.multicaster;


import top.lzhseu.pattern.观察者模式.event.Event;
import top.lzhseu.pattern.观察者模式.listener.Listener;

import java.util.Collection;

/**
 * 事件广播器
 * @author lzh
 * @date 2021/1/5 10:05
 */
public interface EventMulticaster {

    void registerListener(Listener listener);

    void registerListeners(Collection<Listener> listeners);

    void removeListener(Listener listener);

    void notifyListener(Event event);
}
