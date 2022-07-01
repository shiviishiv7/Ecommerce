package demo.Service.ServiceInterface;

import demo.Entity.Category;

import java.util.List;

public interface CategoryService {

    Category getCategoryById(int id);
    List<Category> getAllCategory();
    Category addCategory(Category category);
    Category updateCategoryById(Category category,int id);
    String deleteCategoryById(int id);
}
