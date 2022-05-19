package com.buoi20.exercise.steps;

import com.buoi20.exercise.Customer;
import com.buoi20.exercise.Visit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BussinessSteps {
    private Customer customer;
    private double actualTotalExpense;

    @Given("tao khach hang <c>")
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

}
