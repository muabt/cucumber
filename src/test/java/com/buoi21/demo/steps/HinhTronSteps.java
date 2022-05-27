package com.buoi21.demo.steps;

import com.buoi21.demo.HinhTron;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HinhTronSteps {

    private HinhTron hinhTron;
    private double actual;
    private Exception e;

    @Given("khoiTaoHinhTron")
    public void khoitaohinhtron() {
        hinhTron = new HinhTron();
    }

    @And("^kichThuocBang ([0-9\\.-]+)$")
    public void kichThuocBang(double banKinh) {
        hinhTron.setBanKinh(banKinh);
    }

    @When("tinhChuViHinhTron")
    public void tinhChuVi() {
        actual = hinhTron.tinhChuVi();
    }

    @Then("^ketQuaBangHT ([0-9\\.]+)$")
    public void ketQuaBang(double expected) {
        Assertions.assertTrue(expected - actual < 0.01);
    }

    @When("tinhDienTichHinhTron")
    public void tinhdientichhinhtron() {
        e = Assertions.assertThrows(
                Exception.class,
                ()-> {
                    actual = hinhTron.tinhDienTich();
                }
        );
        
    }

    @Then("^nemRa (\\w+)$")
    public void nemraRuntimeException(String expected) {
        Assertions.assertEquals(expected, e.getClass().getSimpleName());
    }

    @And("^noiDung (\\w+)$")
    public void noidungBanKinhPhaiDuong(String message) {
        Assertions.assertEquals(message,e.getMessage());
    }
}
