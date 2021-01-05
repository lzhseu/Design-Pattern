package top.lzhseu.pattern.责任链模式;


import top.lzhseu.pattern.责任链模式.entity.Request;
import top.lzhseu.pattern.责任链模式.entity.Response;
import top.lzhseu.pattern.责任链模式.filter.impl.AppleFilter;
import top.lzhseu.pattern.责任链模式.filter.impl.PearFilter;
import top.lzhseu.pattern.责任链模式.filterchain.SimpleFilterChain;

/**
 * @author lzh
 * @date 2021/1/5 12:02
 */
public class Client {

    public static void main(String[] args) {

        String msg = "I like apple, banana, pear and peach";
        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();

        SimpleFilterChain filterChain = new SimpleFilterChain();
        filterChain.addFilter(new AppleFilter())
                .addFilter(new PearFilter());

        filterChain.doFilter(filterChain, request, response);
        System.out.println(request.getRequestStr());
    }
}
