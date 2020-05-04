package cn.how2j.trend.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class IpConfiguration implements ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.serverPort = webServerInitializedEvent.getWebServer().getPort();
    }

    public int getPort(){
        return this.serverPort;
    }

    public static void main(String[] args) {
        int n = 4;
        n |= n >>>1;
        n |= n >>>1;
        //n |= n >>>4;
        System.out.println(n);


    }


}
