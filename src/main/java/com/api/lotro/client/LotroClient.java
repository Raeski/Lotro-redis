package com.api.lotro.client;

import com.api.lotro.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "lotro", url = "https://the-one-api.dev/v2")
public interface LotroClient {

    @RequestMapping(method = RequestMethod.GET, value = "/book")
    Book getBook();

}
