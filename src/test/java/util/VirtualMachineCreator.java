package util;

import model.VirtualMachine;
import pages.GoogleCloudSearchResultPage;

public class VirtualMachineCreator {

    public static VirtualMachine creatVirtualMachine() {
        String virtualMachinePrice = new GoogleCloudSearchResultPage()
                .openPricingCalculator()
                .enterNumberOfInstances(TestDataReader.getTestData("numberOfInstances"))
                .selectN1Series()
                .selectMachineType(TestDataReader.getTestData("type"))
                .selectAddGPUCheckbox()
                .selectGPUType(TestDataReader.getTestData("gpuType"))
                .selectOneGPU()
                .selectSSD2x375GB()
                .selectDatacenterLocationFrankfurt()
                .selectOneYearCommittedOption()
                .clickAddToEstimateButton()
                .getTotalEstimateMonthlyCost();

        return new VirtualMachine(virtualMachinePrice);
    }
}
