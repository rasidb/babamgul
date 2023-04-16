package com.cydeo.utilities;

import org.openqa.selenium.support.PageFactory;

public class CRM_Utilities {
    public CRM_Utilities(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
