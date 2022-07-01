package demo.Controller;


import demo.Entity.Product;
import demo.Service.ServiceInterface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get-product-by-id/{id}")
    public Product getProductById(@PathVariable("id") String id){
        return productService.getProductById(Integer.parseInt(id));
    }
    @GetMapping("/get-all-product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PutMapping("/update-product-by-id/{id}")
    public Product updateProductById(@RequestBody Product product,@PathVariable("id") String id){
        return productService.updateProductById(product,Integer.parseInt(id));
    }
    @DeleteMapping("/delete-product-by-id/{id}")
    public String deleteProductById(@PathVariable("id") String id){
        return productService.deleteProductById(Integer.parseInt(id));
    }
}
