/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.corp.client;

import com.javatunes.corp.Corporation;
import gov.irs.IRS;

class TaxClient {

    public static void main(String[] args) {
        // TODO: get the IRS instance via static factory method.
        IRS irs = IRS.getInstance();

        // TODO: uncomment this block after completing the above TODO
        // create the Corporation and register it with the IRS
        Corporation corp = new Corporation("JavaTunes");
        irs.register(corp);

        // IRS collects taxes
        System.out.println("IRS collects taxes");
        irs.collectTaxes();

    }
}