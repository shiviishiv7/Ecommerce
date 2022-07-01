package demo.Controller;


import demo.Entity.Category;
import demo.Service.ServiceInterface.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {


    //api for:how will you change the category of item

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get-category-by-id/{id}")
    public Category getCategoryById(@PathVariable("id")String id){
        return categoryService.getCategoryById(Integer.parseInt(id));
    }

    @GetMapping("/get-all-category")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }
    @PostMapping("/add-category")
    public Category addCategory(@RequestBody Category category){
        System.out.println(category.getId());
        System.out.println(category.getDescription());
        System.out.println(category.getTitle());
        return categoryService.addCategory(category);
    }
    @PutMapping("/update-category-by-id/{id}")
    public Category updateCategoryById(@RequestBody Category category,@PathVariable("id") String id){
        return categoryService.updateCategoryById(category,Integer.parseInt(id));
    }
    @DeleteMapping("/delete-category-by-id/{id}")
    public String deleteCategoryById(@PathVariable("id") String id){
        return categoryService.deleteCategoryById(Integer.parseInt(id));
    }



}
