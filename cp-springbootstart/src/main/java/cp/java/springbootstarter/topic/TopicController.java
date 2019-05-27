package cp.java.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> topicsList() {
		return Arrays.asList(new Topic(),
				new Topic("a","xyz","what a value"),
				new Topic("b","xyz111","what a value you have returned"));
	}
	

}
