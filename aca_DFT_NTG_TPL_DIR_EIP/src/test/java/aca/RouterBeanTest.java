package aca;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RouterBeanTest {

	@Test
	public void testEnding() {
		DynamicRouterBean routerBean = new DynamicRouterBean();
		assertEquals("a", routerBean.ending("mock://a"));
	}

	@Test
	public void testWordList() {
		DynamicRouterBean routerBean = new DynamicRouterBean();
		assertEquals("boy", routerBean.wordList("every good boy does fine").get(2));
	}

	@Test
	public void testNextWord() {
		DynamicRouterBean routerBean = new DynamicRouterBean();
		List<String> wordList = routerBean.wordList("every good boy does fine");
		assertEquals("every", routerBean.nextWord(wordList, null));
		assertEquals("good", routerBean.nextWord(wordList, "direct://every"));
		assertEquals("boy", routerBean.nextWord(wordList, "direct://good"));
		assertEquals("does", routerBean.nextWord(wordList, "direct://boy"));
		assertEquals("fine", routerBean.nextWord(wordList, "direct://does"));
		assertEquals(null, routerBean.nextWord(wordList, "direct://fine"));
	}

}
