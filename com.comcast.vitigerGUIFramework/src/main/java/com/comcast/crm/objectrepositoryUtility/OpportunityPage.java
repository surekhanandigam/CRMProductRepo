package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityPage
{
	@FindBy(linkText="Opportunities")
	WebElement opplink;

	public WebElement getOpplink() {
		return opplink;
	}
	
	
}
