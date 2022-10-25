package com.leeheefull.playwright;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrawlingUtilsTest {

    private String url;

    @BeforeEach
    public void setUp() {
        this.url = "https://www.musinsa.com/app/";
    }

    @Test
    public void 스크린샷() {
        CrawlingUtils.screenshot(url, "musinsa_home.png");
    }

    @Test
    public void 셀렉터로_속성_값_가져오기() {
        var actual = CrawlingUtils.selector(url, "#fbOgTitle", "content");
        assertEquals("무신사 스토어", actual);
    }

}
