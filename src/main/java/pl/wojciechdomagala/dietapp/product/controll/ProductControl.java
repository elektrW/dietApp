package pl.wojciechdomagala.dietapp.product.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wojciechdomagala.dietapp.person.model.PersonData;
import pl.wojciechdomagala.dietapp.product.model.Product;
import pl.wojciechdomagala.dietapp.product.service.ProductService;

@Controller
public class ProductControl {
    private ProductService productService;

    @Autowired
    public ProductControl(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String viewHomePage(Model model) {
        model.addAttribute("productInfoList", productService.getProductInfo());
        return "product";
    }

    @GetMapping("/showProductInfoForm")
    public String showNewProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @PostMapping("/saveProductInfo")
    public String saveProductInfo(@ModelAttribute Product product) {
        productService.saveProductInfo(product);
        return "redirect:/product";
    }

    @GetMapping("/showFormForUpdateProduct/{id}")
    public String showFormForUpdateProduct(@PathVariable long id, Model model) {
        //get
        Product product = productService.getProductById(id);
        //update
        model.addAttribute("personData", product);
        return "update_product";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProductById(@PathVariable Long id) {
        this.productService.deleteProductById(id);
        return "redirect:/product";
    }

}
