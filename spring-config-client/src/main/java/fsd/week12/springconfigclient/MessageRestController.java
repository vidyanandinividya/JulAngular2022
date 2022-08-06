package fsd.week12.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class MessageRestController {
	@Value("${msg:Config server is not working.Please Check}")
	private String msg;
	@GetMapping("/msg")
	public String getMsg()
	{
		return this.msg;
	}

}
