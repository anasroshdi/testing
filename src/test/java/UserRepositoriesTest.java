import org.example.vois.model.User;
import org.example.vois.repositories.UserRepositories;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class UserRepositoriesTest {

    @Autowired
    private TestEntityManager entityManager; // For direct entity manipulation in tests

    @Autowired
    private UserRepositories userRepository; // The repository being tested

//    @Test
//    void shouldFindUserByEmail() {
//        // Given
//        User user = new User("Jane Doe", "jane.doe@example.com");
//        entityManager.persist(user); // Save using TestEntityManager
//        entityManager.flush();
//
//        // When
//        Optional<User> foundUser = userRepository.findByEmail("jane.doe@example.com");
//
//        // Then
//        assertThat(foundUser).isPresent();
//        assertThat(foundUser.get().getName()).isEqualTo("Jane Doe");
//    }
}








