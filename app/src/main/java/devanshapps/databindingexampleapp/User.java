package devanshapps.databindingexampleapp;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private String firstName = "";
    private String surname = "";
    private String jobTitle = "";
    private String hobbits = "";

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
    }

    @Bindable
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        notifyPropertyChanged(BR.jobTitle);
    }

    @Bindable
    public String getHobbits() {
        return hobbits;
    }

    public void setHobbits(String hobbits) {
        this.hobbits = hobbits;
        notifyPropertyChanged(BR.hobbits);
    }
}
