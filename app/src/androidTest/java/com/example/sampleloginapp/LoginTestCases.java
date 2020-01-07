package com.example.sampleloginapp;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.Thread.sleep;


@RunWith(AndroidJUnit4.class)
public class LoginTestCases {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    public void navigateTo() {
        onView(withId(R.id.login_relative_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void LoginWIthWorngUsername() throws InterruptedException {
        //Spoon.screenshot(mainActivityTestActivityTestRule.getActivity(), "initial_state");
        navigateTo();
        onView(withId(R.id.et_username)).perform(typeText("rajani"));
        onView(withId(R.id.et_password)).perform(typeText("admin"));
        onView(withId(R.id.btn_login)).perform(click());
        sleep(4000);
        //Spoon.screenshot(mainActivityTestActivityTestRule.getActivity(), "after_login");
        //onView(withText("Username or Password is incorrect")).check(matches(isDisplayed()));
    }

    @Test
    public void LoginWIthWorngPassword() throws InterruptedException {
        navigateTo();
        onView(withId(R.id.et_username)).perform(typeText("rajani"));
        onView(withId(R.id.et_password)).perform(typeText("admin"));
        onView(withId(R.id.btn_login)).perform(click());
        sleep(4000);
        //onView(withText("Username or Password is incorrect")).check(matches(isDisplayed()));
    }

    @Test
    public void LoginWIthEmptyUsername() throws InterruptedException {
        navigateTo();
        onView(withId(R.id.et_username)).perform(typeText("rajani"));
        onView(withId(R.id.et_password)).perform(typeText("admin"));
        onView(withId(R.id.btn_login)).perform(click());
        sleep(4000);
        //onView(withText("Username or Password is incorrect")).check(matches(isDisplayed()));
    }

    @Test
    public void LoginWIthEmptyPassword() throws InterruptedException {
        onView(withId(R.id.et_username)).perform(typeText("rajani"));
        onView(withId(R.id.et_password)).perform(typeText("admin"));
        onView(withId(R.id.btn_login)).perform(click());
        sleep(4000);
        //onView(withText("Username or Password is incorrect")).check(matches(isDisplayed()));
    }

    @Test
    public void LoginWIthUsernamePasswordCorrect() throws InterruptedException {
        navigateTo();
        onView(withId(R.id.et_username)).perform(typeText("rajani"));
        onView(withId(R.id.et_password)).perform(typeText("admin"));
        onView(withId(R.id.btn_login)).perform(click());
        sleep(4000);
        //onView(withText("Username or Password is incorrect")).check(matches(isDisplayed()));
    }

}
