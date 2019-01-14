package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.repository.OpenIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@RestController
@RequestMapping("/openid")
public class OpenIdController {

    @Autowired
    private OpenIdRepository openIdRepository;

    @PostMapping(value = "/getopenidkey")
    public String openIdDaoAdd(@RequestParam("code") String code)
    {
        String appid = "wx3a0af51644231299";
        String secret = "8630be9ff4aa5420d051b077c4103453";
        String api = "https://api.weixin.qq.com/sns/jscode2session?appid="+ appid +"&secret="+secret +"&js_code="+code+"&grant_type=authorization_code";

        return get(api);
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     */
    public static String get(String url) {
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            // 建立实际的连接
            connection.connect();
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}

