package com.problem1.systemPackage;

import com.problem1.displayUnit.DisplayUnit;
import com.problem1.enums.DisplayType;
import com.problem1.enums.MicrocontrollerType;
import com.problem1.enums.PackageType;

public class StandardPackageBuilder extends PackageBuilder {

    public StandardPackageBuilder() {
        super.createdPackage = new SystemPackage();
        super.createdPackage.setName(PackageType.Standard);
    }

    @Override
    public PackageBuilder setDisplayUnit() {
        DisplayUnit displayUnit = new DisplayUnit(
                MicrocontrollerType.ArduinoMega,
                DisplayType.LED);

        super.createdPackage.setDisplayUnit(displayUnit);
        return this;
    }

}
