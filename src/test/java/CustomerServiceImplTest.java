//import com.onlineshopping.trial.TrialApplication;
//import com.onlineshopping.trial.model.Customers;
//import com.onlineshopping.trial.repositories.CustomersRepository;
//import com.onlineshopping.trial.service.impl.CustomerServiceImpl;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import java.util.UUID;
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,classes = TrialApplication.class)
//@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:application-test.properties")
//public class CustomerServiceImplTest {
//    @Autowired
//    CustomerServiceImpl customerService;
//    Customers addCustomer;
//    Customers testCustomer = new Customers(UUID.randomUUID(),"Masaka","Ruzindaza");
//
//    @BeforeEach
//    void setUp() {
//    }
//    @AfterEach
//    void tearDown() {
//    }
//    @Test
//    public void testAddCustomer() {
//        addCustomer = customerService.createCustomer(testCustomer);
//        Assertions.assertNotNull(addCustomer);
//    }
