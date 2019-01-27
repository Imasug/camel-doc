import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.imanaga.camel.doc.parser.CamelXmlParser;

public class AppTest {

	@Test
	public void test() throws Exception {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		// TODO 副作用がない形で実装はできるか？
		CamelXmlParser parser = new CamelXmlParser();
		saxParser.parse(new File("C:\\Users\\SI\\workspace\\camel-doc\\src\\main\\resources\\camel-context.xml"), parser);
		System.out.println(new ObjectMapper().writeValueAsString(parser.getRoutes()));
	}

}
