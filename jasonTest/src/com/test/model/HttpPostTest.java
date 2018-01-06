package com.test.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpPostTest {
    void testPost(String urlStr) {
        try {
            URL url = new URL(urlStr);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
//            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");
            
            OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());    
            String xmlInfo = getXmlInfo();
            out.write(new String(xmlInfo));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = "";
            StringBuffer buf = new StringBuffer();
            for (line = br.readLine(); line != null; line = br.readLine()) {
                buf.append(new String(line.getBytes(),"UTF-8"));
            }
            System.out.println(buf.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getXmlInfo() {
        // 通过wsdl文件可以查看接口xml格式数据，构造调用接口xml数据
        String xml = "test";
        		return xml;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://localhost:8080/jasonTest/YGJ_login";
        new HttpPostTest().testPost(url);
    }
}

