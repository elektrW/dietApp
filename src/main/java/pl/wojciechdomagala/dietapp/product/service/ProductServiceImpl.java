package pl.wojciechdomagala.dietapp.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.dietapp.product.model.Product;
import pl.wojciechdomagala.dietapp.product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void saveProductInfo(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> getProductInfo() {
        return productRepository.findAll();
    }
}
