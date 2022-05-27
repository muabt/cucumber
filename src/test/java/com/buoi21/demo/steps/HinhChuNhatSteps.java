package com.buoi21.demo.steps;

import com.buoi21.demo.HinhChuNhat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HinhChuNhatSteps {
    private HinhChuNhat hinhChuNhat = null;
    private double actual;

    @Given("khoiTaoHinhChuNhat")
    public void khoitaohinhchunhat() {
        hinhChuNhat = new HinhChuNhat();
    }

    @And("coChieuDai {double}")
    public void datChieuDai(double chieuDai) {
        hinhChuNhat.setChieuDai(chieuDai);
    }

    @And("coChieuRong {double}")
    public void datChieuRong(double chieuRong) {
        hinhChuNhat.setChieuRong(chieuRong);

    }
    @When("tinhDienTich")
    public void tinhdientich() {
       actual = hinhChuNhat.tinhDienTich();

    }

    @Then("ketQuaBang {double}")
    public void ketquabang(double expected) {
        Assertions.assertTrue(Math.abs(expected-actual) <0.001);
    }

    @When("tinhChuVi")
    public void tinhchuvi() {
        actual = hinhChuNhat.tinhChuVi();
    }
}
