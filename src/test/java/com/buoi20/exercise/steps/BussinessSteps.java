package com.buoi20.exercise.steps;

import com.buoi20.exercise.Customer;
import com.buoi20.exercise.Visit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BussinessSteps {
    private Customer customer;
    //private double actualTotalExpense;
    private Visit visit;
    private double actual;

    //Tự làm
   /* @Given("tao khach hang <c>")
    public void taoKhachHangC() {
        customer = new Customer("None");

    }

    @When("^khach hang name (.+) la member (.+) loai (.+) ngay (.+) su dung dich vu (.+) va san pham (.+)$")
    public void tinhPhi(String name, boolean isMember, String memberType, String date, String serviceExpense, String productExpense)  throws Throwable{
        customer.setName(name);
        customer.setMember(isMember);
        customer.setMemberType(memberType);
        Date d = new SimpleDateFormat("MM/dd/yyyy").parse(date);
        Visit visit = new Visit(customer,d);
        double cServiceExpense = 0, cProductExpense = 0;
        if (serviceExpense != null){
            cServiceExpense = Double.parseDouble(serviceExpense);
        }
        if(productExpense != null){
            cProductExpense = Double.parseDouble(productExpense);
        }
        if(serviceExpense == null){
            cServiceExpense = 0;
        }
        if(productExpense == null){
            cProductExpense = 0;
        }

        visit.setServiceExpense(cServiceExpense);
        visit.setProductExpense(cProductExpense);
        actualTotalExpense = visit.getTotalExpense();
    }


    @Then("^tinh tong chi phi cho khach hang la (.+)$")
    public void tinhTongChiPhiChoKhachHangLa(double expectedTotalExpense)  throws Throwable{
        Assertions.assertEquals(expectedTotalExpense,actualTotalExpense,0.0009);
    }
*/
    //Thầy giáo chữa bài
    @Given("^khach hang (\\w+)$")
    public void khachHang(String name) {
        customer = new Customer(name);
    }

    @And("^la thanh vien ([A-Z]+)$")
    public void laThanhVien(String type) {
        customer.setMember(true);
        customer.setMemberType(type);
    }


    @And("^ngay thanh toan la (.+)$")
    public void ngayThanhToanLa(String date) throws ParseException {
        System.out.println(date);
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        visit = new Visit(customer, d);
    }

    @And("^co phi dich vu la ([0-9\\.]+)$")
    public void coPhiDichVuLa(double phiDichVu) {
        visit.setServiceExpense(phiDichVu);
    }

    @And("^co phi san pham la ([0-9\\.]+)$")
    public void coPhiSanPhamLa(double phiSanPham) {
        visit.setProductExpense(phiSanPham);
    }

    @When("^tinh tong tien phai tra$")
    public void tinhTongTienPhaiTra() {
        actual = visit.getTotalExpense();
    }

    @Then("so tien phai tra la {double}")
    public void soTienPhaiTraLa(double expected) {
        Assertions.assertTrue(Math.abs(expected - actual) < 0.001);
    }


}
