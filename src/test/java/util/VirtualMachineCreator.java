package util;

import model.VirtualMachine;
import pages.GoogleCloudMainPage;

public class VirtualMachineCreator {
    public static VirtualMachine creatVirtualMachine() {
        String virtualMachinePrice = new GoogleCloudMainPage()
                .openPage()
                .searchInGoogleCloud("Google Cloud Platform Pricing Calculator")
                .openPricingCalculator()
                .enterNumberOfInstances(TestDataReader.getTestData("numberOfInstances"))
                .selectN1Series()
                .selectCPU8RUM30Machine()
                .selectAddGPUCheckbox()
                .selectNvidia_tesla_v100GPUType()
                .selectOneGPU()
                .selectSSD2x375GB()
                .selectDatacenterLocationFrankfurt()
                .selectOneYearCommittedOption()
                .clickAddToEstimateButton()
                .getTotalEstimateMonthlyCost();

        return new VirtualMachine(virtualMachinePrice);
    }
}
