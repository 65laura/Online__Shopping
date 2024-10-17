//import com.onlineshopping.trial.TrialApplication;
//import com.onlineshopping.trial.controller.UserController;
//import com.onlineshopping.trial.model.User;
//import com.onlineshopping.trial.repositories.UserRepository;
//import com.onlineshopping.trial.service.UserService;
//import com.onlineshopping.trial.service.impl.UserServiceImpl;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,classes = TrialApplication.class)
//@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:application-test.properties")
// public class UserServiceImplTest {
//    @Autowired
//    UserServiceImpl userService;
//    @Autowired
//    UserRepository userRepository;
//    User addedUser;
//    User testUser = new User(UUID.randomUUID(),"xyz@gmail.com","laura");
//
//    @BeforeEach
//    void setUp() {
//    }
//    @AfterEach
//    void tearDown() {
//    }
//    @Test
//   public void testAddUser() {
//        addedUser = userService.createUser(testUser);
//        Assertions.assertNotNull(addedUser);}
//    @Test
//   public void testDeleteUser(){
//        UUID userId = testUser.getUserId();
//        Optional<User> user = userRepository.getSingleUserById(UUID.randomUUID());
//        if(user.isPresent())
//        {
//            ResponseEntity<String> response = userService.deleteUser(user.get().getUserId());
//            assertEquals("Successfully deleted user", response);
//        }
//    }
//
//    }
//
//
