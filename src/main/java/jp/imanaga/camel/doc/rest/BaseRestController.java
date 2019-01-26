package jp.imanaga.camel.doc.rest;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseRestController {

	@GetMapping("/camelContext")
	public String getCamelContext() throws Exception {
		// TODO フロントエンドからファイルにアクセスできないか？
		String path = "C:\\Users\\SI\\workspace\\camel-doc\\src\\main\\resources\\camel-context.xml";
		return new String(Files.readAllBytes(Paths.get(path)));
	}

}
