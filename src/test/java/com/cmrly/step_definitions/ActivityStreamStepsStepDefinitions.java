package com.cmrly.step_definitions;

import com.cmrly.pages.ActivityStreamStepsPage;
import com.cmrly.utilities.BrowserUtils;
import com.cmrly.utilities.ConfigurationReader;
import com.cmrly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityStreamStepsStepDefinitions {

    ActivityStreamStepsPage activityStreamStepsPage = new ActivityStreamStepsPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("web.url");
        Driver.getDriver().get(url);
    }

    @When("user enters valid login {string} password {string} and logins")
    public void user_enters_valid_login_password_and_logins(String login, String password) {
        activityStreamStepsPage.login(login, password);

    }


    @Given("user is on the main page of Activity Stream")
    public void user_is_on_the_main_page_of_activity_stream() {
        Driver.getDriver().get("https://qa.crmly.net/stream/?login=yes");

    }

    @When("user clicks send message box")
    public void user_clicks_send_message_box() {
        activityStreamStepsPage.sendMessage.click();
    }


    @When("user adds a mention by clicking the Add Mention button")
    public void user_adds_a_mention_by_clicking_the_add_mention_button() {
        activityStreamStepsPage.addMention.click();
        activityStreamStepsPage.mention.click();
    }

    @Then("the mention should be added to the message and visible on the Activity Stream")
    public void the_mention_should_be_added_to_the_message_and_visible_on_the_activity_stream() {
        Assert.assertTrue(activityStreamStepsPage.mentionVisible.getText().equals("marketing2@cybertekschool.com"));
    }


    @When("user types a message into the MESSAGE input box")
    public void user_types_a_message_into_the_message_input_box() {
        Driver.getDriver().switchTo().frame(0);
        activityStreamStepsPage.typeMessage.sendKeys("I want automate this functionality");
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("user attaches a link to the text and saves")
    public void user_attaches_a_link_to_the_text_and_saves() {

        activityStreamStepsPage.LinkToMessage.click();
        activityStreamStepsPage.linkSpace.sendKeys("https://qa.crmly.net/stream/?login=yes");
        activityStreamStepsPage.saveButton.click();

    }

    @When("user clicks the SEND button")
    public void user_clicks_the_send_button() {
        activityStreamStepsPage.sendButton.click();
    }

    @When("user clicks insert video button")
    public void user_clicks_insert_video_button() {
        activityStreamStepsPage.insertVideo.click();
    }
    @When("user inserts  YouTube or Vimeo video")
    public void user_inserts_you_tube_or_vimeo_video() {
        activityStreamStepsPage.videoSpace.sendKeys("https://www.youtube.com/watch?v=FKfGxaeIHoA");
    }
    @Then("user clicks the SAVE button")
    public void user_clicks_the_save_button() {
        activityStreamStepsPage.videoSaveButton.click();
    }

    @When("user cancels links and video before sending the message by clicking the CANCEL button")
    public void user_cancels_links_and_video_before_sending_the_message_by_clicking_the_cancel_button() {
        BrowserUtils.clickWithJS(activityStreamStepsPage.cancelButton);
        //activityStreamStepsPage.cancelButton.click();
    }


    @When("user adds a tag to the MESSAGE")
    public void user_adds_a_tag_to_the_message() {
     activityStreamStepsPage.addTags.click();
     activityStreamStepsPage.tagInput.sendKeys("hello");
     activityStreamStepsPage.tagAddButton.click();
    }
    @When("user removes the tag before sending the message by clicking the REMOVE button")
    public void user_removes_the_tag_before_sending_the_message_by_clicking_the_remove_button() {
        activityStreamStepsPage.removeTags.click();
    }
    @Then("the message should not contain any tags on the Activity Stream")
    public void the_message_should_not_contain_any_tags_on_the_activity_stream() {
        Assert.assertTrue(activityStreamStepsPage.notContainsTag.getText().equals("hello"));

    }



}