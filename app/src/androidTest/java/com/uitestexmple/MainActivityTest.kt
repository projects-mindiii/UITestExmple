package com.uitestexmple

import android.text.InputType
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Avinash Kumar
 * @mail avisingh736@gmail.com
 * */

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    public val mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    public val mIntentRule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun testEmailInputFieldVisibility() {
        onView(withId(R.id.tilEmail)).check(matches(isDisplayed()))
    }

    @Test
    fun testEmailInputFieldHint() {
        onView(withId(R.id.tietEmail)).check(matches(withHint(R.string.email)))
    }

    @Test
    fun testEmailInputFieldInputType() {
        onView(withId(R.id.tietEmail)).check(matches(withInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS)))
    }

    @Test
    fun testEmailInputFieldByTyping() {
        onView(withId(R.id.tietEmail)).perform(typeText("avinash.mindiii@gmail.com"))
    }

    @Test
    fun testPasswordInputFieldVisibility() {
        onView(withId(R.id.tilPassword)).check(matches(isDisplayed()))
    }

    @Test
    fun testPasswordInputFieldHint() {
        onView(withId(R.id.tietPassword)).check(matches(withHint(R.string.password)))
    }

    @Test
    fun testPasswordInputFieldInputType() {
        onView(withId(R.id.tietPassword)).check(matches(withInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD)))
    }

    @Test
    fun testPasswordInputFieldByTyping() {
        onView(withId(R.id.tietPassword)).perform(typeText("123456"))
    }

    @Test
    fun testLoginButtonText() {
        onView(withId(R.id.btnLogin)).check(matches(withText(R.string.login)))
    }

    @Test
    fun testLoginButtonClickIsCalledNewActivity() {
        onView(withId(R.id.btnLogin)).perform(click())
        intended(hasComponent(MainActivity2::class.java.name))
    }

}