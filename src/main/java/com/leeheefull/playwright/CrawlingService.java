package com.leeheefull.playwright;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;

public class CrawlingService {

    /**
     * 셀렉터로 속성 값 가져오기
     */
    public static String selector(String url, String selector, String attribute) {
        var page = set(url);
        return page.querySelector(selector)
                .getAttribute(attribute);
    }

    /**
     * 크롬 브라우저 새로운 페이지 생성 후 url 진입
     */
    private static @NotNull Page set(String url) {
        var page = Playwright.create()      // playwright 생성
                .chromium()     // browser 선택 (chrome)
                .launch()       // 브라우저 실행
                .newPage();     // 브라우저 페이지 생성
        page.navigate(url);     // url 진입
        return page;
    }

}
