package top.lzhseu.pattern.责任链模式.entity;

/**
 * @author lzh
 * @date 2021/1/5 11:27
 */
public class Request {

    /**
     * 真正的 Request 对象中是包含很多信息的, 这里仅用一个字符串作模拟
     */
    private String requestStr;

    public String getRequestStr() {
        return requestStr;
    }

    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}

