package main.dependency_injection;

import com.example.spring_dependency_injection.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlConfig {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();

		MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();

		ctx.close();
	}

}
