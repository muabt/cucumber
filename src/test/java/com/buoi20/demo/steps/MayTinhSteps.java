package com.buoi20.demo.steps;

import com.buoi20.demo.MayTinh;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MayTinhSteps {
    private MayTinh maytinh;
    private long tmp;
    private Exception e;

    @Given("tao mot may tinh")
    public void taoMotMayTinh() {
        maytinh = new MayTinh();
        
    }

    @When("tinh tong {long} va {long}")
    public void tinhTongVa(long a, long b) {
        tmp = maytinh.tong(a,b);
        
    }

    @Then("ket qua nen bang {long}")
    public void ketQuaNenBang(long result) {
        Assertions.assertEquals(result,tmp);
    }

    @When("tinh thuong {long} và {long}")
    public void tinhThuongVà(long a, long b) {
        e = Assertions.assertThrows(Exception.class,()-> {
            maytinh.thuong(a,b);
        });

    }

    @Then("nem ra exception {string}")
    public void nemRaException(String expectedClass) {
        Assertions.assertEquals(expectedClass,e.getClass().getSimpleName());

    }

    @And("noi dung la {string}")
    public void noiDungLa(String msg) {
        Assertions.assertEquals(msg,e.getMessage());

    }

//    @When("tinh thuong <a> va <b>")
//    public double tinhThuongAVaB(long a, long b) {
//        if(b==0){
//            throw new RuntimeException("khong the chia cho 0");
//        }
//        return (double)a/b;
//        Assertions.assertEquals();
//    }
}
