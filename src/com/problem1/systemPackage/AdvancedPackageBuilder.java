package com.problem1.systemPackage;

import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;
import com.problem1.enums.PackageType;

public class AdvancedPackageBuilder extends PackageBuilder {
    public AdvancedPackageBuilder() {
        super.createdPackage = new SystemPackage();
        super.createdPackage.setName(PackageType.Advanced);
    }

    @Override
    public PackageBuilder setDisplayUnit() {
        DisplayUnit displayUnit = new DisplayUnit(
                MicrocontrollerType.RaspberryPi,
                DisplayType.OLED);

        super.createdPackage.setDisplayUnit(displayUnit);
        return this;
    }
}
