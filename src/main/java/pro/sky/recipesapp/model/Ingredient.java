package pro.sky.recipesapp.model;

import java.util.Objects;

public class Ingredient {
    private String name;
    private int volume;
    private String measureUnit;

    public Ingredient(String name, int volume, String measureUnit) {
        this.name = name;
        this.volume = volume;
        this.measureUnit = measureUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return volume == that.volume && name.equals(that.name) && measureUnit.equals(that.measureUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume, measureUnit);
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", measureUnit='" + measureUnit + '\'' +
                '}';
    }

}
