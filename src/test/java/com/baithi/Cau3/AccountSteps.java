package com.baithi.Cau3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {
    private Account account, accountNhan,accountChuyen;
    private Exception actualException;
    @Given("Khoi tao tai khoan chuyen co ma tai khoan {string} voi name {string} co so du ban dau la {int}")
    public void khoiTaoTaiKhoanChuyen(String id, String nameAccount, int balance) {
        account = new Account(id, nameAccount, balance);
        accountChuyen = account;
    }

    @Given("Khoi tao tai khoan nhan co ma tai khoan {string} voi name {string} co so du ban dau la {int}")
    public void khoiTaoTaiKhoanNhan(String id, String nameAccount, int balance) {
        account = new Account(id, nameAccount, balance);
        accountNhan = account;
    }


    @When("nap {int} vao tai khoan")
    public void napVaoTaiKhoan(int amount) {
        account.credit(amount);
    }

    @Then("so du tai khoan sau khi nap la {int}")
    public void soDuTaiKhoanSauKhiNapLa(int ketQuaSauNap) {
        Assertions.assertEquals(ketQuaSauNap, account.getBalance());
    }

    @When("chuyen {int} tien sang tai khoan nhan")
    public void chuyenTienSangTaiKhoanNhan(int amount) {
        try {
            accountChuyen.transferTo(accountNhan,amount);
        }catch (Exception e) {
            actualException = e;
        }

    }

    @Then("so du tai khoan chuyen sau khi chuyen la {int}")
    public void soDuTaiKhoanChuyen(int ketQuaSauChuyen) {
        Assertions.assertEquals(ketQuaSauChuyen, accountChuyen.getBalance());
    }

    @Then("so du tai khoan nhan sau khi chuyen la {int}")
    public void soDuTaiKhoanNhan(int ketQuaSauChuyen) {
        Assertions.assertEquals(ketQuaSauChuyen, accountNhan.getBalance());
    }

    @When("rut {int} tien tu tai khoan chuyen")
    public void rutTienTuTaiKhoanChuyen(int amount) {
        account.debit(amount);

    }

    @Then("so du tai khoan chuyen sau khi rut la {int}")
    public void soDuTaiKhoanChuyenSauKhiRutLa(int ketQuaSauRut) {
        Assertions.assertEquals(ketQuaSauRut,account.getBalance());
    }
}
