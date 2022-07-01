package demo.Service.ServiceImplementation;

import demo.Entity.Category;
import demo.Service.ServiceInterface.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class CategoryServiceInMemoryImplementation implements CategoryService {

    List<Category> categoryList= new ArrayList<>();

    @Override
    public Category getCategoryById(int id) {
        Optional<Category> first = categoryList.stream().filter(category -> category.getId() == id).findFirst();
        Category category = first.get();
        return category;
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryList;
    }

    @Override
    public Category addCategory(Category category) {
         categoryList.add(category);
         return category;
    }

    @Override
    public Category updateCategoryById(Category category, int id) {
        for(Category category1:categoryList){
            if(category1.getId()==id){
                category1.setDescription(category.getDescription());
                category1.setTitle(category.getDescription());
                break;
            }
        }
        return category;
    }

    @Override
    public String deleteCategoryById(int id) {
        List<Category> collect = categoryList.stream().filter(category -> category.getId() != id).collect(Collectors.toList());
        categoryList = categoryList;
        return "Category has been removed";
    }

}
