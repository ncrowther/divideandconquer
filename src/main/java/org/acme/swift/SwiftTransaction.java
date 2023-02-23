/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.swift;

public class SwiftTransaction {

    private String bankCode;
    private String countryCode;
    private String locationCode;
    private String branchCode;
    private String route;

    public SwiftTransaction() {
    }

    public SwiftTransaction(String bankCode, String countryCode, String locationCode, String branchCode,
            String route) {
        this.bankCode = bankCode;
        this.countryCode = countryCode;
        this.locationCode = locationCode;
        this.branchCode = branchCode;
        this.route = route;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "SwiftTransaction [bankCode=" + bankCode + ", countryCode=" + countryCode + ", locationCode="
                + locationCode + ", branchCode=" + branchCode + ", route=" + route + "]";
    }

}
