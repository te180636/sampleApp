package jp.te4a.spring.boot.myapp4;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* Hello world!
*
*/
@RestController
public class HelloController 
{
	@RequestMapping("/")
	public String index() {
		return "Sample!";
	}
}
