/**
 * @author :Hansaka Malshan
 * created 3/27/2023---1:17 PM
 */
package lk.ijse.customer.embedd;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    String FName;
    String MName;
    String LName;

    public Name() {
    }

    public Name(String FName, String MName, String LName) {
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "FName='" + FName + '\'' +
                ", MName='" + MName + '\'' +
                ", LName='" + LName + '\'' +
                '}';
    }
}
