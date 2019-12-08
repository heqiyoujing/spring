package com.example.demo.controller;

import com.example.demo.httpClient.HttpRequest;
import com.example.demo.httpClient.HttpResponse;
import com.example.demo.httpClient.HttpUtil;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

//    @Autowired
//    private JavaMailSender mailSender;
//    @Value("${spring.mail.username}")
//    private String username;
//
//    // https://blog.csdn.net/u011244202/article/details/54809696/
//    @RequestMapping("/email")
//    public String sendSimpleMail() throws Exception {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(username);
//        message.setTo("931380652@qq.com");
//        message.setSubject("主题：简单邮件");
//        message.setText("测试邮件内容");
//        mailSender.send(message);
//        return "success";
//    }

    @RequestMapping("/hello-hellos")
    public String hello(HttpServletRequest request){
        String url = request.getRequestURI();
        url = url.substring(1,url.length());
        String msg = null;
        if(url.contains("-")){
            int index = url.indexOf("-");
            msg = url.substring(0, index);
        } else {
            int flag =  url.indexOf("/");
            msg = url.substring(0, flag);
        }
        System.out.println(request.getContextPath());
        return "url:" + url + "<br/>" + "msg:" + msg + "<br/>" + "ContextPath:" + request.getContextPath();
    }


    @RequestMapping(value = "/hellos", method = RequestMethod.POST)
    public String hellos(HttpServletRequest request){
        String name = request.getParameter("name");
        return "Hello" + name;
    }

    /*@RequestMapping("/httpclients")
    public ResponseEntity<String> httpclients(HttpServletRequest request, HttpServletResponse response){
        String msg = "";
        HashMap<String, String> getParamsMap = new HashMap<>();
        Map<String, Object> params = new HashMap<>();
        msg = HttpRequest.sendGet("http://localhost:1201/config-client-pro.properties", params);
        ResponseEntity<String> responsemsg = new ResponseEntity<>(msg, getHttpHeaders(MediaType.TEXT_PLAIN), HttpStatus.OK);
        return responsemsg;
    }
    private HttpHeaders getHttpHeaders(MediaType mediaType) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(mediaType);
        return httpHeaders;
    }*/
}
