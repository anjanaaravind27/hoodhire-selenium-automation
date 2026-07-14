package com.hoodhire.tests.messages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hoodhire.base.BaseTest;
import com.hoodhire.pages.MessagesPage;

public class MessagesTest extends BaseTest{
	@Test
	public void verifyMessagesPage() {

	    loginAsSeeker();

	    MessagesPage messagesPage =
	            new MessagesPage(driver);

	    messagesPage.clickMessages();

	    Assert.assertTrue(
	            messagesPage.isNoMessagesFoundDisplayed()
	    );
	}
}
