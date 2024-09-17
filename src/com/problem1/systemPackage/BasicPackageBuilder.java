package com.problem1.systemPackage;

import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;
import com.problem1.enums.PackageType;

public class BasicPackageBuilder extends PackageBuilder {

    public BasicPackageBuilder() {
        this.createdPackage = new SystemPackage();
        this.createdPackage.setName(PackageType.Basic);
    }

    @Override
    public PackageBuilder setDisplayUnit() {
        DisplayUnit displayUnit = new DisplayUnit(
                MicrocontrollerType.ATMega32,
                DisplayType.LCD);

        this.createdPackage.setDisplayUnit(displayUnit);
        return this;
    }
}
