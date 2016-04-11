/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * 
 */
public class TransferData implements Serializable, Cloneable {

    private String transferMessage;

    private String rejectReason;

    private java.util.Date transferDate;

    private java.util.Date acceptDate;

    private java.util.Date rejectDate;

    /**
     * @param transferMessage
     */

    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * @return
     */

    public String getTransferMessage() {
        return this.transferMessage;
    }

    /**
     * @param transferMessage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferData withTransferMessage(String transferMessage) {
        setTransferMessage(transferMessage);
        return this;
    }

    /**
     * @param rejectReason
     */

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * @return
     */

    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * @param rejectReason
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferData withRejectReason(String rejectReason) {
        setRejectReason(rejectReason);
        return this;
    }

    /**
     * @param transferDate
     */

    public void setTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * @return
     */

    public java.util.Date getTransferDate() {
        return this.transferDate;
    }

    /**
     * @param transferDate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferData withTransferDate(java.util.Date transferDate) {
        setTransferDate(transferDate);
        return this;
    }

    /**
     * @param acceptDate
     */

    public void setAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * @return
     */

    public java.util.Date getAcceptDate() {
        return this.acceptDate;
    }

    /**
     * @param acceptDate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferData withAcceptDate(java.util.Date acceptDate) {
        setAcceptDate(acceptDate);
        return this;
    }

    /**
     * @param rejectDate
     */

    public void setRejectDate(java.util.Date rejectDate) {
        this.rejectDate = rejectDate;
    }

    /**
     * @return
     */

    public java.util.Date getRejectDate() {
        return this.rejectDate;
    }

    /**
     * @param rejectDate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferData withRejectDate(java.util.Date rejectDate) {
        setRejectDate(rejectDate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTransferMessage() != null)
            sb.append("TransferMessage: " + getTransferMessage() + ",");
        if (getRejectReason() != null)
            sb.append("RejectReason: " + getRejectReason() + ",");
        if (getTransferDate() != null)
            sb.append("TransferDate: " + getTransferDate() + ",");
        if (getAcceptDate() != null)
            sb.append("AcceptDate: " + getAcceptDate() + ",");
        if (getRejectDate() != null)
            sb.append("RejectDate: " + getRejectDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferData == false)
            return false;
        TransferData other = (TransferData) obj;
        if (other.getTransferMessage() == null
                ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null
                && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        if (other.getRejectReason() == null ^ this.getRejectReason() == null)
            return false;
        if (other.getRejectReason() != null
                && other.getRejectReason().equals(this.getRejectReason()) == false)
            return false;
        if (other.getTransferDate() == null ^ this.getTransferDate() == null)
            return false;
        if (other.getTransferDate() != null
                && other.getTransferDate().equals(this.getTransferDate()) == false)
            return false;
        if (other.getAcceptDate() == null ^ this.getAcceptDate() == null)
            return false;
        if (other.getAcceptDate() != null
                && other.getAcceptDate().equals(this.getAcceptDate()) == false)
            return false;
        if (other.getRejectDate() == null ^ this.getRejectDate() == null)
            return false;
        if (other.getRejectDate() != null
                && other.getRejectDate().equals(this.getRejectDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransferMessage() == null) ? 0 : getTransferMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRejectReason() == null) ? 0 : getRejectReason()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTransferDate() == null) ? 0 : getTransferDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAcceptDate() == null) ? 0 : getAcceptDate().hashCode());
        hashCode = prime * hashCode
                + ((getRejectDate() == null) ? 0 : getRejectDate().hashCode());
        return hashCode;
    }

    @Override
    public TransferData clone() {
        try {
            return (TransferData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
