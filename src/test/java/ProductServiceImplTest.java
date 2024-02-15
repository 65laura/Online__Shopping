import com.onlineshopping.trial.TrialApplication;
import com.onlineshopping.trial.model.Customers;
import com.onlineshopping.trial.model.Products;
import com.onlineshopping.trial.service.impl.CustomerServiceImpl;
import com.onlineshopping.trial.service.impl.ProductsServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,classes = TrialApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
public class ProductServiceImplTest {
    @Autowired
    ProductsServiceImpl productsService;
    Products addProduct;
    Products testProduct = new Products(UUID.randomUUID(),"rice",UUID.randomUUID(),35000);

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    public void testAddProduct() {
        addProduct= productsService.createProduct(testProduct);
        Assertions.assertNotNull(addProduct);
    }
}
