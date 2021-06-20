package com.jeetprksh.system.design.tinyurl.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/tinyurl")
public class TinyURLController {

  @Post
  public String tiny() {
    return "hello";
  }

  @Get("/{hash}")
  public String unTiny(String hash) {
    return "hello " + hash;
  }

}
