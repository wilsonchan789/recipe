//package org.recipe.models.data;
//
//import org.recipe.models.RecipeField;
//
//import java.util.ArrayList;
//
//public class RecipeFieldData<T extends RecipeField> {
//
//    private ArrayList<T> allFields = new ArrayList<>();
//
//    public ArrayList<T> findAll() {
//        return allFields;
//    }
//
//    public T findById(int id) {
//        for (T item : allFields) {
//            if (item.getId() == id)
//                return item;
//        }
//
//        return null;
//    }
//
//    public void add(T item) {
//        allFields.add(item);
//    }
//
//    T findByValue(String value) {
//        for (T item : allFields) {
//            if (item.contains(value))
//                return item;
//        }
//
//        return null;
//    }
//
//}
