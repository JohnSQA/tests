package cloud.autotests.tests.web;

import cloud.autotests.tests.TestBase;
import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Feature("Selenide-appium web, iOS and Android tests")
@Story("Career tests. Web")
@Tag("web")
@Tag("apply")
public class FreeleticsTests extends TestBase {
    @Test
    @DisplayName("Career test")
    void careerTest() {
        step("Go to career page", ()-> {
            open("https://www.freeletics.com/en/");
            $("body").shouldHave(text("Accept all cookies"));
            //Accept all cookies
            $x("//*[@id=\"root\"]/div/div/div/button[1]").click();
        });

        step("Go to career page", ()-> {
            //Career
            $x("//*[@id=\"root\"]/article/footer/div/ul/li[2]/ul/li[1]/a").scrollTo();
            $x("//*[@id=\"root\"]/article/footer/div/ul/li[2]/ul/li[1]/a").click();
        });

        step("Go to a list of positions", ()-> {
            //Open a list of positions
            $x("//*[@id=\"SectionHero\"]/section[1]/div/a").click();
        });

        step("Find QA engineer", ()-> {
            //Find QA enginee
            $x("//*[@id=\"product-engineering\"]/div/ul/li[5]/a").click();
        });

        step("Check results", ()-> {
            $("h1").shouldHave(text("QA Engineer"));
            $x("//*[@itemprop=\"jobLocation\"]").shouldHave(text("Munich"));
            $x("//*[@itemprop=\"description\"]").shouldHave(visible);
            $$x("//*[@itemprop=\"responsibilities\"]//li").shouldBe(CollectionCondition.size(9));
            // there is a bug 9 =)
            $$x("//*[@itemprop=\"experienceRequirements\"]//li").shouldBe(CollectionCondition.size(9));
        });

            step("Apply now and check results", ()-> {
            //Apply now
            $x("//*[@id=\"SectionApplication\"]//a[@role=\"button\"]").shouldHave(text("Apply now"));
            $x("//*[@id=\"SectionApplication\"]//a[@role=\"button\"]").click();
            switchTo().window(1);
            $(".application-form h4").shouldHave(text("SUBMIT YOUR APPLICATION"));
        });
    }
}
