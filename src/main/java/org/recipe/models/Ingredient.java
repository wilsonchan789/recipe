package org.recipe.models;

import javax.persistence.Entity;

@Entity
public class Ingredient extends IngredientField {

//    public Ingredient(String value) {
//        super(value);
//    }
    private String ingredientName;
    private String ingredientNameParsed;
    private String wholeNumber;
    private String ingredientFractionQuantity;
    private String numerator;
    private String denominator;
    private String displayType;
    private String ingredientUnit;
    private Integer ingredientID;
    private String ingredientType;
    private String ingredientListName;

    public String getIngredientName() {

        return ingredientName;
        }

    public void setIngredientName(String ingredientName) {

        this.ingredientName = ingredientName;
        }

    public String getIngredientNameParsed() {
            return ingredientNameParsed;
        }

    public void setIngredientNameParsed(String ingredientNameParsed) {
        this.ingredientNameParsed = ingredientNameParsed;
    }

    public String getWholeNumber() {
            return wholeNumber;
        }

    public void setWholeNumber(String wholeNumber) {
            this.wholeNumber = wholeNumber;
        }

    public String getIngredientFractionQuantity() {
            return ingredientFractionQuantity;
        }

    public void setIngredientFractionQuantity(String ingredientFractionQuantity) {
        this.ingredientFractionQuantity = ingredientFractionQuantity;
    }

    public String getNumerator() {
            return numerator;
        }

    public void setNumerator(String numerator) {
            this.numerator = numerator;
        }

    public String getDenominator() {
            return denominator;
        }

    public void setDenominator(String denominator) {
            this.denominator = denominator;
        }

    public String getDisplayType() {
            return displayType;
        }

    public void setDisplayType(String displayType) {
            this.displayType = displayType;
        }

    public String getIngredientUnit() {
            return ingredientUnit;
        }

    public void setIngredientUnit(String ingredientUnit) {
            this.ingredientUnit = ingredientUnit;
        }

    public Integer getIngredientID() {
            return ingredientID;
        }

    public void setIngredientID(Integer ingredientID) {
            this.ingredientID = ingredientID;
        }

    public String getIngredientType() {
            return ingredientType;
        }

    public void setIngredientType(String ingredientType) {
            this.ingredientType = ingredientType;
        }

    public String getIngredientListName() {
            return ingredientListName;
        }

    public void setIngredientListName(String ingredientListName) {
            this.ingredientListName = ingredientListName;
        }

    public Ingredient() {
            // TODO Auto-generated constructor stub
        }

    public Ingredient(String ingredientName, String wholeNumber, String numerator, String denominator, String ingredientUnit,
                      String ingredientType) {
        super();
        this.ingredientName = ingredientName;
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
        this.ingredientUnit = ingredientUnit;
        this.ingredientType = ingredientType;
    }

    public Ingredient(String ingredientName, String wholeNumber, String numerator, String denominator, String ingredientUnit,
                      Integer ingredientID, String ingredientType) {
        super();
        this.ingredientName = ingredientName;
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
        this.ingredientUnit = ingredientUnit;
        this.ingredientID = ingredientID;
        this.ingredientType = ingredientType;
    }

    public Ingredient(String ingredientName, String wholeNumber, String numerator, String denominator, String ingredientUnit,
                      Integer ingredientID, String ingredientType, String displayType) {
        super();
        this.ingredientName = ingredientName;
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
        this.ingredientUnit = ingredientUnit;
        this.ingredientID = ingredientID;
        this.ingredientType = ingredientType;
        this.displayType = displayType;
    }

    public Ingredient(String wholeNumber, String numerator, String denominator) {
        super();
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public String toString() {
        return "ingredient information:\n" + "ingredient name: " + ingredientName + "\nwhole number: " + wholeNumber + "\nnumerator: " + numerator + "\ndenominator: " + denominator +
                "\ningredient unit: " + ingredientUnit + "\ningredient id: " + ingredientID + "\ningredient type: " + ingredientType;
    }

}
