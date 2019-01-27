package jp.imanaga.camel.doc.controller;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.imanaga.camel.doc.data.XmlElement;
import jp.imanaga.camel.doc.parser.CamelXmlParser;

@RestController
public class BaseRestController {

	@Autowired
	private CamelXmlParser parser;

	@GetMapping(path = "/camelContext", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<XmlElement> getCamelContext() throws Exception {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		// TODO ファイル外だし
		saxParser.parse(new File("C:\\Users\\SI\\workspace\\camel-doc\\src\\main\\resources\\camel-context.xml"),
				parser);
		return parser.getRoutes();
	}

}
