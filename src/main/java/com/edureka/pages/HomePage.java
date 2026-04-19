package com.edureka.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    
    @FindBy(xpath = "//input[@placeholder='Search courses']")
    WebElement homeSearchBar;
    
    @FindBy(xpath = "//span[contains(@class,'user_name')]")
    WebElement profileIcon;

    @FindBy(xpath = "//a[text()='My Profile']")
    WebElement myProfile;

    @FindBy(xpath = "//a[text()='My Orders']")
    WebElement myOrders;

    @FindBy(xpath = "//a[text()='My Wishlist']")
    WebElement myWishlist;

    @FindBy(xpath = "//a[text()='Change Password']")
    WebElement changePassword;
    
    @FindBy(xpath = "//button[.='Resources']")
    WebElement resourceIcon;
    
    @FindBy(css = "[href='/blog']")
    WebElement blogFromNavbar;
    
    @FindBy(css = "[href='/webinars']")
    WebElement webinarFromNavbar;
    
    @FindBy(css = "[href='/community']")
    WebElement communityFromNavbar;
    
    @FindBy(xpath = "//a[.='Corporate Training']")
    WebElement corporateTraining;
    
    @FindBy(xpath = "//img[@title='Edureka Veranda logo']")
    WebElement edurekaIcon;
    
    // For logged in cases
    @FindBy(id = "dropdown-community")
    WebElement communityIcon;
    
    // For logged in cases
    @FindBy(xpath = "//a[.='Forum']")
    WebElement forumIcon;
    
    @FindBy(css = "[href='https://www.edureka.co/community']")
    private WebElement communityLinkFooter;
    
    @FindBy(linkText = "All Courses")
    private WebElement allCourses;
    
    public void goToCommunityPage(WebDriver driver) {
    	driver.get("https://www.edureka.co/community");
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    	WebElement answerSection = wait.until(
//                ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[.='RESOURCES']"))
//            );
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", answerSection);
//        
//        communityLinkFooter.click();
    }
    
    
    public void clickOnCorporateTraining() {
    	corporateTraining.click();
    }
    
    public void clickOnEdurekaLogo() {
    	edurekaIcon.click();
    }
   
    public void clickHomeSearchBar() {
        homeSearchBar.click();
    }

    public void enterKeywordInHomeSearchBar(String value) {
        homeSearchBar.sendKeys(value);
    }
    
//    public void clickOnCategory(WebDriver driver, String value) {
//		driver.findElement(By.xpath("//a[.='" +  value + "']")).click();
//	}
//	
//	public void clickOnCourse(WebDriver driver, String value) {
//		driver.findElement(By.xpath("//h2[.='" +  value + "']")).click();
//	}
	
	public void openProfileMenu() {
	    profileIcon.click();
	}

	public void clickMyProfile() {
	    myProfile.click();
	}

	public void clickMyOrders() {
	    myOrders.click();
	}

	public void clickMyWishlist() {
	    myWishlist.click();
	}

	public void clickChangePassword() {
	    changePassword.click();
	}

    public void clickOnCategory(WebDriver driver, String value) {
		driver.findElement(By.xpath("//a[.='" +  value + "']")).click();
	}
	
	public void clickOnCourse(WebDriver driver, String value) {
		driver.findElement(By.xpath("//h2[.='" +  value + "']")).click();
	}
	
	// for 'All Courses' and 'Corporate Training' in nav-bar
	public void clickOnButtonFromNavbar(WebDriver driver, String value) {
		driver.findElement(By.xpath("//a[.='" + value + "']")).click();
	}
	
	public void clickOnButtonFromNavbarUnderResources(String value) {
		if(value.equals("blogs")) {
			clickOnBlogFromNavbar();
		}
		else if(value.equals("webinars")) {
			clickOnWebinarFromNavbar();
		}
		else if(value.equals("community")) {
			clickOnCommunityFromNavbar();
		}
	}
	
	public void clickAllCourses() {
		allCourses.click();
	}
	
	public void clickOnCommunityFromNavbar() {
    	resourceIcon.click();
    	communityFromNavbar.click();
    }
    
    public void clickOnWebinarFromNavbar() {
    	resourceIcon.click();
    	webinarFromNavbar.click();
    }

    public void clickOnBlogFromNavbar() {
    	resourceIcon.click();
    	blogFromNavbar.click();
    }
	
//	Works when logged-in 
	public void clickOnCommunity() {
		communityIcon.click();
	}
	
//	Works when logged-in 
	public void clickOnForum() {
		communityIcon.click();
		forumIcon.click();
	}

}