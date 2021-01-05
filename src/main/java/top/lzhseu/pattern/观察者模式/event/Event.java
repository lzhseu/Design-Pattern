package top.lzhseu.pattern.观察者模式.event;

import java.io.Serializable;

/**
 * 事件
 * @author lzh
 * @date 2021/1/5 10:03
 */
public abstract class Event implements Serializable {

    protected Object source;

    public Event(Object source) {
        if (source == null) {
            throw new IllegalArgumentException("null source");
        }
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[source=" + source + "]";
    }
}
