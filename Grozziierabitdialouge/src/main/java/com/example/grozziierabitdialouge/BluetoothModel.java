package com.example.grozziierabitdialouge;

public class BluetoothModel {
    String blue_name,bluemacadress,modelname;

    public BluetoothModel(String blue_name, String bluemacadress, String modelname) {
        this.blue_name = blue_name;
        this.bluemacadress = bluemacadress;
        this.modelname = modelname;
    }

    public String getBlue_name() {
        return blue_name;
    }

    public void setBlue_name(String blue_name) {
        this.blue_name = blue_name;
    }

    public String getBluemacadress() {
        return bluemacadress;
    }

    public void setBluemacadress(String bluemacadress) {
        this.bluemacadress = bluemacadress;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public BluetoothModel() {
    }
}
