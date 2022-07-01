package demo.Service.ServiceImplementation;

import demo.Entity.Product;
import demo.Service.ServiceInterface.CategoryService;
import demo.Service.ServiceInterface.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceInMemoryImplementation implements ProductService {
    List<Product> productList = new ArrayList<>();
    @Autowired
    CategoryService categoryService;
    @Override
    public Product getProductById(int id) {
        Product product1 = productList.stream().filter(product -> product.getId() == id).findFirst().get();
        return product1;
    }

    @Override
    public List<Product> getAllProduct() {
        return productList;
    }

    @Override
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    @Override
    public Product updateProductById(Product product, int id) {
        for(Product p:productList){
            if(p.getId()==id){
                p.setDescription(product.getDescription());
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setPrice(product.getPrice());
                p.setStock(product.isStock());
                break;
            }
        }
        return product  ;
    }

    @Override
    public String deleteProductById(int id) {
        List<Product> collect = productList.stream().filter(product -> product.getId() !=id).collect(Collectors.toList());
        productList=collect;
        return "Product has been deleted";
    }
}
