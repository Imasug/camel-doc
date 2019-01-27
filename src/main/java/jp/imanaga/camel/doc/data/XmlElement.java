package jp.imanaga.camel.doc.data;

import java.util.List;
import java.util.Map;

public class XmlElement {

	private String name;

	private Map<String, String> attrs;

	private List<XmlElement> childs;

	public XmlElement(String name, Map<String, String> attrs, List<XmlElement> childs) {
		this.name = name;
		this.attrs = attrs;
		this.childs = childs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAttrs() {
		return attrs;
	}

	public void setAttrs(Map<String, String> attrs) {
		this.attrs = attrs;
	}

	public List<XmlElement> getChilds() {
		return childs;
	}

	public void setChilds(List<XmlElement> childs) {
		this.childs = childs;
	}

}
