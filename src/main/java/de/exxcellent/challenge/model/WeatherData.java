package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class WeatherData {

    @CsvBindByName(column = "Day")
    private Integer day;

    @CsvBindByName(column = "MxT")
    private Integer mxT;

    @CsvBindByName(column = "MnT")
    private Integer mnT;

    @CsvBindByName(column = "AvT")
    private Integer avT;

    @CsvBindByName(column = "AvDP")
    private Double avDP;

    @CsvBindByName(column = "1HrP TPcpn")
    private Integer oneHrPTPcpn;

    @CsvBindByName(column = "PDir")
    private Integer pDir;

    @CsvBindByName(column = "AvSp")
    private Double avSp;

    @CsvBindByName(column = "Dir")
    private Integer dir;

    @CsvBindByName(column = "MxS")
    private Integer mxS;

    @CsvBindByName(column = "SkyC")
    private Double skyC;

    @CsvBindByName(column = "MxR")
    private Integer mxR;

    @CsvBindByName(column = "Mn")
    private Integer mn;

    @CsvBindByName(column = "R AvSLP")
    private Double ravSLP;

    public WeatherData() { }

    public WeatherData(Integer day, Integer mxT, Integer mnT, Integer avT, Double avDP, Integer oneHrP,
                       Integer pDir, Double avSp, Integer dir, Integer mxS, Double skyC,
                       Integer mxR, Integer mn, Double ravSLP) {
        this.day = day;
        this.mxT = mxT;
        this.mnT = mnT;
        this.avT = avT;
        this.avDP = avDP;
        this.oneHrPTPcpn = oneHrP;
        this.pDir = pDir;
        this.avSp = avSp;
        this.dir = dir;
        this.mxS = mxS;
        this.skyC = skyC;
        this.mxR = mxR;
        this.mn = mn;
        this.ravSLP = ravSLP;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMxT() {
        return mxT;
    }

    public void setMxT(Integer mxT) {
        this.mxT = mxT;
    }

    public Integer getMnT() {
        return mnT;
    }

    public void setMnT(Integer mnT) {
        this.mnT = mnT;
    }

    public Integer getAvT() {
        return avT;
    }

    public void setAvT(Integer avT) {
        this.avT = avT;
    }

    public Double getAvDP() {
        return avDP;
    }

    public void setAvDP(Double avDP) {
        this.avDP = avDP;
    }

    public Integer getOneHrPTPcpn() {
        return oneHrPTPcpn;
    }

    public void setOneHrPTPcpn(Integer oneHrPTPcpn) {
        this.oneHrPTPcpn = oneHrPTPcpn;
    }

    public Integer getPDir() {
        return pDir;
    }

    public void setPDir(Integer pDir) {
        this.pDir = pDir;
    }

    public Double getAvSp() {
        return avSp;
    }

    public void setAvSp(Double avSp) {
        this.avSp = avSp;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public Integer getMxS() {
        return mxS;
    }

    public void setMxS(Integer mxS) {
        this.mxS = mxS;
    }

    public Double getSkyC() {
        return skyC;
    }

    public void setSkyC(Double skyC) {
        this.skyC = skyC;
    }

    public Integer getMxR() {
        return mxR;
    }

    public void setMxR(Integer mxR) {
        this.mxR = mxR;
    }

    public Integer getMn() {
        return mn;
    }

    public void setMn(Integer mn) {
        this.mn = mn;
    }

    public Double getRavSLP() {
        return ravSLP;
    }

    public void setRavSLP(Double ravSLP) {
        this.ravSLP = ravSLP;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "day=" + day +
                ", mxT=" + mxT +
                ", mnT=" + mnT +
                ", avT=" + avT +
                ", avDP=" + avDP +
                ", oneHrP=" + oneHrPTPcpn +
                ", pDir=" + pDir +
                ", avSp=" + avSp +
                ", dir=" + dir +
                ", mxS=" + mxS +
                ", skyC=" + skyC +
                ", mxR=" + mxR +
                ", mn=" + mn +
                ", ravSLP=" + ravSLP +
                '}';
    }
}
