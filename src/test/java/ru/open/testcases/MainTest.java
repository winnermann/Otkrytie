package ru.open.testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class MainTest {
    private CurrencyRate steps = new CurrencyRate();

    @Test
    @Description(value = "Cценарий: Сравнение курсов валют")
    @Epic("Функциональные тесты")
    @Severity(value = SeverityLevel.NORMAL)
    public void openWebsite (){
        // step 1
        steps.openWebsite();
        // step 2
        steps.searchInGoogle();
        // step 3
        steps.openMainMenu();
        // step 4
        steps.openCurrencyExMenu();
        // step 5
        steps.compareDollarRates();
        // step 6
        steps.compareEuroRates();
    }

}
