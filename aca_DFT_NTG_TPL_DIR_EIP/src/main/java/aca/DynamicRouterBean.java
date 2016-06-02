package aca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Header;

public class DynamicRouterBean {
	public String route(String body, @Header(Exchange.SLIP_ENDPOINT) String previous) {
		return whereToGo(body, previous);
	}

	private String whereToGo(String body, String previous) {
		List<String> wordList = wordList(body);
		String nextWord = nextWord(wordList, previous);
		if (nextWord != null) {
			return "direct://" + nextWord;
		} else {
			return null;
		}
	}

	String nextWord(List<String> wordList, String previous) {
		String word = null;
		String searchWord = ending(previous);
		if (wordList.contains(searchWord)) {
			int i = wordList.indexOf(searchWord) + 1;
			if ((i > 0) && (wordList.size() > i) && wordList.get(i) != null) {
				word = wordList.get(i);
			}
		} else if (previous == null) {
			return wordList.get(0);
		}
		return word;

	}

	List<String> wordList(String body) {
		List<String> words = new ArrayList<String>(Arrays.asList(body.split(" ")));
		return words;
	}

	String ending(String s) {
		String end = null;
		if (null != s && s.contains("//")) {
			end = s.substring(s.indexOf("//") + 2, s.length());
		}
		return end;
	}
}
