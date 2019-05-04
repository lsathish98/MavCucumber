$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium Practice/MavCucumber/login.feature");
formatter.feature({
  "name": "Login validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user in fb page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enter credentials \"\u003cuserid\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user prompts to fb page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userid",
        "password"
      ]
    },
    {
      "cells": [
        "user1",
        "password1"
      ]
    },
    {
      "cells": [
        "user2",
        "password2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.the_user_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter credentials \"user1\" , \"password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "Facebook.the_user_enter_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user prompts to fb page",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook.the_user_prompts_to_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.the_user_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter credentials \"user2\" , \"password2\"",
  "keyword": "When "
});
formatter.match({
  "location": "Facebook.the_user_enter_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user prompts to fb page",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook.the_user_prompts_to_fb_page()"
});
formatter.result({
  "status": "passed"
});
});