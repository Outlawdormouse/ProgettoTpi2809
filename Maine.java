package org.example;

import static spark.Spark.*;
import org.tinylog.*;


public class Main {
    public static void main(String[] args) {
        get("/bottariIsBetterThanPollini", (req, res) -> "BottariIsBetterThanPollini");
        get("/ciao", (req, res) -> "hola uomooooo!");
        Logger.info("Hello World");
    }
}

