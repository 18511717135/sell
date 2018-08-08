package com.example.sell.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;

@Controller
@Slf4j
public class WechatApi {

	@Autowired
	private WxMpService wxMpService;
	
	@RequestMapping("/auth")
	public void auth() {
		
		String code = wxMpService.oauth2buildAuthorizationUrl("", "", "");
		log.info("code {}", code);
	}
}
