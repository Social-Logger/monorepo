package com.social.logger.server;

import io.javalin.Javalin;

public class App {

  public App() {

  }

  public Javalin startApi() {
    Javalin app = Javalin.create();
    return app;
  }

}
