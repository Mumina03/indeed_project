package com.cmrly.pages;

import com.cmrly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamStepsPage {

    public ActivityStreamStepsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputLogin;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginButton;



    public void login(String login, String password){
        this.inputLogin.sendKeys(login);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }

    @FindBy(xpath = "//*[@id=\"microoPostFormLHE_blogPostForm_inner\"]/span[1]")
    public WebElement sendMessage;


    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMention;


    @FindBy(xpath = "/html/body/div[7]/div[1]/div/div[2]/table/tr/td/div[1]/span/span[2]/a")
    public WebElement mention;


    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/ol/li[1]/div[2]/span[1]/span[2]")
    public WebElement mentionVisible;

    @FindBy(xpath = "/html/body")
    public WebElement typeMessage;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement LinkToMessage;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement linkSpace;

    @FindBy(className = "adm-btn-save")
    public WebElement  saveButton;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement sendButton;


    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span/i")
    public WebElement insertVideo;

    @FindBy(xpath = "//*[@id=\"video_idPostFormLHE_blogPostForm-source\"]")
    public WebElement videoSpace;


    @FindBy(xpath = "//*[@id=\"video_idPostFormLHE_blogPostForm-source\"]")
    public WebElement videoSaveButton;

    @FindBy(xpath = "/html/body/a")
    public  WebElement addedLink;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-link']")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@id=\"bx-b-tag-input-blogPostForm\"]")
    public WebElement addTags;

    @FindBy(xpath = "//*[@id=\"TAGS_blogPostForm67abSn\"]")
    public WebElement tagInput;

    @FindBy(xpath = "//*[@id=\"bx-post-tag-popup\"]/div[3]/span")
    public WebElement tagAddButton;


    @FindBy(xpath = "//*[@id=\"post-tags-container-blogPostForm\"]/span[1]/span")
    public WebElement removeTags;

    @FindBy()
    public WebElement notContainsTag;



}




