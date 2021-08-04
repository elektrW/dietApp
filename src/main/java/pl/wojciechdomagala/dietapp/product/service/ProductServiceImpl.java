package pl.wojciechdomagala.dietapp.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wojciechdomagala.dietapp.product.model.Product;
import pl.wojciechdomagala.dietapp.product.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        Product product = null;
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        } else {
            throw new RuntimeException("Product not found for id: " + id);
        }
        return product;
    }

    @Override
    public void deleteProductById(Long id) {
        this.productRepository.deleteById(id);
    }
}
