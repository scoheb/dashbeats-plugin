/*
 * The MIT License
 *
 * Copyright 2014 Ericsson. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ericsson.jenkins.plugins.dashbeats.model;

import java.util.Date;

/**
 * Created by ekongto on 2014-09-11.
 */
public class FaultCauseInfo {
    private Date date;
    private String faultCause;
    private int failures = 0;

    /**
     * Constructor of fault cause info
     *
     * @param date
     * @param faultCause
     */
    public FaultCauseInfo(Date date, String faultCause) {
        this.date = date;
        this.faultCause = faultCause;
        if (faultCause != null && !"".equals(faultCause)) {
            this.failures = 1;
        }
    }

    /**
     * Get date of build giving the fault cause
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set date of build giving the fault cause
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the fault cause
     * @return
     */
    public String getFaultCause() {
        return faultCause;
    }

    /**
     * Get number of failures occurred for this fault cause
     * @return
     */
    public int getFailures() {
        return failures;
    }

    /**
     * Set number of failures occurred for this fault cause
     * @param failures
     */
    public void setFailures(int failures) {
        this.failures = failures;
    }

    /**
     * Override to pring the content of the fault cause info
     * @return
     */
    public String toString() {
        StringBuffer sb = new StringBuffer("")
                .append(faultCause)
                .append("     failures(").append(failures).append(")");
        return sb.toString();
    }
}