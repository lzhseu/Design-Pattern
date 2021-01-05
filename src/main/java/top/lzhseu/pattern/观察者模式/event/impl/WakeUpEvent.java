package top.lzhseu.pattern.观察者模式.event.impl;


import top.lzhseu.pattern.观察者模式.event.Event;

/**
 * @author lzh
 * @date 2021/1/5 10:13
 */
public class WakeUpEvent extends Event {

    private long timestamp = System.currentTimeMillis();

    public WakeUpEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return source + " wake up at " + timestamp;
    }
}
