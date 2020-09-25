package ca.yorku.mcalc.MCalcModelTest;

import org.junit.Test;

import ca.yorku.mcalc.MCalc.MCalcModel;

public class MCalcModelTest
{
    @Test
    public void MCalcModelTest(){
        MCalcModel myModel;
        myModel = new MCalcModel("800000", "25", "1.3");
        System.out.println("Testing MCalModel: ");
        System.out.println(myModel.computePayment());  // success
    }
}
