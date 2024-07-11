package com.yupi.yuapiinterface.controller;

import cn.hutool.crypto.SignUtil;
import com.yupi.yuapiinterface.config.DataSourceConfig;
import org.gatech.henryapiclient.utils.SignUtils;
import org.springframework.web.bind.annotation.*;
import org.gatech.henryapiclient.model.User;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;

/**
 * 名称 API
 *

 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("yupi"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }


    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");

        String sql = "SELECT secretKey FROM user where accessKey = ?";

        String secretKey = null;
        try (Connection conn = DataSourceConfig.getDataSource().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, accessKey);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) throw new RuntimeException("无权限");
            do {
                secretKey = rs.getString("secretKey");
            } while (rs.next());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Long timestamp1 = Long.valueOf(timestamp);

        long currentTimestamp = System.currentTimeMillis() / 1000;
        if (currentTimestamp - timestamp1 > 100) throw new RuntimeException("超时");

        String serverSign = SignUtils.genSign(body, secretKey);

        if(!serverSign.equals(sign)) throw new RuntimeException("无权限");
        // todo 调用次数 + 1 invokeCount
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
