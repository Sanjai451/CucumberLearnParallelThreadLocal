package com.edureka.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.edureka.pages.HomePage;
import com.edureka.pages.LoginPage;

public class Pages {

	// ── ThreadLocal container ──────────────────────────────────────────────────
	private static final ThreadLocal<Pages> INSTANCE = new ThreadLocal<>();

	// ── Per-thread page object instances ──────────────────────────────────────

	// Home page and Community
	public HomePage homePage;

	public LoginPage loginPage;

	private Pages(WebDriver driver) {

		homePage = PageFactory.initElements(driver, HomePage.class);

		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	/**
	 * Called once per scenario in Hook.setUp(). Creates a fresh Pages instance
	 * bound to this thread's WebDriver.
	 */
	public static void loadAllPages(WebDriver driver) {
		INSTANCE.set(new Pages(driver));
	}

	/**
	 * Returns this thread's Pages instance. Call this from every step definition
	 * instead of using static fields.
	 */
	public static Pages get() {
		Pages pages = INSTANCE.get();
		if (pages == null) {
			throw new IllegalStateException("Pages not initialised for thread " + Thread.currentThread().getName()
					+ ". Ensure Hook.setUp() ran before accessing Pages.get().");
		}
		return pages;
	}

	/**
	 * Must be called in Hook.tearDown() to prevent ThreadLocal memory leaks in
	 * thread-pool environments (Maven Surefire, CI agents, etc.).
	 */
	public static void cleanUp() {
		INSTANCE.remove();
	}
}
