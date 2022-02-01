package com.example.Docker1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/docker1")
public class DockerController {
	@GetMapping("/home")
	public @ResponseBody String home() {
		return "THIS IS Docker2 HOME PAGE";
	}
}
