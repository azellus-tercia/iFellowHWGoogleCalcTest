package model;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public final class CalculatorPage {

    public String getResultLine() {
        return $(By.id("cwos")).getText();
    }

    public String getUpperLine() {
        return $(By.xpath("//span[@jsname='ubtiRe']")).getText();
    }

    public CalculatorPage startHandInput(String input) {
        $(By.xpath("//div[@jsname='zLiRgc']")).click();
        actions().sendKeys(input).perform();
        return this;
    }

    public CalculatorPage clickAC() {
        $(By.xpath("//div[@jsname='SLn8gc']")).click();
        return this;
    }

    public CalculatorPage clickEquals() {
        $(By.xpath("//div[@jsname='Pt8tGc']")).click();
        return this;
    }

    public CalculatorPage clickPlus() {
        $(By.xpath("//div[@jsname='XSr6wc']")).click();
        return this;
    }

    public CalculatorPage clickSubtract() {
        $(By.xpath("//div[@jsname='pPHzQc']")).click();
        return this;
    }

    public CalculatorPage clickDivide() {
        $(By.xpath("//div[@jsname='WxTTNd']")).click();
        return this;
    }

    public CalculatorPage clickMultiply() {
        $(By.xpath("//div[@jsname='YovRWb']")).click();
        return this;
    }

    public CalculatorPage clickDot() {
        $(By.xpath("//div[@jsname='YrdHyf']")).click();
        return this;
    }

    public CalculatorPage clickZero() {
        $(By.xpath("//div[@jsname='bkEvMb']")).click();
        return this;
    }

    public CalculatorPage clickOne() {
        $(By.xpath("//div[@jsname='N10B9']")).click();
        return this;
    }

    public CalculatorPage clickTwo() {
        $(By.xpath("//div[@jsname='lVjWed']")).click();
        return this;
    }

    public CalculatorPage clickThree() {
        $(By.xpath("//div[@jsname='KN1kY']")).click();
        return this;
    }

    public CalculatorPage clickFour() {
        $(By.xpath("//div[@jsname='xAP7E']")).click();
        return this;
    }

    public CalculatorPage clickFive() {
        $(By.xpath("//div[@jsname='Ax5wH']")).click();
        return this;
    }

    public CalculatorPage clickSix() {
        $(By.xpath("//div[@jsname='abcgof']")).click();
        return this;
    }

    public CalculatorPage clickSeven() {
        $(By.xpath("//div[@jsname='rk7bOd']")).click();
        return this;
    }

    public CalculatorPage clickEight() {
        $(By.xpath("//div[@jsname='T7PMFe']")).click();
        return this;
    }

    public CalculatorPage clickNine() {
        $(By.xpath("//div[@jsname='XoxYJ']")).click();
        return this;
    }
}
