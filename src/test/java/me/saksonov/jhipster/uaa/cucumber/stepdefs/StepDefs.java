package me.saksonov.jhipster.uaa.cucumber.stepdefs;

import me.saksonov.jhipster.uaa.JhipsterUaaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterUaaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
