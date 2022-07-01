package demo.Service.ServiceInterface;

import demo.Entity.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(int id);
    List<Product> getAllProduct();
    Product addProduct( Product product);
    Product updateProductById(Product product, int id);
    String deleteProductById(int id);
}
