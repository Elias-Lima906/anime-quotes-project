package com.api.animequote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "anime-quote", url = "https://animechan.io/api/v1")
public interface AnimeQuoteFeignClient {

    @GetMapping("/quotes/random")
    AnimeQuote getRandomQuote();

    @GetMapping("/anime")
    AnimeQuote getRandomQuoteByTitle(@RequestParam("title") String title);
}
