package de.exxcellent.challenge.util.parser;

import com.opencsv.bean.CsvBindByName;

import java.util.Objects;

public class TestModel {

    @CsvBindByName(column = "Col1")
    private String col1;

    @CsvBindByName(column = "Col2")
    private Integer col2;

    @CsvBindByName(column = "Col3")
    private Double col3;

    public TestModel() {}

    public TestModel(String col1, Integer col2, Double col3) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public Integer getCol2() {
        return col2;
    }

    public void setCol2(Integer col2) {
        this.col2 = col2;
    }

    public Double getCol3() {
        return col3;
    }

    public void setCol3(Double col3) {
        this.col3 = col3;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TestModel testModel = (TestModel) o;
        return Objects.equals(col1, testModel.col1) && Objects.equals(col2, testModel.col2) && Objects.equals(col3, testModel.col3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(col1, col2, col3);
    }
}
