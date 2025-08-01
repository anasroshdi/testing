import org.example.vois.model.User;
import org.example.vois.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(User.class) // Specify the controller to test
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean // Mock the service layer dependency
    private UserService userService;

//    @Test
//    void shouldReturnUserById() throws Exception {
//        User user = new User("John Doe", "jane.doe@example.com");
//        when(userService.findById(1L)).thenReturn(user);
//
//        mockMvc.perform(get("/users/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name").value("John Doe"));
//    }
}
