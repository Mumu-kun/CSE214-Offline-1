package com.problem1.systemPackage;

import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;
import com.problem1.enums.PackageType;

public class PremiumPackageBuilder extends PackageBuilder {

    public PremiumPackageBuilder() {
        super.createdPackage = new SystemPackage();
        super.createdPackage.setName(PackageType.Premium);
    }

    @Override
    public PackageBuilder setDisplayUnit() {
        DisplayUnit displayUnit = new DisplayUnit(
                MicrocontrollerType.RaspberryPi,
                DisplayType.TouchScreen);

        super.createdPackage.setDisplayUnit(displayUnit);
        return this;
    }
}
